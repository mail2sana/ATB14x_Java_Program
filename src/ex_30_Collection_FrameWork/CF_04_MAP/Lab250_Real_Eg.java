package ex_30_Collection_FrameWork.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab250_Real_Eg {
    static void main() {
        // soring environment - specific configurations
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging" , "https://stag.api.com");

        // soring credentials - specific configurations

        Map<String,String> credential = new HashMap<>();
        credential.put("admin", "admin123");
        credential.put("user", "user123");



    }
}
