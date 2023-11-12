package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidebarLocators extends Parent {
    public SidebarLocators() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    //US-001 **********************************************
    @FindBy(xpath = "(//span[text()='Human Resources'])[1]")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanSetup;
    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement humanPositionCategories;

    //US-002 **********************************************
    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement humanAttestations;

    //US-003 **********************************************
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;

    //US-004 **********************************************
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement humanPosition;
    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;
    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccounts;
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positionsBtn;
    @FindBy(xpath = "(//span[text()='Education'])[1]")
    public WebElement educationButton;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement educationSetup;
    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    public WebElement subjectCategories;
    @FindBy(xpath = "//*[contains(text(),'School Setup')]")
    public WebElement schoolSetup;
    @FindBy(xpath = "//*[contains(text(),'Departments')]")
    public WebElement schoolSetupDepartments;
    @FindBy(xpath = "//*[contains(text(),'Locations')]")
    public WebElement schoolSetupLocations;
    @FindBy(xpath = "(//*[contains(text(),'Grade Levels')])[1]")
    public WebElement gradeLevels;
    @FindBy(xpath = "(//*[contains(text(),'Discounts')])[1]")
    public WebElement discounts;
    @FindBy(xpath = "(//*[contains(text(),'Nationalities')])[1]")
    public WebElement nationalities;

    public WebElement getWebElement(String target) {
        switch (target) {
            case "setup": return this.setup;
            case "humanResources": return this.humanResources;
            case "humanSetup": return this.humanSetup;
            case "humanPositionCategories": return this.humanPositionCategories;
            case "humanAttestations": return this.humanAttestations;
            case "parameters": return this.parameters;
            case "documentTypes": return this.documentTypes;
            case "humanPosition": return this.humanPosition;
            case "fields": return this.fields;
            case "bankAccounts": return this.bankAccounts;
            case "positionsBtn": return this.positionsBtn;
            case "educationButton": return this.educationButton;
            case "educationSetup": return this.educationSetup;
            case "subjectCategories": return this.subjectCategories;
            case "schoolSetup": return this.schoolSetup;
            case "schoolSetupDepartments": return this.schoolSetupDepartments;
            case "schoolSetupLocations": return this.schoolSetupLocations;
            case "gradeLevels": return this.gradeLevels;
            case "discounts": return this.discounts;
            case "nationalities": return this.nationalities;
        }
        return null;
    }
}
