
public class Main {

    LongestWordInSentence wordSorting = new LongestWordInSentence();
    SortingNumbers numberSorting = new SortingNumbers();
    String sentence = "Detta är en riktigt lång mening";


    public static void main(String[] args) {
        Main main = new Main();
        main.callMethod();
    }

    private void callMethod(){
        String longestWord = wordSorting.getLongestWordOutOfSentence(sentence);
        System.out.println("Längsta ordet i meningen är enligt loop : " + longestWord);
        String longestStreamWord = wordSorting.getLongestWordWithStreams(sentence);
        System.out.println("Längsta ordet i meningen är enligt streams : " + longestStreamWord);

        numberSorting.sortNumbers();
    }
}
