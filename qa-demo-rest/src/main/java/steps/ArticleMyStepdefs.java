package steps;

import impl.ArticleServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import model.Root;
import org.junit.Assert;
import service.ArticleService;
import xml.GsonParser;
import xml.JsonSimpleParser;

import static context.RunContext.RUN_CONTEXT;

public class ArticleMyStepdefs {
    ArticleService articleService = new ArticleServiceImpl();


    @Given("Get Articles {string} Request")
    public void getArticlesRequest(String url) {
        articleService.getArticles(url);
    }

    @Then("Response code is: {string}")
    public void responseCodeIs(String status) {
        ValidatableResponse response = RUN_CONTEXT.get("response", ValidatableResponse.class);
        int actualStatus = response.extract().statusCode();
        int expectStatus = Integer.parseInt(status);
        Assert.assertEquals(actualStatus, expectStatus);
    }

    @Then("Assert with Gson")
    public void assertWithGson() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("Root " + root.toString());
    }

    @Then("Assert with Json")
    public void assertWithJson() {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();

        System.out.println(root.toString());;
    }
}
