import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordInSentence {

    public static void main(String[] args) {
        String sentence = "Detta är en riktigt lång mening";
        String longestWord = getLongestWordOutOfSentence(sentence);
        System.out.println("Längsta ordet i meningen är enligt loop : " + longestWord);
        String longestStreamWord = getLongestWordWithStreams(sentence);
        System.out.println("Längsta ordet i meningen är enligt streams : " + longestStreamWord);
    }

    private static String getLongestWordWithStreams(String sentence) {
        List<String> wordList = Arrays.asList(sentence.split("\\s+"));
        String longest = wordList.stream().max(Comparator.comparing(word -> word.length())).get();
        return longest;
    }

    private static String getLongestWordOutOfSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }


}
