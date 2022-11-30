import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] listOfIntegers = {1, 5, 2, 2, 3, 3, 3, 4, 4, 3, 3, 3, 2, 2, 1};
        System.out.println(findOddNumber(listOfIntegers));
    }

    public static int findOddNumber(int[] integerArray) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int i : integerArray) {
            integerSet.add(i);
        }
        int countOfAppears;
        for (int integer : integerSet
        ) {
            countOfAppears = 0;
            for (int value : integerArray) {
                if (integer == value)
                    countOfAppears++;
            }
            if (countOfAppears % 2 == 1) return integer;
        }
        return 0;
    }
}
