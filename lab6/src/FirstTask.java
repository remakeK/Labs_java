import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTask {
    public static void main(String[ ] args) throws IOException {
        String filePath = "D:\\Documents\\Studying\\Programming\\java\\lab6\\text.txt";
        File file = new File(filePath);
        Scanner scanner = null;
        BufferedReader reader = null;
        String line;

        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("\\b\\w+\\b");

        Map<String, Integer> map = new HashMap<>();

        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String word = matcher.group().toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        reader.close();

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });
        int length = list.size();
        for(int i = 0; i < 10 || i<length; i++){
            if(i==10) break;
            System.out.println(list.get(list.size()-1-i));
        }
    }
}
