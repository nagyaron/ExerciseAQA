package frames;

import base.BaseTest;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test //cerinta_5
    public void testFrame(){
        var AlertsFrameWindowsPage = homePage.clickAlertsFrameWindowsPage();
        AlertsFrameWindowsPage.clickFramesLink();
        AlertsFrameWindowsPage.switchToFrame();
        String text = AlertsFrameWindowsPage.getTextFromFrame();
        System.out.println(text);
    }
}
