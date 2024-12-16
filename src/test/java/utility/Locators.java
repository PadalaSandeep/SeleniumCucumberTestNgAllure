package utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Locators {

    public static String getLocator(String Application, String PageName, String locatorName){
        // Define the JSON file path
        String filePath = System.getProperty("user.dir")+"/src/test/resources/"+Application+"/"+PageName+".json";

        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
            // Read JSON as a Map
        Map<String, String> jsonMap = null;
        try {
            jsonMap = objectMapper.readValue(new File(filePath), Map.class);
        } catch (IOException e) {
            Assert.fail("Unable to read json file in src/test/resources/"+Application+"/"+PageName+".json");
        }

        if (jsonMap.containsKey(locatorName)) {
                return jsonMap.get(locatorName);
            } else {
                Assert.fail("Given locator "+locatorName+" does not exist");
                }
            return null;
    }
}
