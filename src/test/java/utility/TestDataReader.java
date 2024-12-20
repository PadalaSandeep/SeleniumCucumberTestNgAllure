package utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TestDataReader {

    public static String getLocator(String Application, String TestName, String TestData){
        // Define the JSON file path
        String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/"+Application+".json";

        // Load JSON file
        File jsonFile = new File(filePath);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = objectMapper.readTree(jsonFile);
        } catch (IOException e) {
            Assert.fail("Unable to read json file in src/test/resources/TestData/"+Application+".json");
        }
        // Check if the test name exists
        if (rootNode.has(TestName)) {
            JsonNode testNode = rootNode.get(TestName);
            if(testNode.has(TestData)) {
                return testNode.get(TestData).asText();
            }
            Assert.fail("Test Data:"+TestData+" not found in the JSON file "+Application+".json"+" for TestName "+TestName);
        } else {
            Assert.fail("Test Name:"+TestName+" not found in the JSON file:"+Application+".json");
        }
            return null;
    }

    public static void main(String[] args) {
        System.out.println(getLocator("Application","testName1", "password1"));
    }
}
