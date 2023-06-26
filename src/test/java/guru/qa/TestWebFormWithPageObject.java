package guru.qa;

import org.junit.jupiter.api.Test;

public class TestWebFormWithPageObject extends TestBase {


    @Test
    void fullSuccessTest() {
        String userName = "Ivan";
        String userLastName = "Kuzmin";
        String userGender = "Other"; // Female , Male , Other
        String userPhone = "9876543218";
        String userSubject = "Chemistry";
        String userHobby = "Music";
        String userAddress = "Lenina 14";
        String userState = "Haryana";
        String userCity = "Karnal";


        registrationPages
                .openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail()
                .setGender(userGender).setPhone(userPhone)
                .setSubdject(userSubject)
                .setHobby(userHobby)
                .setPicture()
                .setAddress(userAddress)
                .setStateAndCity(userState, userCity)
                .setClicSubmit()

                .searchNameAndLastName(userName, userLastName)
                .searchEmail("mail@muil.ru")
                .searchGender(userGender).searchPhone(userPhone)
                .searchSubject(userSubject)
                .searhPictire()
                .searchAddress(userAddress)
                .searchStateAndCity(userState, userCity);

    }


    @Test
    void fullFailTest() {
        String userName = "Ivan";
        String userLastName = "Kuzmin";
        String userGender = "Other"; // Female , Male , Other
        String userPhone = "9876543218";
        String userSubject = "Chemistry";
        String userHobby = "Music";
        String userAddress = "Lenina 14";
        String userState = "Haryana";
        String userCity = "Karnal";
        String userDateBorn = "6";
        String userMonthBorn = "January";
        String userYearBorn = "2000";


        registrationPages
                .openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail()
                .setGender(userGender).setPhone(userPhone)
                .setSubdject(userSubject)
                .setHobby(userHobby)
                .setDateBorn(userMonthBorn, userYearBorn , userDateBorn  )
                .setPicture()
                .setAddress(userAddress)
                .setStateAndCity(userState, userCity)
                .setClicSubmit()

                .searchNameAndLastName(userName, userLastName)
                .searchEmail("ivko@muil.ru")
                .searchGender(userGender).searchPhone(userPhone)
                .searchSubject(userSubject)
                .searhPictire()
                .searchAddress(userAddress)
                .searchStateAndCity(userState, userCity);

    }
}
