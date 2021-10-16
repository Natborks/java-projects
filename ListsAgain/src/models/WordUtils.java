package models;

public class WordUtils {
    public static void main(String[] args) {
        SLList<String> slList = new SLList();

        slList.addFirst("Thames");
        slList.addFirst("Richard");
        slList.addFirst("Terry");

        String longest = getLongest(slList);
        System.out.println(longest);
    }

    public static String  getLongest(SLList<String> slList){
        String longest = "";
        int count = 0;
        while (count < slList.size()){
            String item = slList.get(count);
            if(item.length() > longest.length()){
                longest = item;
            }
            count += 1;
        }
        return longest;
    }
}
