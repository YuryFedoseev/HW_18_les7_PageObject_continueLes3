package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPages {
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");
    String dateTestValue = ".react-datepicker__month>div:nth-child(3)>.react-datepicker__day--0";

    public RegistrationPages openPage() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPages setFirstName(String value) {
        firstNameInput.setValue(value).pressTab();

        return this;
    }

    public RegistrationPages setLastName(String value) {
        lastNameInput.setValue(value).pressTab();

        return this;
    }

    public RegistrationPages setEmail() {
        $("#userEmail").setValue("mail@muil.ru").pressTab();

        return this;
    }

    public RegistrationPages setGender(String value) {
        $(byTagAndText("Label", value)).click();

        return this;
    }


    SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    SelenideElement monthInput = $(".react-datepicker__month-select");
    SelenideElement yearInput = $(".react-datepicker__year-select");

    public RegistrationPages setDateBorn( String userMonthBorn, String userYearBorn, String userDateBorn){

        dateOfBirthInput.click();
        monthInput.selectOption(userMonthBorn);
        yearInput.selectOption(userYearBorn);
        String dayOfDateLocator = String.format(".react-datepicker__month>div:nth-child(3)>.react-datepicker__day--0", userDateBorn);
        $(dayOfDateLocator).click();
        return this;
    }


    public RegistrationPages setPhone(String value) {
        $("#userNumber").setValue(value).click();

        return this;
    }

    public RegistrationPages setSubdject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPages setHobby(String value) {
        $(byTagAndText("Label", value)).click();

        return this;
    }

    public RegistrationPages setPicture() {
        File pictures = new File("src/test/resources/skrin/379-scaled.jpg");
        $("#uploadPicture").uploadFile(pictures);

        return this;
    }

    public RegistrationPages setAddress(String value) {
        $("#currentAddress").setValue(value).pressTab().pressEnter();

        return this;
    }

    public RegistrationPages setStateAndCity(String valueState, String valueCity) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(valueState)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(valueCity)).click();
        $("#submit").click();

        return this;
    }

    public RegistrationPages setClicSubmit() {
        $("#submit").pressEnter();

        return this;
    }

    //Проверка данных
    public RegistrationPages searchNameAndLastName(String valueName, String valueLastName) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueName));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueLastName));

        return this;
    }

    public RegistrationPages searchEmail(String values) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(values));

        return this;
    }

    public RegistrationPages searchGender(String values) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(values));

        return this;
    }

    public RegistrationPages searchPhone(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPages searchSubject(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPages searhPictire() {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("379-scaled.jpg"));

        return this;
    }

    public RegistrationPages searchAddress(String value) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(value));

        return this;
    }

    public RegistrationPages searchStateAndCity(String valueState, String valueCity) {
        $x("//div[@class='table-responsive']").shouldHave(Condition.text(valueState + " " + valueCity));

        return this;
    }

}
