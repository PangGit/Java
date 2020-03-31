package test.map;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {


    public static void main(String[] args) {


        final HashMap<String, String> map = new HashMap<String, String>(16, 0.75F);

        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(UUID.randomUUID().toString(), "");
                }
            }).start();
        }


        ConcurrentHashMap ccm = new ConcurrentHashMap(16);

    }


}
