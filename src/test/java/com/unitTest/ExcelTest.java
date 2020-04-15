package com.unitTest;

import com.utils.poi.Excel;
import org.testng.annotations.Test;

public class ExcelTest {

    @Test
    public void ttttt() {
        String excelPath = "D:\\ChromeDownload\\客户调整历史_2020-04-07.xls";
        String password = "999999";
        Excel.getExcel(excelPath, password);
    }
}
