package uk.axone.devintest.seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLauncher {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

         ChromeDriver cd = new ChromeDriver();
        //System.setProperty("")
       Thread.sleep(15000);
       cd.quit();

    }
}
