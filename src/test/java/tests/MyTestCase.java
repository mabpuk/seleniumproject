package tests;

import components.sportsdirect.SportsDirectPage;
import components.sportsdirect.popup.AdvertPopUp;
import org.junit.Test;
import tests.sportsdirect.SportsDirectTestBase;


public class MyTestCase extends SportsDirectTestBase{

    @Test
    public void testSportsDirectSorting() {
        SportsDirectPage sportsDirectPage = goToSportsDirectPage();
        AdvertPopUp advertPopUp = new AdvertPopUp(driver);
        advertPopUp.clickClose();

        System.out.println("POPUP");
        sportsDirectPage.closeAdvertPopUp();
        System.out.println("PASS");
    }
}
