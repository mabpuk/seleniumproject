package tests;

import components.sportsdirect.SportsDirectPage;
import components.sportsdirect.popup.AdvertPopUp;
import org.junit.Test;
import tests.sportsdirect.SportsDirectTestBase;


public class MyTestCase extends SportsDirectTestBase{


    /**
     * 1. Open sportsdirect.com page
     * 2. Open Mens shoes section
     * 3. Select brands "Skechers" and "Firetrap"
     * 4. Set price range "30-60" EUR
     * 5. Check items are correctly filtered
     */
    @Test
    public void testSportsDirectSorting() {
        SportsDirectPage sportsDirectPage = goToSportsDirectPage();
        AdvertPopUp advertPopUp = new AdvertPopUp(driver);
        advertPopUp.clickClose();
        sportsDirectPage.openMensSection();

        sportsDirectPage.expandFootwear();
        sportsDirectPage.selectShoes();


    }
}
