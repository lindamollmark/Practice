import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Created by Linda on 2017-02-19.
 */
public class SortingNumbers {

 private List<Integer> numbers = new ArrayList<>();
    private Random random = new Random();

    public void sortNumbers(){
        randomNumbers();

        numbers.sort(Comparator.comparingInt(number -> number));

        for(Integer number : numbers)
        System.out.println(number);

    }

    private void randomNumbers() {
        while (numbers.size()<100){
            int number = random.nextInt(100);
            numbers.add(number);
            System.out.println(number);
        }
    }
}
