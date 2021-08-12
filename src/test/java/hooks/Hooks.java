package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinitions.Guru99Steps;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends utils.driverUtils{


    @Before("@RegressionTest")
    public void initialise_smartBear() throws IOException {
        Guru99Steps.driver = initialiseDriver(Guru99Steps.driver,"chrome");
        String url= utils.commonUtilsNoel.getURL("src/test/Resources/Guru99.properties");
        Guru99Steps.driver.manage().window().maximize();
        Guru99Steps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Guru99Steps.driver.get(url);

    }

    @After
    public void close_smartBear(){
        //smartBearSteps.driver.close();
    }


}

