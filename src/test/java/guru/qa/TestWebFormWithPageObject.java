package guru.qa;

import org.junit.jupiter.api.Test;
import pages.CheckRegistrationPage;
import pages.RegistrationPage;

public class TestWebFormWithPageObject extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckRegistrationPage checkRegistrationPage = new CheckRegistrationPage();

    @Test
    void fullSucsessTest() {
        String userName = "Ivan";
        String userLastName = "Kuzmin";
        String userEmail = "mail@muil.ru";
        String userGender = "Other"; // Female , Male , Other
        String userPhone = "9876543218";
        String userScrin = "src/test/resources/skrin/379-scaled.jpg";
        String userScrinName = "379-scaled.jpg";
        String userSubject = "Chemistry";
        String userHobby = "Music";
        String userAddress = "Lenina 14";
        String userState = "Haryana";
        String userCity = "Karnal";


        registrationPage
                .openPage()
                .closeBanner()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setSubject(userSubject)
                .setHobby(userHobby)
                .setImage(userScrin)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .setClickSubmit();
        checkRegistrationPage
                .checkNameAndLastName(userName, userLastName)
                .checkEmail(userEmail)
                .checkGender(userGender)
                .checkPhone(userPhone)
                .checkSubject(userSubject)
                .checkImage(userScrinName)
                .checkAddress(userAddress)
                .checkState(userState)
                .checkCity(userCity);

    }

    @Test
    void fullFailTest() {
        String userName = "Ivan";
        String userLastName = "Kuzmin";
        String userEmail = "mail@muil.ru";
        String userGender = "Other"; // Female , Male , Other
        String userPhone = "9876543218";
        String userScrin = "src/test/resources/skrin/379-scaled.jpg";
        String userScrinName = "378-scaled.jpg";
        String userSubject = "Chemistry";
        String userHobby = "Music";
        String userAddress = "Lenina 14";
        String userState = "Haryana";
        String userCity = "Karnal";


        registrationPage
                .openPage()
                .closeBanner()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setSubject(userSubject)
                .setHobby(userHobby)
                .setImage(userScrin)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .setClickSubmit();
        checkRegistrationPage
                .checkNameAndLastName(userName, userLastName)
                .checkEmail(userEmail)
                .checkGender(userGender)
                .checkPhone(userPhone)
                .checkSubject(userSubject)
                .checkImage(userScrinName)
                .checkAddress(userAddress)
                .checkState(userState)
                .checkCity(userCity);

    }
}
