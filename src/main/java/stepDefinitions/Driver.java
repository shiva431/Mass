package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.BalanceSheetPage;

public class Driver {

	public static WebDriver driver;
	public static BalanceSheetPage page;

	@Given("^Open the chrome browser and go to balance sheet page$")
	public void open_the_chrome_browser_and_go_to_balance_sheet_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shiva/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.exercise.com/values");
		page = new BalanceSheetPage(driver);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
