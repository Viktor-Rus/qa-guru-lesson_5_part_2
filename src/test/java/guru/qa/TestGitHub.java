package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestGitHub {

    @Test
    void testPricing(){
        open("https://github.com/");
        $("nav").$(byText("Pricing")).hover();
        $(withText("Compare plans")).click();
        $("h1").shouldHave(text("Choose the plan that’s right for you."));
    }

    @Test
    void testActions(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $x("//div[@class='column'][1]").shouldHave(text("B"));
        $x("//div[@class='column'][2]").shouldHave(text("A"));


    }
}
