package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
    public class Driver {
        /*
        POM&#39;de Driver icin TestBase class&#39;ina extends etmek yerine
        Driver class&#39;indan static method&#39;lar kullanarak
        driver olusturup, ilgili ayarlarin yapilmasi
        ve en sonda driver&#39;in kapatilmasi tercih edilmistir.
        POM&#39;de Driver class&#39;indaki getDriver()&#39;nin obje olusturularak
        kullanilmasini
        engellemek icin
        Singleton pattern kullanimi benimsenmistir.
        Singleton Pattern : tekli kullanim, bir class&#39;in farkli class&#39;lardan
        obje olusturularak kullanimini engellemek icin kullanilir.
        Bunu saglamak icin yapmamiz gereken sey oldukca basit
        obje olusturmak icin kullanilan constructor&#39;i private yaptiginizda
        bsaka class&#39;larda Driver class&#39;indan obje olusturulmasi mumkun OLAMAZ
        */
        private Driver(){
        }
        static WebDriver driver;
        public static WebDriver getDriver(){
            if (driver==null) {
                switch (ConfigReader.getProperty("browser")){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driver=new SafariDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver=new FirefoxDriver();
                        break;
                    case "headless-chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver(new
                                ChromeOptions().setHeadless(true));
                        break;
                    default:
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                }
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            }
            return driver;
        }
        public static void closeDriver(){
            if (driver!=null){ // driver&#39;a deger atanmissa
                driver.close();
                driver=null;
            }
        }
    }
