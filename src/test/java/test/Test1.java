package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    public WebDriver driver;

    @Before
    public void setUpDataBase(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
   }

    @After
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void testMethod1() {
        driver.get("http://google.com.ua/");
        driver.manage().window().maximize();
        System.out.println("Class 1, test 1 executed");
    }

    @Test
    public void testMethod2() {
        driver.get("http://google.com.ua/");
        driver.manage().window().maximize();
        System.out.println("Class 1, test 2 executed");
    }



}

