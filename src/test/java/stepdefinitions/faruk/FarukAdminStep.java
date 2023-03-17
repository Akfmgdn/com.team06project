package stepdefinitions.faruk;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MyAccountPage;
import pages.MyWalletPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class FarukAdminStep {
    MyWalletPage myWalletPage = new MyWalletPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    @Given("Go to Admin site")
    public void goToAdminSite() {
        Driver.getDriver().get("https://trendlifebuy.com/admin/login");
    }

    @Then("Pass in the admin credentials and click on the submit button")
    public void passInTheAdminCredentialsAndClickOnTheSubmitButton() {
        myWalletPage.loginEmailBox.sendKeys("admin006@trendlifebuy.com");
        myWalletPage.loginPasswordBox.sendKeys("Trendlife123");
        ReusableMethods.jsClick(myWalletPage.signInButton);

    }

    @And("Verify that {string} is visisble")
    public void verifyThatIsVisisble(String element) {

    }
}
