import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Exam5 {
    private static final String Map = null;

    public static void main(String[] args) {
        Map<String,Integer>map = new HashMap<>();

        map.getOrDefault("アナと雪の女王", 3000);
         map.getOrDefault("美女と野獣", 200);
          map.getOrDefault("モアナと伝説の海", 8000);

          For(Map.Entry<String,Integer> e :map.entrySet()){

          }
       
}
}
