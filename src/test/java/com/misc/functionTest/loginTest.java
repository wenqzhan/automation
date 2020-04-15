package com.misc.functionTest;

//import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


//import static com.misc.oldMatrix.LoginPage.matrixLogin;


public class loginTest {

    WebDriver driver;

    /*@Test(dataProvider = "dp")
    public void test001(String userName,String password) throws AWTException, NotActiveException, TesseractException, InterruptedException {

        matrixLogin(driver,userName,password);
//        登录账号
        if (isNotLeftMenuFormat(driver)) {
            changeMenuToLeft(driver, zuoCeCaiDan);
        }
//           选择左侧菜单，按回车
        Thread.sleep(3000);
        locateButtonAndNavigateTo(driver,huiYiHuoDongShengQin);
//        定位会议活动
    }*/




    @BeforeClass
    public void openBrowser() {
//        System.setProperty("webdriver.gecko.driver", "LogEventListener:\\driver\\geckodriver.exe");
////        指定驱动位置，这里使用的是绝对路径
//        System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        指定浏览器的位置
//        driver = new FirefoxDriver();
//         创建火狐浏览器驱动对象
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        访问测试页面

//        备注*临时处理方法,如果打开的都是同一个浏览器(比如火狐),这里就可以把新建浏览器对象放到这里
    }

    @AfterClass
    public void closeBrowser() {
//        driver.quit();
//        关闭网页驱动
    }

    @DataProvider
    public Object[][] dp(){
//        return new Object[][]{{"029527","123"}};
        return new Object[][]{{"029527","123"},{"admin","123"},{"qsp","123"}};
    }


}
