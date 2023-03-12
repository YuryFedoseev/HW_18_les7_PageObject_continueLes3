package guru.qa;

import org.junit.jupiter.api.Test;
import page.RegistrationPage;

public class TestWebFormWithPageObject extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fullSuccessTest() {
        String userName = "Ivan";
        String userNameCheck = "Ivan";
        String userLastName = "Kuzmin";
        String userLastNameCheck = "Kuzmin";
        String userEmail = "mail@muil.ra";
        String userEmailCheck = "mail@muil.ra";
        String userScrin = "src/test/resources/skrin/379-scaled.jpg";
        String userScrinNameCheck = "379-scaled.jpg";
        String userGenderCheck = "Other"; // Female , Male , Other
        String userGender = "Other";
        String userPhone = "9876543218";
        String userPhoneCheck = "9876543218";
        String userSubject = "Chemistry";
        String userSubjectCheck = "Chemistry";
        String userHobby = "Music";
        String userHobbyCheck = "Music";
        String userAddress = "Lenina 14";
        String userAddressCheck = "Lenina 14";
        String userState = "Haryana";
        String userStateCheck = "Haryana";
        String userCity = "Karnal";
        String userCityCheck = "Karnal";


        registrationPage
                .openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender).setPhone(userPhone)
                .setSubject(userSubject)
                .setHobby(userHobby)
                .setImage(userScrin)
                .setAddress(userAddress)
                .setStateAndCity(userState, userCity)
                .setClickSubmit()

                .checkNameAndLastName(userNameCheck, userLastNameCheck)
                .checkEmail(userEmailCheck)
                .checkGender(userGenderCheck)
                .checkPhone(userPhoneCheck)
                .checkSubject(userSubjectCheck)
                .checkHobby(userHobbyCheck)
                .checkImage(userScrinNameCheck)
                .checkAddress(userAddressCheck)
                .checkState(userStateCheck)
                .checkCity(userCityCheck);

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
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender).setPhone(userPhone)
                .setSubject(userSubject)
                .setHobby(userHobby)
                .setImage(userScrin)
                .setAddress(userAddress)
                .setStateAndCity(userState, userCity)
                .setClickSubmit()

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
