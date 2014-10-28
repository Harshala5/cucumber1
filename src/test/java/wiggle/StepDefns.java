package wiggle;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;



public class StepDefns {
   /* public WebDriver driver;

    @Before
    public void startBrowser(){

        System.out.println("Opening the browser.....");
        driver= new FirefoxDriver();
        //pre-steps

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.wiggle.co.uk/secure/myaccount/logon?returnurl=%2F");
        driver.manage().window().maximize();


    }

   @After
    public void stopBrowser() {

       System.out.println("Closing the browser....");
       driver.quit();
  }

    @Given("^I am on the wiggle login page$")
    public void I_am_on_the_wiggle_login_page() {
    System.out.println("Doing........I am on the wiggle login page");
     Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Log In or Register"));

}

    @When("^I am sign in with the email and password$")
    public void i_am_sign_in_with_the_email_and_password() {
    System.out.println("Doing........I am sign in with the email and password ");
    driver.findElement(By.id("LogInOptionMirror")).click();
    driver.findElement(By.id("LogOnModel_UserName")).sendKeys("tester@test13.com");
    driver.findElement(By.id("LogOnModel_Password")).sendKeys("Password123");
    driver.findElement(By.xpath("//*[@id=\"LogInForm\"]/form/div[1]")).click();
    }

    @Then("^I should be logged in$")
    public void I_should_be_logged_in()  {
        System.out.println("Doing........I should be logged in ");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      Assert.assertTrue(driver.findElement(By.linkText("Sign out")).isDisplayed());

    }

   @When("^I am sign in with the email \"(.*?)\" and password \"(.*?)\"$")
   public void i_am_sign_in_with_the_email_and_password(String email, String pwd) {
       System.out.println("Doing.......I should be  trying to login with email as "+email+" and password as " +pwd);
       driver.findElement(By.id("LogInOptionMirror")).click();
       driver.findElement(By.id("LogOnModel_UserName")).sendKeys(email);
       driver.findElement(By.id("LogOnModel_Password")).sendKeys(pwd);
       driver.findElement(By.xpath("//*[@id=\"LogInForm\"]/form/div[1]")).click();


    }
    @Then("^I should see the message \"(.*?)\"$")
    public void i_should_see_the_message (String message){
        System.out.println("Doing.....I should be able to see the message as " +message);
       Assert.assertEquals(message,"Sorry we could not log you in");

    }*/

}
