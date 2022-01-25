package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(linkText="Services")
    public WebElement servicesButton;

    @FindBy(linkText="Departments")
    public WebElement departmentsButton;

    @FindBy(xpath=" (//*[@class='list ma0 pa0 pb3'])[2]/li")
    public List<WebElement> servicesList;

    @FindBy(xpath=" (//*[@class='list ma0 pa0 pb3'])[1]/li")
    public List<WebElement> departmentsList ;

    @FindBy (xpath = "(//button[@type='button'])[8]")
    public WebElement babyElement;

    @FindBy (linkText = "Give feedback")
    public WebElement feedBackButton;

    @FindBy(xpath="(//*[@class='b'])[1]")
    public WebElement myItemsButton ;

    @FindBy(xpath="(//*[@class='b'])[2]")
    public WebElement signInButton ;









}
