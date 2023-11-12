package StepDefinitions;

import Pages.ModalMenuLocators;
import Pages.SidebarLocators;
import Utilities.ExcelManager;
import Utilities.Singleton_Driver;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestScenarioSteps {
    ModalMenuLocators ml = new ModalMenuLocators();
    SidebarLocators sl = new SidebarLocators();

    @Given("The user navigate to website")
    public void theUserNavigateToWebsite() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }

    @Given("The user logs in with the data received from Excel")
    public void theUserNavigateToWebsiteAndLoginProcess(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            int columnCount = Integer.parseInt(elementLinks.get(i).get(1));

            ArrayList<ArrayList<String>> tablo = ExcelManager.getData("src/test/java/ExcelFiles/LoginInfo.xlsx",
                    elementLinks.get(i).get(0), columnCount);

            for (ArrayList<String> satir : tablo) {
                ml.inputElement(ml.username, satir.get(0));
                ml.inputElement(ml.password, satir.get(1));
                ml.elementToClick(ml.loginButton);
                if (columnCount > 2) {
                    WebElement verifyElements = ml.getWebElement(satir.get(2));
                    ml.textVerifyResult(verifyElements, satir.get(3));
                }
            }
        }
    }

    @When("The user sending the keys in the ModalMenuLocators")
    public void theUserEntersTheDataIntoTheRelevantSection(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = ml.getWebElement(elementLinks.get(i).get(0));
            ml.inputElement(sendKeysElements, elementLinks.get(i).get(1));
        }
    }

    @Then("The user click on the element in ModalMenuLocators")
    public void theUserClicksOnTheRelevantElement(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);
        }
    }

    @And("The message should be displayed")
    public void theUserConfirmsTheConfirmationMessage(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement verifyElements = ml.getWebElement(elementLinks.get(i).get(0));
            ml.textVerifyResult(verifyElements, elementLinks.get(i).get(1));
        }
    }

    @When("The user click on the element in SidebarLocators")
    public void theUserClickOnTheElementInSidebarLocators(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = sl.getWebElement(elementLinks.get(i));
            sl.elementToClick(clickedElements);
        }
    }

    @When("The user delete on the item in ModalMenuLocators")
    public void theUserDeleteOnTheItemInModalMenuLocators(DataTable tableData) {
        List<String> itemsToRemove = tableData.asList(String.class);
        for (int i = 0; i < itemsToRemove.size(); i++) {
            ml.deleteItem(itemsToRemove.get(i));
        }
    }

    @And("Delayed click on edit button")
    public void delayedClickOnEditButton(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.conditionWait.until(ExpectedConditions.elementToBeClickable(
                    ml.getWebElement("searchButton")));
            ml.elementToClick(clickedElements);
        }
    }

    @And("Pressing ESC")
    public void pressToESC() {
        new Actions(Singleton_Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    @Then("Adding New Fields to the Admin Panel")
    public void addingNewFieldsToTheAdminPanel(DataTable tableData) throws InterruptedException {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);

            if (elementLinks.get(i).equals("listOfValueOption")) {
                ml.inputElement(ml.getWebElement("key"), "123");
                ml.inputElement(ml.getWebElement("value"), "321");
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            } else if (elementLinks.get(i).equals("compositeOption")) {
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
                ml.conditionWait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//ms-dialog//button[@color='warn'])")));
                ml.elementToClick(ml.getWebElement("childFieldsDeleteButton"));
                ml.elementToClick(ml.getWebElement("deleteButton"));
                ml.elementToClick(ml.getWebElement("childFieldSelect"));
                ml.elementToClick(ml.childFieldOption.get(0));
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            }
        }
    }

    @Then("Editing Fields to the Admin Panel")
    public void editingFieldsToTheAdminPanel(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);

            if (elementLinks.get(i).equals("listOfValueOption")) {
                ml.inputElement(ml.getWebElement("key"), "321");
                ml.inputElement(ml.getWebElement("value"), "123");
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            } else if (elementLinks.get(i).equals("compositeOption")) {
                ml.conditionWait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//ms-dialog//button[@color='warn'])")));
                ml.elementToClick(ml.getWebElement("childFieldsDeleteButton"));
                ml.elementToClick(ml.getWebElement("deleteButton"));
                ml.elementToClick(ml.getWebElement("childFieldSelect"));
                ml.elementToClick(ml.childFieldOption.get(1));
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            }
        }
    }

    @Then("The user adds data named {string} to the relevant section")
    public void theUserAddsDataNamedToTheRelevantSection(String name) {
        ml.addItem(name);
    }

    @When("The user replaces the data named {string} with the data named {string} in the relevant section")
    public void theUserReplacesTheDataNamedWithTheDataNamedInTheRelevantSection(String name, String newName) {
        ml.editItem(name, newName);
    }

    @And("The user deletes the data named {string} in the relevant section")
    public void theUserDeletesTheDataNamedInTheRelevantSection(String newname) {
        ml.deleteItem(newname);
    }

    @When("User data sent to ModalMenuLocators will be generated using JavaFaker")
    public void UserDataSentToModalMenuLocatorsWillBeGeneratedUsingJavaFaker(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = ml.getWebElement(elementLinks.get(i).get(0));
            Faker faker = new Faker();
            String randomNumbers;
            if (elementLinks.get(i).get(1).equals("fullName")) {
                ml.fakeName = faker.name().fullName();
                ml.inputElement(sendKeysElements, ml.fakeName);
            } else if (elementLinks.get(i).get(1).equals("IBAN")) {
                randomNumbers = faker.number().toString();
                ml.inputElement(sendKeysElements, randomNumbers);
            } else if (elementLinks.get(i).get(1).equals("fullNameSearch")) {
                ml.inputElement(sendKeysElements, ml.fakeName);
            }
        }
    }

    @When("The user deletes an item in ModalMenuLocators, generated using JavaFaker")
    public void theUserDeleteOnTheItemInModalMenuLocatorsgeneratedUsingJavaFaker() {
        ml.deleteItem(ml.fakeName);
    }

    @Then("Delayed click on delete button")
    public void delayedClickOnDeleteButton(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        ml.conditionWait.until(ExpectedConditions.invisibilityOf(
                ml.getWebElement("successMessage")));
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);
        }
    }
}
