package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


public class InfoPage extends PageObject {
    public static final Target FirstName = Target.the("This is where the name is entered.")
            .located(By.id("firstName"));
    public static final Target LastName = Target.the("This is where the last name is entered.")
            .located(By.id("lastName"));
    public static final Target Email = Target.the("Where a valid email will be entered for the creation of the account.")
            .located(By.id("email"));
    public static final Target Month = Target.the("Where the month of birth is chosen.")
            .located(By.id("birthMonth"));
    public static final Target Day = Target.the("Where the day of birth is chosen.")
            .located(By.id("birthDay"));
    public static final Target Year = Target.the("Where the year of birth is chosen.")
            .located(By.xpath("birthYear"));
    public static final Target NextButton = Target.the("Button to go to the next page.")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    //here is the location information, it is automatically recorded
    public static final Target NextButton2 = Target.the("Second button to go to the next page(here is the location information, it is automatically recorded).")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target MobileDevice = Target.the("Enter mobile device type.")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target ModelDevice = Target.the("Mobile device model.")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target operatingSystem = Target.the("Mobile device operating system.")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target NextButton3 = Target.the("Button to go to the next page.")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target InputPassword = Target.the("Where do we write the password.")
            .located(By.id("password"));
    public static final Target ConfirmPassword = Target.the("Where do we write the confirm password.")
            .located(By.id("confirmPassword"));
    public static final Target CheckStayInformed = Target.the("Check to receive announcements in the email entered above.")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CheckAcceptConditions = Target.the("Check to accept terms and conditions.")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CheckPrivacyPolicies = Target.the("Check to accept privacy policies.")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target completeButton = Target.the("button to finish new user registration")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));


}
