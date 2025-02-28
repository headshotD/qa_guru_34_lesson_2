import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Demoqa {
@BeforeAll
static void beforeAll(){
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.pageLoadStrategy = "eager";
}

    @Test
    void textBox() {
        open("/text-box");
        $("#userName").setValue("Oleg Namozov");
        $("#userEmail").setValue("Oleg@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Moscow never sleeps");
        $("#submit").click();

        $("#output #name").shouldHave(text("Oleg Namozov"));
        $("#output #email").shouldHave(text("Oleg@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("Moscow never sleeps"));

    }
}
