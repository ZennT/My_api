package test_data;
import java.util.HashMap;
import java.util.Map;
public class JsonPlaceHolderData {







    public static  Map<String,Object> expectedData(){
        Map<String, Object> expectedData = new HashMap<>(); // butun map ler olabilir ama hizli oldugu icin hashmap tercih edilir rasgele yerlestirir
        expectedData.put("userId", 21);
        expectedData.put("title","Walk the dog");
        expectedData.put("completed", true);

        return expectedData;

    }





}

