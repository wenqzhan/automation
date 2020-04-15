package com.utils.poi;

import cn.hutool.poi.excel.ExcelReader;
import com.utils.log.LoggerController;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.utils.print.PrintList.printList;
import static com.utils.print.PrintList.printObject;

public class Excel {
    private static final LoggerController log = LoggerController.getLogger(Excel.class);

    public static Workbook decryptWorkbook(String excelPath, String password) {
        //String excelPath = "Excel文件路徑";
        //String password = "Excel文件密碼";

        Workbook workbook = null;
        InputStream inp = null;

        try {
            inp = new FileInputStream(excelPath);
        } catch (FileNotFoundException e) {
            log.error("找不到excel文件");
            e.printStackTrace();
        }

        org.apache.poi.hssf.record.crypto.Biff8EncryptionKey
                .setCurrentUserPassword(password);
        try {
            workbook = WorkbookFactory.create(inp);
        } catch (IOException e) {
            log.error("IOException1");
            e.printStackTrace();
        }
        //file.getInputStream().close();

        try {
            inp.close();
        } catch (IOException e) {
            log.error("IOException2");
            e.printStackTrace();
        }


        //解密

//        POIFSFileSystem pfs = null;
//        try {
//            pfs = new POIFSFileSystem(inp);
//        } catch (IOException e) {
//            log.error("IOException1");
//            e.printStackTrace();
//        }
//
//        EncryptionInfo encInfo = null;
//        try {
//            encInfo = new EncryptionInfo(pfs);
//        } catch (IOException e) {
//            log.error("IOException3");
//            e.printStackTrace();
//        }
//        Decryptor decryptor = Decryptor.getInstance(encInfo);
//        try {
//            decryptor.verifyPassword(password);
//        } catch (GeneralSecurityException e) {
//            log.error("GeneralSecurityException1");
//            e.printStackTrace();
//        }
//        try {
//            workbook = new XSSFWorkbook(decryptor.getDataStream(pfs));
//        } catch (IOException e) {
//            log.error("IOException4");
//            e.printStackTrace();
//        } catch (GeneralSecurityException e) {
//            log.error("GeneralSecurityException2");
//            e.printStackTrace();
//        }

        return workbook;
    }




    public static List<List<String>> getExcel(String excelPath, String password) {
        //Excel(org.apache.poi.ss.usermodel.Workbook book, int sheetIndex)
        Workbook workbook = decryptWorkbook(excelPath, password);
        ExcelReader excelReader = new ExcelReader(workbook, "导出信息");

        List<List<Object>> read = excelReader.read(2, excelReader.getRowCount());

        List<List<String>> list = new ArrayList<>();
        read.get(0).add(0, "No.");
        for (int i = 1; i < read.size(); i++) {
            read.get(i).add(0, String.valueOf(i));
        }

        for (int i = 0; i < read.size(); i++) {
            List<String> list1 = new ArrayList<>();
            for (int j = 0; j < read.get(i).size(); j++) {

                String str = String.valueOf(read.get(i).get(j)).replaceAll("\\s{1,}", " ");
                String ntr = ("A" + str).trim().substring(1);
                list1.add(ntr);
            }
            list.add(list1);
        }

        printList(list);

        return list;
    }


}
