package Stringss;
//1859
//https://leetcode.com/problems/sorting-the-sentence/description/
public class SortTheSentance {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        int i = '2' - '1';
        System.out.println(i);
    }
    public static String sortSentence(String s) {
        String[] str = new String[s.split(" ").length];
        for(String st : s.split(" "))
        {
            str[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
        }
        return String.join(" ",str);
        

    }

}
