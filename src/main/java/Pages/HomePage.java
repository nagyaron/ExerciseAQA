package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private By elementsPageLink = By.xpath("//h5[contains(.,'Elements')]");
    private By alertsFrameWindowsPageLink = By.xpath("//h5[contains(.,'Alerts, Frame & Windows')]");
    private By widgetsPageLink = By.xpath("//h5[contains(.,'Widgets')]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public ElementsPage clickElementsPageLink(){
        WebElement element = driver.findElement(elementsPageLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(elementsPageLink).click();
        return new ElementsPage(driver);
    }

    public AlertsFrameWindowsPage clickAlertsFrameWindowsPage(){
        WebElement element = driver.findElement(alertsFrameWindowsPageLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(alertsFrameWindowsPageLink).click();
        return new AlertsFrameWindowsPage(driver);
    }

    public WidgetsPage clickWidgetsPage(){
        WebElement element = driver.findElement(widgetsPageLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(widgetsPageLink).click();
        return new WidgetsPage(driver);
    }

}
