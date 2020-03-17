package com.misc.matrix;


//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.io.IOException;


public class loginPage {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
           // matrixLogin(driver,"029523", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void elementClearAndSenKeys(WebElement element,String content){

        element.clear();
//        清除已有内容
        element.sendKeys(content);
//         输入内容
    }


    /*public static void matrixLogin(WebDriver driver, String userName, String password) throws AWTException,  NotActiveException {
        driver.get(remoteUrl);
//        driver = new ChromeDriver();


//        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
////        新建文件对象,将driver强转为截图
//        try {
//            FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
////            截图保存
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        for (int i = 1; ; i++) {


            if (i > 3) {
                System.out.println(i + " " + "failed");
                throw new NotActiveException("登录失败多次");
//             如果超过3次登录失败，报错

            }


//            for 循环的意思是如果登录失败，再次尝试登录
            WebElement element = locateElement(driver,loginPageCaptchaImage);
//            定位验证码
            if (i > 1) {
                System.out.println(i);
//                element.click();
            }
//            点击验证码
            File file1 = element.getScreenshotAs(OutputType.FILE);
//            获取验证码文件

        try {
            FileUtils.copyFile(file1, new File("D:/test1.png"));
//            截图保存
        } catch (IOException e) {
            e.printStackTrace();
        }
            file1 = new File("D:/test1.png");
            ITesseract instance = new Tesseract();
//            实例化ocr对象
            instance.setDatapath("D:\\tessdata");
//         设定语言包位置
            instance.setLanguage("eng");
//            验证比较简单，用英文包
            String captchaResult = instance.doOCR(file1).replaceAll("[^(0-9)]", "");
//            String captchaResult = "111";
            //                获取验证码

            element = locateElement(driver,loginPageUserNameInput);
//            定位用户名输入框
            elementClearAndSenKeys(element, userName);
////           清除已有内容 输入用户名
            element = locateElement(driver,loginPagePasswordInput);
//            定位密码输入框
            elementClearAndSenKeys(element,password);
//           清除已有内容 输入密码
            element = locateElement(driver,loginPageCaptchaInput);
//            定位验证码输入框
//            element.sendKeys("1111");
//        File newImage = new File("D:/test1.png");


//            String a = "1";
            elementClearAndSenKeys(element,captchaResult);
//         清除已有内容   输入验证码
//            System.out.println(result);

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
//            按下回车，弹起回车




            try {
                element = locateElement(driver,loginPageFailedInfo,1);
                System.out.println(element.getText());
                continue;
//                如果可以找到提示验证码输入错误的提示，重新开始循环
            } catch (Exception e) {
                System.out.println("logged in");
                break;
//                找不到提示，说明登录成功，跳出循环
            }

        }

    }*/
}
