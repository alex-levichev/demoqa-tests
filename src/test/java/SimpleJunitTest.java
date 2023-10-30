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
        $("#firstName").setValue("Bill");
        $("#lastName").setValue("Gates");
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
        $("#state").click();
        $("#react-select-3-input").val("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").val("Delhi").pressEnter();
        $("#submit").pressEnter();

        //submit




        // subjectsContainer






        //     $("#hobbies-checkbox-1").click();
     //   $("#hobbies-checkbox-2").click();
     //   $("").setValue("");
     //   $("").setValue("");

     //   $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }

}
