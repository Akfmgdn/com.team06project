package stepdefinitions.mert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlogPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_11 {
    BlogPage blogPage = new BlogPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());



    @Then("Click blog link")
    public void clickbloglink() {
        blogPage.blogPageLink.click();
    }

    @Then("It sees that it goes to relevant page")
    public void itSeesThatItGoesToRelevantPage() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/blog";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @And("click on read more")
    public void clickOnReadMore() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.DOWN).perform();
        blogPage.readmoreLink.click();
    }

    @And("go to relevant page")
    public void goToRelevantPage() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/blog/post/nature-connection-exercise--perceive-and-receive";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @And("Write nature in the search box and see that it is searchable.")
    public void writeNatureInTheSearchBoxAndSeeThatItIsSearchable() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        blogPage.searchPostTextBox.click();
        ReusableMethods.bekle(2);

        actions
                .sendKeys("nature")
                .sendKeys(Keys.ENTER)
                .perform();

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/blog?query=nature";

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @And("Click on Jasper Scott and go relevant page")
    public void clickonJasperScottandgorelevantpage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        blogPage.jasperScottLink.click();
        String actualBlog = blogPage.jasperScottBlog.getText();
        String expectedBlog = "Jasper Scott";

        Assert.assertEquals(actualBlog,expectedBlog);

    }

    @And("Click on keyword section and navigate to the relevant pages.")
    public void clickOnKeywordSectionAndNavigateToTheRelevantPages() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        blogPage.programmingLink.click();
        blogPage.connectingToCarePopularLink.click();

        ReusableMethods.bekle(2);
        actions
                .sendKeys(Keys.END)
                .sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.PAGE_UP)
                .perform();

        ReusableMethods.bekle(2);

        Assert.assertTrue(blogPage.programmingTag.isDisplayed());
    }

    @And("Click on the titles in the Popular Posts section one by one and navigate to the relevant pages.")
    public void clickOnTheTitlesInThePopularPostsSectionOneByOneAndNavigateToTheRelevantPages() {
        ReusableMethods.bekle(2);
        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        blogPage.naturePopularLink.click();

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.trendlifebuy.com/blog/post/nature-is-a-teacher--what-happens-when-you-allow-everything-to-be-as-it-is";

        Assert.assertEquals(expectedUrl,actualUrl);


    }
}
