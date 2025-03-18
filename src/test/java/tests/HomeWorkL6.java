package tests;

import org.junit.jupiter.api.Test;
import pages.RegistationPage;

import static pages.RegistationPage.setFirstName;
import static pages.RegistationPage.setLastName;

public class HomeWorkL6 extends TestBase {

    @Test
    void textBoxHomeWork() {
        RegistationPage.openPage();
        setFirstName("Alex");
        setLastName("Egorov");

//        //$("#firstName").setValue("Oleg");
//        //$("#lastName").setValue("Namozov");
//        $("#userEmail").setValue("Oleg@mail.ru");
//        $(byText("Other")).click();
//        $("#userNumber").setValue("1234567890");
//        $("#dateOfBirthInput").click();
//        $x("//*[@class='react-datepicker__year-select']").selectOption("2024");
//        $x("//*[@class='react-datepicker__month-select']").selectOption("March");
//        $x("//*[@class='react-datepicker__day react-datepicker__day--028']").click();
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
