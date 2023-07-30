package lesson_5;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void selectEnterpriseGithubTest() {

        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".border-bottom.pb-3.mb-3").$(byText("Enterprise")).click();
        $(".application-main h1").shouldHave(text("Build like the best"));

    }
}