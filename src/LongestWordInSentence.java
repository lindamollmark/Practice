import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordInSentence {

    public String getLongestWordWithStreams(String sentence) {
        List<String> wordList = Arrays.asList(sentence.split("\\s+"));
        String longest = wordList.stream().max(Comparator.comparing(word -> word.length())).get();
        return longest;
    }

    public String getLongestWordOutOfSentence(String sentence) {
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
