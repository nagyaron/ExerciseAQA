package widgets;

import base.BaseTest;
import org.testng.annotations.Test;

public class WidgetsTest extends BaseTest {

    @Test //cerinta_6
    public void testDataPicker(){
        var WidgetsPage = homePage.clickWidgetsPage();
        WidgetsPage.clickTheDatePicker();
        WidgetsPage.sendDate();
    }
}
