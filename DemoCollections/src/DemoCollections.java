import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {

    }

    public static String cleanString(String s){
       return s.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static List<String> getWords(String inputFileName){
        List<String> words = new ArrayList<String>();
        In in = new In(inputFileName);
        while(!in.isEmpty()){
            String nextWord = cleanString(in.readString());
            System.out.println(nextWord);
            words.add(nextWord);
        }

        return words;
    }

    public static int countUniqueWords(List<String> allWords) {
        Set<String> words = new HashSet<>();

        for (String s : allWords){
            words.add(s);
        }

        return words.size();
    }

    public static Map<String, Integer> collectCountWords(List<String> words, List<String> targets){
        HashMap<String, Integer> count = new HashMap<String, Integer>();

        /*Note we have seen none of the words;)*/
        for (String s : targets){
            count.put(s, 0);
        }

        for (String s : words){
            if(count.containsKey(s)){
                int oldCount = count.get(s);
                count.put(s, oldCount);
            }
        }

    }
}
