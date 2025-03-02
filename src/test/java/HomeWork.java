import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
    }

    @Test
    void textBoxHomeWork() {
        open("/automation-practice-form");
        $("#firstName").setValue("Oleg");
        $("#lastName").setValue("Namozov");
        $("#userEmail").setValue("Oleg@mail.ru");
        $(byText("Other")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("2024");
        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $(".form-control-file").uploadFile(new File("src\\test\\java\\eda.tiff"));
        $("#currentAddress").setValue("My current address");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Panipat")).click();
        $("#submit").click();


        $x("//td[text()='Oleg Namozov']").shouldHave(text("Oleg Namozov"));
        $x("//td[text()='Oleg@mail.ru']").shouldHave(text("Oleg@mail.ru"));
        $x("//td[text()='Other']").shouldHave(text("Other"));
        $x("//td[text()='1234567890']").shouldHave(text("1234567890"));
        $x("//td[text()='28 March,2024']").shouldHave(text("28 March,2024"));
        $x("//td[text()='English, Arts']").shouldHave(text("English, Arts"));
        $x("//td[text()='Reading, Music']").shouldHave(text("Reading, Music"));
        $x("//td[text()='eda.tiff']").shouldHave(text("eda.tiff"));
        $x("//td[text()='My current address']").shouldHave(text("My current address"));
        $x("//td[text()='Haryana Panipat']").shouldHave(text("Haryana Panipat"));

        //$("#closeLargeModal").pressEnter();

    }
}
