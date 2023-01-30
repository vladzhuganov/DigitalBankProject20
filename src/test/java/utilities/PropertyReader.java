package utilities;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

    static Properties properties = new Properties();

    public static void initProperties() {
        try {
            FileReader fileReader = new FileReader("src/test/resources/config/config.properties");

            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
