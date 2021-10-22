package webtables;

import base.BaseTest;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test //cerinta_3
    public void testWebTables(){
        var ElementsPage = homePage.clickElementsPageLink();
        ElementsPage.clickWebTablesLink();

        ElementsPage.clickEditSecondRow();
        ElementsPage.sendFirstNameKeys("Ion");
        ElementsPage.sendLastNameKeys("Pop");
        ElementsPage.sendEmailAddressKeys("test@automation.com");
        ElementsPage.sendAgeKeys("40");
        ElementsPage.sendSalaryKeys("15000");
        ElementsPage.sendDepartmentKeys("Legal");
        ElementsPage.clickSubmitAfterEdit();

        ElementsPage.clickDeleteThirdRow();

        ElementsPage.clickAdd();
        ElementsPage.sendFirstNameKeys("Joe");
        ElementsPage.sendLastNameKeys("Doe");
        ElementsPage.sendEmailAddressKeys("joedoe@guesswhat.com");
        ElementsPage.sendAgeKeys("42");
        ElementsPage.sendSalaryKeys("666");
        ElementsPage.sendDepartmentKeys("Marketing");
        ElementsPage.clickSubmitAfterEdit();

    }
}
