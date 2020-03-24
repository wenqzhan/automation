package com.utils.screenshot;
import com.driver.$;
import com.utils.date.DateFormat;
import com.utils.file.MyFile;
import com.utils.log.LoggerController;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;
public class Screenshot extends $ {
    private  static final LoggerController log = LoggerController.getLogger(Screenshot.class);
    private static String path = System.getProperties().getProperty("user.dir") + "\\error\\";
    /**
     * 错误截图，通过日期命名的截图
     **/
    public static void screenShot() {

        screenshot("");
    }
    /**
     * 错误截图,通过传入name来给截图命名
     **/
    public static void screenshot(String name) {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File file = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        try {
            MyFile.createFolder(path + DateFormat.format(DateFormat.CHECK_LOG_FORMAT));
            //log.info(DateFormat.format(DateFormat.ZH_DATE_FORMAT));
            FileUtils.copyFile(file,new File(path + DateFormat.format(DateFormat.CHECK_LOG_FORMAT) + "/" + name +DateFormat.format(DateFormat.REPORT_CSV_FORMAT)+"_"+ DateFormat.time() + ".jpg"));

        } catch (IOException e) {
            log.error("截图失败！！");
            e.printStackTrace();
        }
        log.info("截图成功");

    }

    //**
     /* 判断文件夹，没有就新建
    / */
/*    public static void fileExists() {
        String fileName = DateUtil.format(DateUtil.CHECK_LOG_FORMAT);
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }*/


}
