package package3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {


	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement clickDresses;
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement newsletter;
	@FindBy(xpath="//button[@class='btn btn-default button button-small']")
	private WebElement submitnewsletter;
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement alertsuccess;
	@FindBy(xpath="alert alert-danger")
	private WebElement alertdanger;
	
	
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement women() {
		return women;
	}
	public WebElement Dresses() {
		return Dresses;
		
	}
	public WebElement Tshirts() {
		return Tshirts;
		
	}
	public WebElement newsletter() {
		return newsletter;
	}
	public WebElement submitbutton() {
		submitnewsletter.click();
		return submitnewsletter;
	}
	public WebElement subcriptionmsg() {
		return alertsuccess;
	}
	public WebElement subfailmsg() {
		return alertdanger;
	}
	public void submitemail(String email) {
		newsletter.sendKeys(email+Keys.ENTER);
	}
	
	public void clickDresses() {
		clickDresses.click();
	
	}

	
}
