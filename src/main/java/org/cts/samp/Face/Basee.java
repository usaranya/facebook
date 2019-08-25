package org.cts.samp.Face;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basee {
static WebDriver driver;

public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Face\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
}
public static void type(WebElement e,String name) {
	e.sendKeys(name);
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void btnClk(WebElement f) {
	f.click();
}
public static void quitBrowser() {
	driver.quit();
}
}
