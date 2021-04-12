package telecom.org;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import telecom.objectrepository.AddCustomerpage;
import telecom.resources.CommonActions;

public class AddCustom extends CommonActions{
	CommonActions c = new CommonActions();
	AddCustomerpage p = new AddCustomerpage();
	//Hooks h = new Hooks();

	
@Given("user click the Add customer button")
public void user_click_the_Add_customer_button() {
c.button(p.getCustomerButton());
}

@When("user enter the value credential in the boxes")
public void user_enter_the_value_credential_in_the_boxes() {
	c.button(p.getDoneButton());
	c.write(p.getFirstname(),"vignesh");
	c.write(p.getLastname(), "bg");
	c.write(p.getMail(),"bvg.vikie16@gmail.com");
	c.write(p.getAdrress(),"cuddalore");
	c.write(p.getNum(),"95846855" );
}
	
@When("user enter the value credential in the boxes {string},{string},{string},{string},{string}")
public void user_enter_the_value_credential_in_the_boxes(String firstname, String lastname, String email, String address, String phno) {
	c.write(p.getFirstname(),firstname);
	c.write(p.getLastname(), lastname);
	c.write(p.getMail(),email);
    c.write(p.getAdrress(), address);
    c.write(p.getNum(), phno);
   
}



@Then("user click submit button")
public void user_click_submit_button() {
	c.button(p.getSubmit());
	
   }
}

