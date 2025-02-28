import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Demoqa {
//    @AfterEach
//    void afterEach() {
//        System.out.println("### AfterEach");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("###  beforeEach");
//    }

    @Test
    void textBox() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Oleg Namozov");
        $("#userEmail").setValue("Oleg@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Moscow never sleeps");
        $("#id='submit").click();

    }
}
