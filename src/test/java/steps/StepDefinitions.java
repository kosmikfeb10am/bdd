package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	WebDriver driver;

@Given("I open browser using url {string}")
public void i_open_browser_using_url(String url) {
	
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
}

@When("I enter text {string} in textbox using xpath {string}")
public void i_enter_text_in_textbox_using_xpath(String text, String xpath) {
	
	driver.findElement(By.xpath(xpath)).sendKeys(text);
   
}

@Then("I click button using xpath {string}")
public void i_click_button_using_xpath(String xpath) {
	
	driver.findElement(By.xpath(xpath)).click();
    
}

@Then("I validate the title to be {string}")
public void i_validate_the_title_to_be(String title) {
	
	
	Assert.assertEquals(title, driver.getTitle());
    
}

    

}
