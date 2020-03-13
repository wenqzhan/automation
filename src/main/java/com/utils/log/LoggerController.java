package com.utils.log;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerController {

    private static Logger logger = null;
    private static LoggerController logg = null;


    public static LoggerController getLogger(Class<?> T) {
        if (logger == null) {
            Properties props = new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filePath = path + "\\configs\\log4j.properties";
                InputStream inputStream = new FileInputStream(filePath);
                props.load(inputStream);
            } catch (IOException e) {
                //System.out.println("111111111");
                e.printStackTrace();

            }
            LogManager.resetConfiguration();
            PropertyConfigurator.configure(props);
            logger = Logger.getLogger(T);
            logg = new LoggerController();
        }

        return logg;
    }


    public static String getT() {
        StringBuilder stringBuilder = new StringBuilder();
        //String s = String.valueOf(Thread.currentThread().getStackTrace()[3]);
        for (int i =0; i <Thread.currentThread().getStackTrace().length; i++) {
            stringBuilder.append("\n" + "\t" + Thread.currentThread().getStackTrace()[i]);
//            if (!String.valueOf(Thread.currentThread().getStackTrace()[i]).contains("")) {
//                stringBuilder.append("\n" + "\t" + Thread.currentThread().getStackTrace()[i]);
//                //System.out.print("\n" + "\t" + Thread.currentThread().getStackTrace()[i]);
//
//            } else {
//                break;
//            }

        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }


    public void info(String msg) {
        logger.info(msg );
    }

    public void debug(String msg) {
        logger.debug(msg );
    }

    public void warn(String msg) {
        logger.warn(msg );
    }

    public void error(String msg) {
        logger.error(msg + "|" + getT());
    }

}
