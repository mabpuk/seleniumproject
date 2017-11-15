package tests.sportsdirect;

import components.sportsdirect.SportsDirectPage;
import core.framework.TestBase;
import core.framework.page.Navigation;

public class SportsDirectTestBase extends TestBase{


    protected SportsDirectPage goToSportsDirectPage(){
        return Navigation.openSportsDirectPage(driver).andGetSportsDirectPage();
    }

}
