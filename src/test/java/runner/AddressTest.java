package runner;

import model.WorkshopPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{

    private static final String ZIP_CODE = "10011";

    @Test
    public void testCheckTitle() {

        String title = new WorkshopPage(getDriver())
                .getTitleName();

        Assert.assertEquals(title, "Find Your Workshop");
    }

    @Test
    public void testCheckFirstStudioName() {

        String studioName = new WorkshopPage(getDriver())
                .inputText(ZIP_CODE)
                .clickOkGoToListPage()
                .clickAddress()
                .getStudioName();

        Assert.assertEquals(studioName, "WW Studio @ Chelsea");
    }

    @Test
    public void testPrintSchedule() {

         new WorkshopPage(getDriver())
                .inputText(ZIP_CODE)
                .clickOkGoToListPage()
                .clickAddress()
                .clickHours()
                .printSchedule();
    }
}
