package com.utils.file;

import com.utils.log.LoggerController;
import org.testng.annotations.Test;

import java.io.File;

public class MyFile {

    final static LoggerController log = LoggerController.getLogger(MyFile.class);

    public static boolean fileExist(String filePath) {
        return new File(filePath).exists();
    }

    //先判断文件是否存在，没有就创建文件还需要改
    public static void createFolder(String path) {
        String[] paths = splitPaths(path);
        for (int i = 0; i < paths.length; i++) {
            if (!MyFile.fileExist(paths[i])) {
                File file = new File(paths[i]);
                file.mkdir();
                log.info("new folder successful"+":"+paths[i]);
            }
        }
    }

    //删除目录以及目录下所有的文件和文件夹
    public static void deleteDirectory(String directoryPath) {
        File file = new File(directoryPath);
        //文件是文件夹
        if (file.isDirectory()) {
            File file1 = null;
            //获取该目录下的子文件和文件夹
            String[] childFiles = file.list();
            for (String s : childFiles) {
                //检查foldPath是否是以“\”结尾

                if (directoryPath.endsWith((File.separator))) {
                    file1 = new File(directoryPath + s);
                } else {
                    file1 = new File(directoryPath + File.separator + s);
                }
                //判定是否是文件
                if (file1 != null && file1.isFile()) {
                    file1.delete();
                    file1.getAbsolutePath();
                } else if (file1 != null && file1.isDirectory()) {   //是文件夹
                    deleteDirectory(file1.getAbsolutePath());
                }
            }
            file.delete();
        } else if (file.isFile()) {
            file.delete();
        }
    }

    public static String[] splitPaths(String str) {
        String[] split = str.split("\\\\|/");
//        for (String s : split) {
//            System.out.println(s);
//        }
        String[] paths = new String[split.length - 1];
        paths[0] = split[0] + "\\" + split[1];
        for (int i = 1; i < paths.length; i++) {
            paths[i] = paths[i - 1] + "\\" + split[i + 1];

        }
//        for (String s : paths) {
//            System.out.println(s);
//        }

        return paths;
    }


    @Test
    public void test() {

        //splitPaths("E:\\fdff\\1\\pppp\\000");
        createFolder("E:\\fdff3\\1\\pppp\\000/88998/0099");
        deleteDirectory("E:\\fdff");
    }

}
