package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPages;

public class TestBase {
    RegistrationPages registrationPages = new RegistrationPages();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "720x880";
        Configuration.holdBrowserOpen = true;
    }
}
