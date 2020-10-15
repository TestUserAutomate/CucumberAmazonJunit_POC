package stepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class addToCartStepDefinition {
	WebDriver driver;
	
@Before	//Hooks
public void setup() {
	System.out.println("----------Test Started------------");
}


@Given("^user is on Amazon Home page$")
public void user_is_on_Amazon_Home_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","F:\\Selenium_Projects\\Driver\\chromedriver-86.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
}

@Then("^user clicks on textbox and enter - Apple Iphone$")
public void user_clicks_on_textbox_and_enter_Apple_Iphone() throws Throwable {
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Iphone");
	 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
}

@Then("^user clicks on a product under apple$")
public void user_clicks_on_a_product_under_apple() throws Throwable {
	driver.findElement(By.linkText("Apple iPhone 11 (128GB) - Black")).click();
}

@Then("^user clicks on textbox and enter - Oneplus$")
public void user_clicks_on_textbox_and_enter_Oneplus() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
}

@Then("^user clicks on a product under Oneplus$")
public void user_clicks_on_a_product_under_Oneplus() throws Throwable {
	driver.findElement(By.linkText("OnePlus Nord 5G (Blue Marble, 8GB RAM, 128GB Storage)")).click();
}

@Then("^user clicks on textbox and enter - Samsung$")
public void user_clicks_on_textbox_and_enter_Samsung() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
}

@Then("^user clicks on a product under Samsung$")
public void user_clicks_on_a_product_under_Samsung() throws Throwable {
	driver.findElement(By.linkText("Samsung Galaxy M21 (Midnight Blue, 4GB RAM, 64GB Storage)")).click();
}

@Then("^user clicks on textbox and enter - Honor$")
public void user_clicks_on_textbox_and_enter_Honor() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
}

@Then("^user clicks on a product under Honor$")
public void user_clicks_on_a_product_under_Honor() throws Throwable {
	driver.findElement(By.linkText("Nokia 105 2019 (Single SIM, Black)")).click();
}

@Then("^user clicks on textbox and enter - Redmi$")
public void user_clicks_on_textbox_and_enter_Redmi() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
}

@Then("^user clicks on a product under Redmi$")
public void user_clicks_on_a_product_under_Redmi() throws Throwable {
	driver.findElement(By.linkText("Redmi 8A Dual (Sea Blue, 2GB RAM, 32GB Storage) – Dual Cameras & 5,000 mAH Battery")).click();
}

@Then("^user adds the item to the cart$")
public void user_adds_the_item_to_the_cart() throws Throwable {
	Set<String> handler=driver.getWindowHandles();
	Iterator<String> it=handler.iterator();
	it.next();
	String nextWindow=it.next();
	driver.switchTo().window(nextWindow);
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.close();
	driver.quit();
}

@After	//Hooks
public void teardown() {
System.out.println("----------Test Ended------------");
}

}
