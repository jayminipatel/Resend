package pages;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
    WebDriver driver;
    Utils utils;
    //Create Page object
    By RegisterLink = By.className("ico-register");
    By GenderLink = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirthDay = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By company = By.id("Company");
    By pass = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    //Create Constructor

    public RegPage (WebDriver driver){
        this.driver= driver;
        utils = new Utils(driver);

    }
    //Page Actions
    public void clickRegisterLink (){ utils.doClick(RegisterLink);

    }
    public void registerDetails(String FirstName,String LastName,String DateOfBirthDay,String dateOfMonth,String dateOfYear,String Email,String companyName,String Password,String ConfirmPassword){
        utils.doClick(GenderLink);
        utils.doSendKey(firstName,FirstName);
        utils.doSendKey(lastName,LastName);
        utils.doSendKey(dateOfBirthDay,DateOfBirthDay);
        utils.doSendKey(dateOfBirthMonth,dateOfMonth);
        utils.doSendKey(dateOfBirthYear,dateOfYear);
        utils.doSendKey(email,Email);
        utils.doSendKey(company,companyName);
        utils.doSendKey(pass,Password);
        utils.doSendKey(confirmPassword,ConfirmPassword);
        utils.doClick(registerButton);


    }

}
