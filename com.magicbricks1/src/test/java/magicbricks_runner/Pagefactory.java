package magicbricks_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Pagefactory {
WebDriver driver;
	
	@FindBy(id = "emailOrMobile")
	@CacheLookup
	WebElement email;
	
	@FindBy(id = "btnStep1")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement password1;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement login1;
	
	public Pagefactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement fieldUname(){
		return email;
		}
	
	
	public void setUname(String uname)
	{
	this.email.sendKeys(uname);
	
	}
	

	public WebElement loginField()
	   {
		return nextButton;
		}

		public void clickNext()
		{
		this.nextButton.click();
		}
		
		
		public WebElement fieldPassword(){
			return password1;
			}
		
		
		public void setPassword(String password)
		{
		this.password1.sendKeys(password);
		
		}
		
		
		public WebElement login1Field() 
		{
			return login1;
		}
		
		public void clickLogIn()
		{
			this.login1.click();
		}

}
