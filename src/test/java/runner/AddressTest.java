package runner;

import model.AddressListPage;
import model.AddressPage;
import model.WorkshopPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{

    private static final String ZIP_CODE = "10011";
    private static final String PAGE_TITLE = "Find WW Studios & Meetings Near You | WW USA";

    @Test
    public void testCheckTitle() {

        String title = new WorkshopPage(getDriver())
                .getTitleName();

        Assert.assertEquals(title, PAGE_TITLE);
    }

    @Test
    public void testCheckFirstStudioName() {

        String studioName = new WorkshopPage(getDriver())
                .inputText(ZIP_CODE)
                .clickOkGoToListPage()
                .clickFirstAddress()
                .getStudioName();

        Assert.assertEquals(studioName, "WW Studio @ Chelsea");
    }

    @Test
    public void testPrintSchedule() {

         new WorkshopPage(getDriver())
                .inputText(ZIP_CODE)
                .clickOkGoToListPage()
                .clickFirstAddress()
                .clickHours()
                .printSchedule();
    }

    @Test
    public void test() {

        String title = new WorkshopPage(getDriver())
                .getTitleName();

        String firstStudioName = new WorkshopPage(getDriver())
                .clickInPerson()
                .inputText(ZIP_CODE)
                .clickOkGoToListPage()
                .getFistStName();

        String actualStudioName = new AddressListPage(getDriver())
                .clickFirstAddress()
                .getStudioName();

        new AddressPage(getDriver())
                .clickHours()
                .printSchedule();

        Assert.assertEquals(title, PAGE_TITLE);
        Assert.assertEquals(firstStudioName, actualStudioName);
    }
}
