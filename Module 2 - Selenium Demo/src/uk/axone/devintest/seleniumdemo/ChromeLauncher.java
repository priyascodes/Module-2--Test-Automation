package uk.axone.devintest.seleniumdemo;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLauncher {
    @Test
    public void chromeLauncher() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver cd = new ChromeDriver();
        cd.get("https://www.google.co.uk/");
        Thread.sleep(15000);
        cd.quit();


    }
}
