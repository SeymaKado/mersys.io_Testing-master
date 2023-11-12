package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class ModalMenuLocators extends Parent{
    public ModalMenuLocators() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);

    }
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[@class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    @FindBy(xpath = "//div[text()='Invalid username or password']")
    private WebElement invalidText;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement dialogCloseButton;
    @FindBy(xpath = "//button/span[contains(text(),'Delete')]")
    public WebElement deleteOkeyButton;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement orderInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME')]//input")
    private WebElement searchInput;
    @FindBy(xpath = "//div[@fxlayoutalign='center center']//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    private WebElement deleteIcon;
    @FindBy(xpath = "//button/span[contains(text(),'Delete')]")
    private WebElement deleteButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(css = "input[data-placeholder='IBAN']")
    private WebElement ibanInput;
    @FindBy(xpath = "((//mat-select[@role='combobox'])[3]//div)[3]")
    private WebElement currencyComboBox;
    @FindBy(xpath = "//mat-option[@role='option']")
    private WebElement EURO;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement GBP;
    @FindBy(xpath = "(//mat-option[@role='option'])[3]")
    private WebElement KGS;
    @FindBy(xpath = "(//mat-option[@role='option'])[4]")
    private WebElement KZT;
    @FindBy(xpath = "(//mat-option[@role='option'])[5]")
    private WebElement PKR;
    @FindBy(xpath = "(//mat-option[@role='option'])[6]")
    private WebElement TRY;
    @FindBy(xpath = "(//mat-option[@role='option'])[7]")
    private WebElement TZS;
    @FindBy(xpath = "(//mat-option[@role='option'])[8]")
    private WebElement USD;
    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stage;
    @FindBy(xpath="//span[text()=' Student Registration ']")
    private WebElement studentReg;
    @FindBy(xpath = "//span[text()=' Examination ']")
    private WebElement examination;
    @FindBy(xpath = "//span[text()=' Employment ']")
    private WebElement employment;
    @FindBy(xpath = "//span[text()=' Certificate ']")
    private WebElement certificate;
    @FindBy(xpath = "//span[text()=' Contract ']")
    private WebElement contract;
    @FindBy(xpath = "//span[text()=' Dismissal ']")
    private WebElement dismissal;
    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement description;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement fieldTypesOptions;
    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    private WebElement numberOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement textOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[3]")
    private WebElement integerOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[4]")
    private WebElement listOfValueOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[5]")
    private WebElement dateOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[6]")
    private WebElement logicalOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[7]")
    private WebElement memoFieldOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[8]")
    private WebElement compositeOption;
    @FindBy(css = "input[data-placeholder='Key']")
    private WebElement key;
    @FindBy(css = "input[data-placeholder='Value']")
    private WebElement value;
    @FindBy(css = "ms-button[icon='plus']>button")
    private WebElement compLovAddButton;
    @FindBy(xpath = "((//mat-select[@role='combobox'])[3]//div)[3]")
    private WebElement childFieldSelect;
    @FindBy(xpath = "//mat-option[@role='option']")
    public List<WebElement> childFieldOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement childFieldOption2;
    @FindBy(xpath = "(//ms-dialog//button[@color='warn'])")
    private WebElement childFieldsDeleteButton;
    @FindBy(xpath = "((//mat-select[@role='combobox'])[2]//div)[3]")
    private WebElement locationTypeSelect;
    @FindBy(xpath = "//mat-option[@role='option']")
    private WebElement locationTypeOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement locationTypeOption2;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacityInput;
    @FindBy(xpath = "//div[contains(text(),'#')]")
    private WebElement collocationButton;
    @FindBy(xpath = "//ms-dialog-content//button[@role='switch']")
    private WebElement inactivationButton;
    @FindBy(xpath = "((//mat-select[@role='combobox'])[2]//div)[3]")
    private WebElement nextGradeBox;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement gradeOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[4]")
    private WebElement gradeOption2;
    @FindBy(xpath = "//input[@data-placeholder='Max Application Count']")
    private WebElement maxAppCount;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement discountDescription;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement discountPriority;
    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement saveAndCloseButton;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'DESCRIPTION')]//input")
    private WebElement searchDescInput;
    public String fakeName;

    public WebElement getWebElement(String target) {
        switch (target) {

            case "addButton": return this.addButton;
            case "editButton": return this.editButton;
            case "deleteButton": return this.deleteButton;
            case "loginButton": return this.loginButton;
            case "searchButton": return this.searchButton;
            case "deleteOkeyButton": return this.deleteOkeyButton;
            case "dialogCloseButton": return this.dialogCloseButton;
            case "saveButton": return this.saveButton;
            case "nameInput": return this.nameInput;
            case "shortNameInput": return this.shortNameInput;
            case "username": return this.username;
            case "password": return this.password;
            case "txtTechnoStudy": return this.txtTechnoStudy;
            case "invalidText": return this.invalidText;
            case "successMessage": return this.successMessage;
            case "ibanInput": return this.ibanInput;
            case "currencyComboBox": return this.currencyComboBox;
            case "EURO": return this.EURO;
            case "GBP": return this.GBP;
            case "KGS": return this.KGS;
            case "KZT": return this.KZT;
            case "PKR": return this.PKR;
            case "TRY": return this.TRY;
            case "TZS": return this.TZS;
            case "USD": return this.USD;
            case "searchInput": return this.searchInput;
            case "stage": return this.stage;
            case "studentReg": return this.studentReg;
            case "examination": return this.examination;
            case "employment": return this.employment;
            case "certificate": return this.certificate;
            case "contract": return this.contract;
            case "dismissal": return this.dismissal;
            case "description": return this.description;
            case "codeInput": return this.codeInput;
            case "fieldTypesOptions": return this.fieldTypesOptions;
            case "numberOption": return this.numberOption;
            case "textOption": return this.textOption;
            case "integerOption": return this.integerOption;
            case "listOfValueOption": return this.listOfValueOption;
            case "dateOption": return this.dateOption;
            case "logicalOption": return this.logicalOption;
            case "memoFieldOption": return this.memoFieldOption;
            case "compositeOption": return this.compositeOption;
            case "key": return this.key;
            case "value": return this.value;
            case "compLovAddButton": return this.compLovAddButton;
            case "childFieldSelect": return this.childFieldSelect;
            case "childFieldsDeleteButton": return this.childFieldsDeleteButton;
            case "locationTypeSelect": return this.locationTypeSelect;
            case "locationTypeOption": return this.locationTypeOption;
            case "locationTypeOption2": return this.locationTypeOption2;
            case "capacityInput": return this.capacityInput;
            case "collocationButton": return this.collocationButton;
            case "deleteIcon": return this.deleteIcon;
            case "inactivationButton": return this.inactivationButton;
            case "nextGradeBox": return this.nextGradeBox;
            case "gradeOption": return this.gradeOption;
            case "gradeOption2": return this.gradeOption2;
            case "orderInput": return this.orderInput;
            case "maxAppCount": return this.maxAppCount;
            case "discountDescription": return this.discountDescription;
            case "discountPriority": return this.discountPriority;
            case "saveAndCloseButton": return this.saveAndCloseButton;
            case "searchDescInput": return this.searchDescInput;

        }
        return null;
    }
    public void deleteItem(String newName) {
        inputElement(searchInput, newName);
        elementToClick(searchButton);
        conditionWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        /** conditionWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//mat-progress-bar/*"), 0)); */
        // Sitedeki progress bar bazı sayfalarda pasif durumdadır. Aktif olması durumunda wait olarak kullanılması daha uygun olacaktır.

        elementToClick(deleteIcon);
        elementToClick(deleteButton);
    }
    public void editItem(String name,String newName) {
        inputElement(searchInput, name);
        elementToClick(searchButton);
        conditionWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        /** conditionWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//mat-progress-bar/*"), 0)); */
        // Sitedeki progress bar bazı sayfalarda pasif durumdadır. Aktif olması durumunda wait olarak kullanılması daha uygun olacaktır.

        elementToClick(editButton);
        inputElement(nameInput, newName);
        elementToClick(saveButton);
    }
    public void addItem(String name){
        elementToClick(addButton);
        inputElement(nameInput, name);
        elementToClick(saveButton);
    }
}
