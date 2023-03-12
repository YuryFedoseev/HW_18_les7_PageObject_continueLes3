package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private final SelenideElement
            firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value).pressTab();

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value).pressTab();

        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value).pressTab();

        return this;
    }

    public RegistrationPage setGender(String value) {
        $(byTagAndText("Label", value)).click();

        return this;
    }

    public RegistrationPage setPhone(String value) {
        $("#userNumber").setValue(value).click();

        return this;
    }

    public RegistrationPage setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        $(byTagAndText("Label", value)).click();

        return this;
    }

    public RegistrationPage setImage(String value) {
        File pictures = new File(value);
        $("#uploadPicture").uploadFile(pictures);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        $("#currentAddress").setValue(value).pressTab().pressEnter();

        return this;
    }

    public RegistrationPage setStateAndCity(String valueState, String valueCity) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(valueState)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(valueCity)).click();
        $("#submit").click();

        return this;
    }

    public RegistrationPage setClickSubmit() {
        $("#submit").pressEnter();

        return this;
    }

    //Проверка данных
    public RegistrationPage checkNameAndLastName(String valueName, String valueLastName) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueName));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueLastName));

        return this;
    }

    public RegistrationPage checkEmail(String values) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(values));

        return this;
    }

    public RegistrationPage checkGender(String values) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(values));

        return this;
    }

    public RegistrationPage checkPhone(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPage checkSubject(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPage checkHobby(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPage checkImage(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPage checkAddress(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPage checkState(String valueState) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueState));

        return this;
    }

    public RegistrationPage checkCity(String valueCity) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueCity));

        return this;
    }

}
