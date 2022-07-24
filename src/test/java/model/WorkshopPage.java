package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkshopPage extends BaseModel{

    @FindBy(id = "location-search")
    private WebElement searchField;

    @FindBy(id = "location-search-cta")
    private WebElement submitButton;

    @FindBy(xpath = "//span[text()='In-Person']")
    private WebElement inPerson;

    public WorkshopPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleName() {
        return getDriver().getTitle().replace(" ", " ");
    }

    public WorkshopPage inputText(String text) {
        searchField.sendKeys(text);

        return this;
    }

    public AddressListPage clickOkGoToListPage() {
        submitButton.click();

        return new AddressListPage(getDriver());
    }

    public WorkshopPage clickInPerson() {
        inPerson.click();

        return this;
    }
}
