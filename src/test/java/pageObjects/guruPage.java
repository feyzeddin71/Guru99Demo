package pageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.Map;

public class guruPage  {
    public guruPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;
    static Logger log = LogManager.getLogger(guruPage.class);




    @FindBy(xpath = "/html/body/div[2]/h2")
    public WebElement headText;

    public void loginPage(String strArg1) {
        //driver= driverUtils.initialiseDriver(driver,"chrome");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //driver.navigate().to("http://demo.guru99.com/V4/");

        //utils.commonUtilsNoel.takeAScreenshot(driver,"loginPage");

        log.info("user is on the login page" + headText.getText());
        Assert.assertTrue(headText.getText().contentEquals(strArg1));
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
    public WebElement username;
    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    public WebElement password;
    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    public WebElement loginButton;

    public void usernamePassword(String strArg1, String strArg2) {
        username.sendKeys(strArg1);
        password.sendKeys(strArg2);
        loginButton.click();

    }

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
    public WebElement textMangerId;

    public void loginDoneText(String strArg1) {

        //utils.commonUtilsNoel.getScreenshot(driver, "loginSucess");

        log.info(textMangerId.getText());
        Assert.assertTrue(textMangerId.getText().contentEquals(strArg1));

    }

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    public WebElement clickNewCust;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
    public WebElement addNewCusto;

    public void newCustomer() {

        clickNewCust.click();

        log.info(addNewCusto.getText());
        Assert.assertTrue(addNewCusto.getText().contentEquals("Add New Customer"));
    }

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement customer;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    public WebElement male;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
    public WebElement female;

    @FindBy(xpath = "//*[@id=\"dob\"]")
    public WebElement dateOfBirth;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
    public WebElement adress;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
    public WebElement city;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
    public WebElement state;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
    public WebElement pin;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
    public WebElement number;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
    public WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordd;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    public void fillCustomerInfo(Map<String, String> data){

        customer.sendKeys(data.get("Customer Name"));

        if(data.get("Gender").equalsIgnoreCase("male")){
            male.click();
        }
        else
         { female.click(); }

        dateOfBirth.sendKeys(data.get("Date of Birth"));
        adress.sendKeys(data.get("Adress"));
        city.sendKeys(data.get("City"));
        state.sendKeys(data.get("State"));
        pin.sendKeys(data.get("PIN"));
        number.sendKeys(data.get("Mobile Number"));
        email.sendKeys(data.get("E-mail"));
        passwordd.sendKeys(data.get("Password"));
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        submitButton.click();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[1]/td/p")
    public WebElement verifyAdded;

    public void registerSuccess(){

        log.info(verifyAdded.getText());
        Assert.assertTrue(verifyAdded.getText().contentEquals("Customer Registered Successfully!!!"));
        //utils.commonUtilsNoel.getScreenshot(driver,"CustomerRegistered");
    }

}
