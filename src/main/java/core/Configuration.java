package core;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Configuration instance;
    private static Properties properties;

    public Configuration() {
        init();
    }

    public static Configuration get() {
        instance = new Configuration();
        return instance;
    }

    private void init() {
        properties = new Properties();
        String propertyFile = "selenium.properties";
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream(propertyFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getDriverName() {
        return properties.getProperty("selenium.driver");
    }

    public static int getSeleniumWebDriverWait(){
        return Integer.parseInt(properties.getProperty("selenium.web.driver.wait"));
    }
}
