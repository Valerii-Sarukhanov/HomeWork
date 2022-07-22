package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressListPage extends BaseModel{

    @FindBy(className = "linkUnderline-1_h4g")
    private WebElement adress;

    @FindBy(xpath = "(//div[@class='heading-3yCF-'])[1]//a")
    private WebElement firstStudioName;

    @FindBy(xpath = "(//div[@class='heading-3yCF-'])[1]//span")
    private WebElement firstStudioDistance;

    public AddressListPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage clickFirstAddress() {
        adress.click();

        return new AddressPage(getDriver());
    }

    public String getFistStName() {
        System.out.print(firstStudioName.getText());
        System.out.println(" " + firstStudioDistance.getText());

        return  firstStudioName.getText();
    }
}
