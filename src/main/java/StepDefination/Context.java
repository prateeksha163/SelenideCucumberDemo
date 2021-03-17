package StepDefination;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Context {
    public List<String> blockOfBusiness ;


    private final HashMap<String, String> configuration = new HashMap<>();
    public Context() {
        Properties properties = new Properties();
        try { System.out.println("properties.load(Context.class.getClassLoader()"+Context.class.getClassLoader().getName());
            properties.load(Context.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            //Do nothing properties file is probably missing from resources.
            //We shall print a warning and move ahead and not stall the test execution.
            System.out.println("Warning :: Properties file is missing in resources: 'config.properties'");
        }
        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            configuration.put(key, value);
        } }

    public String getConfigValue(String key) {
        return configuration.get(key);
    }

}
