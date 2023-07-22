package configuration;

import io.appium.java_client.android.AndroidDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.ObjectInputFilter;

public class Base {
    public static AndroidDriver driver;
    @BeforeClass
    public static void bb(){
        if (driver==null){
            driver=Config.setUp(ListDEV.PIXELNATIVE);

        }
    }
    @AfterClass
    public static void a() throws InterruptedException {
        Thread.sleep(1000);
        if (driver!=null){
         driver.quit();
        }
    }
}
