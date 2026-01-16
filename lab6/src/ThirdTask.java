import java.util.Map;
import java.util.TreeMap;

public class ThirdTask {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple",34242);
        map.put("Banana",142213);
        map.put("Orange",123214);
        map.put("Pineapple",52);
        map.put("Olive",23214945);
        map.put("Yoghurt",58489);
        showList(map);
        System.out.println(highest(map));
    }

    public static void showList(TreeMap<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }
    }
    public static int highest(TreeMap<String, Integer> map){
        int max = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        return max;
    }
}
