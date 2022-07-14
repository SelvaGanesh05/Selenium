package org.pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {

	public static WebDriver driver;
	static Actions a;
	static Robot r;
	static Alert al;
	static   Select s ;
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void launchTitle() {
		String str = driver.getTitle();
		System.out.println(str);
	}

	public static void launchCurrentUrl() {
		String str = driver.getCurrentUrl();
		System.out.println(str);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void Debug(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void fillValue(WebElement e, String s) {

		e.sendKeys(s);
	}

	public static void clickBtn(WebElement c) {
		c.click();

	}

	public static void getText(WebElement g) {
		g.getText();

	}

	public static void doubleClick(WebElement d) {
		a = new Actions(driver);
		a.doubleClick(d).perform();
	}

	public static void contextClick(WebElement c) {
		a.contextClick(c).perform();
	}

	public static void moveToElement(WebElement w) {
		a.moveToElement(w).perform();
	}

	public static void dragDrop(WebElement d, WebElement s) {
		a.dragAndDrop(d, s).perform();

	}

	public static void downbtn() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enterbtn() {

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tabBtn() {

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void upBtn() {

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void pasteBtn() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void alertACCEPT() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void alertDismiss() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alertSendkeys(String s) {
		al = driver.switchTo().alert();
		al.sendKeys(s);
	}

	public static void alertGetText(String s) {
		al = driver.switchTo().alert();
		al.getText();

	}
	
	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
	}
	
	public static void selectClass(WebElement w) {

         s = new Select(w);

		}
	
	public static void selectByVisibleText(String st) {
		
		s.selectByVisibleText(st);
		
	}
	
	
	public static void dateAndTime() {
		Date d = new Date();
		System.out.println(d);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
