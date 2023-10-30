import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test

    void automationPracticeFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Aleksandr");
        $("#lastName").setValue("Levichev");
        $("#userEmail").setValue("Bill@bill.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8999881105");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byValue("1900")).click();
        $(".react-datepicker__month-select").$(byText("December")).click();
        $(".react-datepicker__day--001").click();
        $("#subjectsContainer").click();
        $("#subjectsInput").val("M").pressEnter();
        $("#subjectsInput").val("Co").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#currentAddress").setValue("Moscow oblast");
        $("#uploadPicture").uploadFile(new File("C:\\Users\\alex-\\IdeaProjects\\demoqa-tests\\src\\test\\picture"));
        $("#state").scrollTo();
        $("#state").click();
        $("#react-select-3-input").val("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").val("Delhi").pressEnter();
        $("#submit").pressEnter();
        // Checks
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Aleksandr Levichev"));
        $(".table-responsive").shouldHave(text("Bill@bill.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("8999881105"));
        $(".table-responsive").shouldHave(text("01 December,1900"));
        $(".table-responsive").shouldHave(text("Maths, Computer Science"));
        $(".table-responsive").shouldHave(text("Reading, Music, Sports"));
        $(".table-responsive").shouldHave(text("picture"));
        $(".table-responsive").shouldHave(text("Moscow oblast"));
        $(".table-responsive").shouldHave(text("NCR Delhi"));
    }

}
