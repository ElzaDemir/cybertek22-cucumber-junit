package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMPage {

    public CRMPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id="USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy (xpath = "//label[.='Remember me on this computer']")
    public WebElement button;

    @FindBy (xpath = "//input[@type = 'checkbox']")
    public WebElement checkbox;



}
