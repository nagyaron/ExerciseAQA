package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WidgetsPage {

    private WebDriver driver;
    private By datePickerLink = By.xpath("//span[contains(., 'Date Picker')]");
    private By selectDateBox = By.id("datePickerMonthYearInput");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
    LocalDate localDate = LocalDate.now();
    LocalDate newDate = localDate.plusDays(30);

    public WidgetsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTheDatePicker(){
        WebElement element = driver.findElement(datePickerLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(datePickerLink).click();
    }

    public void sendDate(){
        WebElement element = driver.findElement(selectDateBox);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(dateTimeFormatter.format(newDate));
    }
}
