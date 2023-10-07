import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        Collections.shuffle(myList);

        Integer[] shuffledArray = myList.toArray(new Integer[0]);

        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

