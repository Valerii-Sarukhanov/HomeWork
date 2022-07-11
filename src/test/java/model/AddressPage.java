package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddressPage extends BaseModel{

    @FindBy(className = "hours-IVyrp")
    private WebElement businessHours;

    @FindBy(className = "locationName-1jro_")
    private WebElement studioName;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage clickHours() {
        businessHours.click();

        return new AddressPage(getDriver());
    }

    public String getStudioName() {
        return studioName.getText();
    }

    public void printSchedule() {

        List <WebElement> a = getDriver().findElements(By.className("day-CZkDC"));
        for(WebElement webElement : a){
            String name = webElement.getText();
            String s = name.replaceAll("\n", " ");
            System.out.println(s);
        }
    }
}
