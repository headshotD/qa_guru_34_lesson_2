import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork {

        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.pageLoadStrategy = "eager";
            Configuration.holdBrowserOpen = true;
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

            $(byText("Reading")).click();
            $(byText("Music")).click();

            $("#currentAddress").setValue("My current address");
            $("#submit").click();

//        $("#output #name").shouldHave(text("Oleg Namozov"));
//        $("#output #email").shouldHave(text("Oleg@mail.ru"));
//        $("#output #currentAddress").shouldHave(text("Moscow"));
//        $("#output #permanentAddress").shouldHave(text("Moscow never sleeps"));

        }
    }
