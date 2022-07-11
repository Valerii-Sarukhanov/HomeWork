package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressListPage extends BaseModel{

    @FindBy(className = "linkUnderline-1_h4g")
    private WebElement adress;


    public AddressListPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage clickAddress() {
        adress.click();

        return new AddressPage(getDriver());
    }
}
