package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_pf {

    @FindBy(id="logout")
    WebElement btn_logout;

    WebDriver driver;

    public HomePage_pf(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,LoginPage_pf.class);
        PageFactory.initElements(driver,this);
    }
    public boolean checkLogoutIsDisplayed(){
        return btn_logout.isDisplayed();
    }
}

