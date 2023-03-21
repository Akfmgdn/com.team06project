package stepdefinitions.akif;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_stepdefinitions {

    HomePage homePage=new HomePage();

    @Given("user logs in")
    public void user_logs_in() {
        ReusableMethods.loginMethod("akifUrl","akifEmail","akifPassword");
    }
    @Given("User adds first product to compare page")
    public void user_adds_first_product_to_compare_page() {
        Actions actions = new Actions(Driver.getDriver());
        WebElement firstElement=homePage.akifFirstproductLink;
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");
        ReusableMethods.bekle(2);
        actions.moveToElement(firstElement).perform();
        homePage.productCompareLink.click();
    }
    @Given("User adds second product to compare page")
    public void user_adds_second_product_to_compare_page() {
        Actions actions = new Actions(Driver.getDriver());
        WebElement secondElement=homePage.akifSecondproductLink;
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(2);
        actions.moveToElement(secondElement).perform();
        homePage.productCompareLink.click();
        ReusableMethods.bekle(2);
    }
    @Given("clicks on compare page")
    public void clicks_on_compare_page() {

    }
    @Given("It is tested that the products that users put on the Compare page while shopping are displayed side by side with pictures and content information.")
    public void it_is_tested_that_the_products_that_users_put_on_the_compare_page_while_shopping_are_displayed_side_by_side_with_pictures_and_content_information() {

    }




}
