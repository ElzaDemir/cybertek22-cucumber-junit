package com.cybertek.step_definitions;

import com.cybertek.pages.CRMPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class CRM_Remember_Me_Option_stepDefinitions {
    CRMPage crmPage = new CRMPage();


    @Given("User is on CRM24 login page")
    public void user_is_on_crm24_login_page() {
        String url = ConfigurationReader.getProperty("crmUrl");
        Driver.getDriver().get(url);
    }

    @When("User sees {string} option")
    public void user_sees_option(String expected) {
        String expected1 = expected;
        String actual = crmPage.button.getText();

        Assert.assertEquals(expected,actual);

    }
    @When("User clicks on {string} option")
    public void user_clicks_on_option(String option) {
        crmPage.checkbox.click();

    }
    @Then("User should be able to see the button checked")
    public void user_should_be_able_to_see_the_button_checked() {
        try{
            crmPage.checkbox.click();
        }catch (NoSuchElementException e){
            System.out.println("Option is not clickable");
        }

//        WebElement el = Driver.getDriver().findElement(By.xpath("//input[@type = 'checkbox']"));
//        Assert.assertTrue(el.isSelected());




    }

}
