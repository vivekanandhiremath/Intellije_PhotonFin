package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private Properties properties;

    // Constructor that loads properties from the specified file
    public PropertyReader(String filePath) {
        properties = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Method to get the value of a property by its key
    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Method to get the value of a property with a default value
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public static void main(String[] args) {
        // Specify the path to your properties file
        PropertyReader reader = new PropertyReader("config.properties");

        // Get properties using the key
        String dbUser = reader.getProperty("db.user");
        String dbPassword = reader.getProperty("db.password", "defaultPassword");

        // Output the properties
        System.out.println("DB User: " + dbUser);
        System.out.println("DB Password: " + dbPassword);
    }
}
