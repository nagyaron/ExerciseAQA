package checkbox;

import base.BaseTest;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

   @Test //cerinta_2

    public void checkBoxTest() {
       var elementsPage = homePage.clickElementsPageLink();
       elementsPage.clickCheckBox();
       elementsPage.clickExpandArrow();
       elementsPage.clickDesktopCheckBox();
       String resultText = elementsPage.getTextAfterCheckBox();
       System.out.println(resultText);
   }
}
