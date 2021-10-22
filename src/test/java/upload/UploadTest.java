package upload;

import base.BaseTest;
import org.testng.annotations.Test;

public class UploadTest extends BaseTest {

    @Test //cerinta_4
    public void testUpload(){
        var ElementsPage = homePage.clickElementsPageLink();
        ElementsPage.clickUploadAndDownload();
        String path = System.getProperty("user.dir")+ "/resources/JustAnotherZipFile.zip";
        ElementsPage.uploadFiles(path);
    }
}
