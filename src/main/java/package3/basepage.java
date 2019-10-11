package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	public static WebDriver driver;
	public String browser="chrome";
	public basepage() {
		if(driver==null) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome driver 76\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox")) {
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}

	public boolean elementfound(WebElement element) {
		boolean res=false;
		try {
			res=element.isDisplayed();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return res;
	}
	public void setText(WebElement element,String name) {
		if(name!=null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}
	public String getTxtAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	public String selectFromDropdown(WebElement element,String name) {
	       Select obj=new Select(element);
	       obj.selectByVisibleText(name);
	      return obj.getFirstSelectedOption().getText();
		
	}
	public boolean isElementvisible(WebElement element) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
public String getTitle(WebElement element) {
		
		return driver.getTitle();
		
		
	}
public String getTextOnly(WebElement element) {
	String text = element.getText();
	return text;
}
 
	 
	public void quitDriver() {
		driver.quit();
	}
	public boolean isElementSelected(WebElement element) {
		
		boolean res=false;
		try {
		res=element.isSelected();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return res;
	}
}
