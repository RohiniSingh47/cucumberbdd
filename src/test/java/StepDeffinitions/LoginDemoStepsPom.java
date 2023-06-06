/*
package StepDeffinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class LoginDemoStepsPom {

    WebDriver driver = null;
    LoginPage login;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println(" === I am inside browser_is_open  =====");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_username_and_password(String username, String password) throws Throwable {
        login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws Throwable {
        //login.clickLogin();
        assertFalse(login.checkLogOutIsDisplayed());
        login.clickLogin();
        Thread.sleep(2000);
        driver.close();
    }
    @And("user clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();

    }

}



*/
