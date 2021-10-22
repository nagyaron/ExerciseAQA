package textbox;

import base.BaseTest;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {

    @Test //cerinta_1
    public void testTextBox(){
        var elementsPage =homePage.clickElementsPageLink();
        elementsPage.clickTextBox();
        elementsPage.sendFullNameKeys("Hello Kitty");
        elementsPage.sendEmailKeys("hellokitty@happymail.com");
        elementsPage.sendCurrentAddressKeys("Hello Kitty's House");
        elementsPage.sendPermanentAddressKeys("In your heart");
        elementsPage.clickTheSubmitButton();
    }
}
