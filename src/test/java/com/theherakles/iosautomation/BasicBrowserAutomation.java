package com.theherakles.iosautomation;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicBrowserAutomation {

  @Test
  public void testSafariBrowser() throws InterruptedException, MalformedURLException {
  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

  desiredCapabilities.setCapability("platformName","iOS");
  desiredCapabilities.setCapability("appium:platformVersion", "15.4");
  desiredCapabilities.setCapability("appium:deviceName","iPhone SE");
  desiredCapabilities.setCapability("browserName", "Safari");
  desiredCapabilities.setCapability("appium:automationName", "XCUITest");
  desiredCapabilities.setCapability("appium:udid", "9C62214C-2124-4BC0-AC33-042A2755ED45");

    AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

  Thread.sleep(2000);

  driver.get("http://keyacademy.kicchi.net");

  WebElement createAccount = driver.findElement(By.xpath("//*[.='CREATE AN ACCOUNT']"));
    createAccount.click();

  Thread.sleep(5000);

  driver.close();

  }

  @Test
  public void testSafariBrowser2() throws InterruptedException, MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    desiredCapabilities.setCapability("platformName","iOS");
    desiredCapabilities.setCapability("appium:platformVersion", "15.4");
    desiredCapabilities.setCapability("appium:deviceName","iPhone SE");
    desiredCapabilities.setCapability("browserName", "Safari");
    desiredCapabilities.setCapability("appium:automationName", "XCUITest");
    desiredCapabilities.setCapability("appium:udid", "9C62214C-2124-4BC0-AC33-042A2755ED45");

    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

    Thread.sleep(2000);

    driver.get("http://keyacademy.kicchi.net");

    WebElement createAccount = driver.findElement(By.xpath("//*[.='CREATE AN ACCOUNT']"));
    createAccount.click();

    Thread.sleep(5000);

    driver.close();

  }

  @Test
  public void testDesktopSafari() throws Exception{
    WebDriverManager.getInstance(SafariDriver.class).setup();
    WebDriver driver = new SafariDriver();
    driver.get("http://keyacademy.kicchi.net");
    WebElement createAccount = driver.findElement(By.xpath("//*[.='CREATE AN ACCOUNT']"));
    createAccount.click();

    Thread.sleep(5000);

    driver.close();

  }

}
