package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

    private WebDriver driver;
//setup textbox test
    private By textBoxLink = By.id("item-0");
    private By fullNameTextBox = By.id("userName");
    private By emailTextBox = By.id("userEmail");
    private By currentAddressTextBox = By.id("currentAddress");
    private By permanentAddressTextBox = By.id("permanentAddress");
    private By submitButton = By.id("submit");
//setup checkbox test
    private By checkBoxLink = By.id("item-1");
    private By expandArrow = By.xpath("//button[@class='rct-collapse rct-collapse-btn']");
    private By checkBoxDesktop = By.xpath("//label[@for='tree-node-desktop']");
    private By resultText = By.id("result");
//setup webtables test
    private By webTablesLink = By.id("item-3");
    private By editIconSecondRow = By.id("edit-record-2");
    private By firstNameBox = By.id("firstName");
    private By lastNameBox = By.id("lastName");
    private By emailBox = By.id("userEmail");
    private By ageBox = By.id("age");
    private By salaryBox = By.id("salary");
    private By departmentBox = By.id("department");
    private By submitAfterEdit = By.id("submit");
    private By deleteButtonInThirdRow = By.id("delete-record-3");
    private By addButton = By.id("addNewRecordButton");
//setup upload test
    private By uploadAndDownloadLink = By.id("item-7");
    private By chooseFileButton = By.id("uploadFile");

    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public ElementsPage clickTextBox(){
        driver.findElement(textBoxLink).click();
        return new ElementsPage(driver);
    }

    public void sendFullNameKeys(String fullName){
        driver.findElement(fullNameTextBox).sendKeys(fullName);
    }

    public void sendEmailKeys(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public void sendCurrentAddressKeys(String currentAddress){
        driver.findElement(currentAddressTextBox).sendKeys(currentAddress);
    }

    public void sendPermanentAddressKeys(String permanentAddress){
        driver.findElement(permanentAddressTextBox).sendKeys(permanentAddress);
    }

    public void clickTheSubmitButton(){
        WebElement submit = driver.findElement(submitButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submit);
        driver.findElement(submitButton).click();
    }

    public void clickCheckBox(){
        driver.findElement(checkBoxLink).click();
    }

    public void clickExpandArrow(){
        driver.findElement(expandArrow).click();
    }

    public void clickDesktopCheckBox(){
        driver.findElement(checkBoxDesktop).click();
    }

    public String getTextAfterCheckBox(){
        return driver.findElement(resultText).getText();
    }

    public void clickWebTablesLink(){
        driver.findElement(webTablesLink).click();
    }

    public void clickEditSecondRow(){  //could make general method (dunno how), but this will only click the second row
        driver.findElement(editIconSecondRow).click();
    }

    public void sendFirstNameKeys(String firstName){
        driver.findElement(firstNameBox).clear();
        driver.findElement(firstNameBox).sendKeys(firstName);
    }

    public void sendLastNameKeys(String lastName){
        driver.findElement(lastNameBox).clear();
        driver.findElement(lastNameBox).sendKeys(lastName);
    }

    public void sendEmailAddressKeys(String emailAddress){
        driver.findElement(emailBox).clear();
        driver.findElement(emailBox).sendKeys(emailAddress);
    }

    public void sendAgeKeys(String age){
        driver.findElement(ageBox).clear();
        driver.findElement(ageBox).sendKeys(age);
    }

    public void sendSalaryKeys(String salary){
        driver.findElement(salaryBox).clear();
        driver.findElement(salaryBox).sendKeys(salary);
    }

    public void sendDepartmentKeys(String department){
        driver.findElement(departmentBox).clear();
        driver.findElement(departmentBox).sendKeys(department);
    }

    public void clickSubmitAfterEdit(){
        driver.findElement(submitAfterEdit).click();
    }

    public void clickDeleteThirdRow(){
        driver.findElement(deleteButtonInThirdRow).click();
    }

    public void clickAdd(){
        driver.findElement(addButton).click();
    }

    public void clickUploadAndDownload(){
        driver.findElement(uploadAndDownloadLink).click();
    }

    public void uploadFiles(String pathOfFiles){
        //driver.findElement(chooseFileButton).click();
        driver.findElement(chooseFileButton).sendKeys(pathOfFiles);
    }

}
