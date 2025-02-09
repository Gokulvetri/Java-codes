import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<String,Integer>();
         mp.put ("MCs",56);
         mp.put("svv",65);
         mp.put("lks",60);
         mp.put("nks",59);

         for (String key : mp.keySet()){
            System.out.println(key +":"+ mp.get(key));
         }
    }
}
