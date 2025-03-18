package tests;

import org.junit.jupiter.api.Test;
import pages.RegistationPage;


public class HomeWorkL6 extends TestBase {

    @Test
    void textBoxHomeWork() {
        RegistationPage.openPage()
                .setFirstName("Oleg")
                .setLastName("Namozov")
                .setUserNumber("1234567890")
                .setEmailInput("oleg@mail.ru")
                .setGender("Other")
                .setDateOfBirth("20", "April","2020")
                .setSubjects("English");

//        $("#subjectsInput").setValue("English").pressEnter();
//        $("#subjectsInput").setValue("Arts").pressEnter();
//        $("#hobbies-checkbox-2").parent().$(byText("Reading")).click();
//        $("#hobbies-checkbox-3").parent().$(byText("Music")).click();
//        $(".form-control-file").uploadFromClasspath("eda.tiff");
//        $("#currentAddress").setValue("My current address");
//        $("#state").click();
//        $("#react-select-3-option-2").click();
//        $("#city").click();
//        $("#react-select-4-option-1").click();
//        $("#submit").click();
//
//        $x("//td[text()='Oleg Namozov']").shouldHave(text("Oleg Namozov"));
//        $x("//td[text()='Oleg@mail.ru']").shouldHave(text("Oleg@mail.ru"));
//        $x("//td[text()='Other']").shouldHave(text("Other"));
//        $x("//td[text()='1234567890']").shouldHave(text("1234567890"));
//        $x("//td[text()='28 March,2024']").shouldHave(text("28 March,2024"));
//        $x("//td[text()='English, Arts']").shouldHave(text("English, Arts"));
//        $x("//td[text()='Reading, Music']").shouldHave(text("Reading, Music"));
//        $x("//td[text()='eda.tiff']").shouldHave(text("eda.tiff"));
//        $x("//td[text()='My current address']").shouldHave(text("My current address"));
//        $x("//td[text()='Haryana Panipat']").shouldHave(text("Haryana Panipat"));
    }
}
