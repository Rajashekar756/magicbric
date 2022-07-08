package magicbricks_step_definitions;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import magicbricks_runner.Pagefactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vastuservices {
	
	private WebDriver driver;
	private Pagefactory login;
	XSSFWorkbook wb;
	XSSFSheet sh;

	@Before
	public void openBrowser() throws Exception {
		// launching web browser....
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new Pagefactory(driver);
		driver.manage().window().maximize();

		login = PageFactory.initElements(driver, Pagefactory.class);

		// reading file from excel....

		FileInputStream fread = new FileInputStream("C:\\Users\\Rajashekar\\Desktop\\Sprint 2\\0707\\MagicBricks.xlsx");
		wb = new XSSFWorkbook(fread);

	} // using pagefactory file as reference....


	
	@Given("user is on home page")
	public void user_is_on_home_page() {

		System.out.println("user is on login page");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
		sh=wb.getSheet("TestData");
		
		login.setUname(sh.getRow(1).getCell(0).getStringCellValue());
		
		login.clickNext();
		
		login.setPassword(sh.getRow(1).getCell(1).getStringCellValue());
		
		login.clickLogIn();
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	}

	
	@When("I Click on the sell button")
	public void i_Click_on_the_sell_button() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()='Sell']")).click();	
	        driver.findElement(By.xpath("//a[contains(text(),'Post Property')] ")).click();
	        Set<String> winIds = driver.getWindowHandles();
	      //winIds = driver.getWindowHandles();

	        Iterator<String> it = winIds.iterator();

	        System.out.println("Total windows - "+ winIds.size());

	        it = winIds.iterator();

	        String magicbrick_window = it.next();

	        String popup_window = it.next();

	        System.out.println(magicbrick_window);

	        //System.out.println(privacy_policy_window);

	        driver.switchTo().window(popup_window);

	        Thread.sleep(2000);
	      
			if(driver.findElements(By.xpath("//a[@class='m-b2b-grid-pop__close']")).size() >0)
			{
				
				driver.findElement(By.xpath("//a[@class='m-b2b-grid-pop__close']")).click();
			}

		}
	@When("Click on the vastu services.")
	public void click_on_the_vastu_services() throws InterruptedException {
		System.out.println("Vastuservices page will be open");
		driver.findElement(By.xpath("//*[@id=\"headerDiv\"]/header/div/div[2]/ul/li[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Vastu Services']")).click();
        
	}

	@When("Click on to add to my ordres.")
	public void click_on_to_add_to_my_ordres() throws InterruptedException{
		System.out.println("Click the button Add to my orders");
		Thread.sleep(2000);
		String currentHandle= driver.getWindowHandle();
		driver.switchTo(2);
		String s = driver.getCurrentUrl();
		int i = driver.findElements(By.xpath("(//a[text()='Add to My Orders'])[1]")).size();
		driver.findElement(By.xpath("(//a[text()='Add to My Orders'])[1]")).click();
	  //(//*[text()='Add to My Orders'])[1]")
	}

	@Then("Click on go to cart.")
	public void click_on_go_to_cart() {
		System.out.println("Click the button go to cart");
		   driver.findElement(By.xpath("//*[text()='Go TO CART']")).click();
	}

	@Then("Click on payment.")
	public void click_on_payment() {
		System.out.println("payment page will be open");
		driver.findElement(By.xpath("//*[text()='Proceed to Payment']")).click();
	}



}
