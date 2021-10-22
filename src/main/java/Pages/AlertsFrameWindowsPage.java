package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFrameWindowsPage {

    WebDriver driver;

    public AlertsFrameWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    private By framesLink = By.xpath("//li[contains(.,'Frames')][@id='item-2']");
    private String frame = "frame1";
    private By textArea = By.id("sampleHeading");

    public void clickFramesLink(){
        //WebElement element = driver.findElement(framesLink);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[2].scrollIntoView();", element);
        driver.findElement(framesLink).click();
    }

    public void switchToFrame(){
        driver.switchTo().frame(frame);
    }

    public String getTextFromFrame(){
        return driver.findElement(textArea).getText();
    }




}
