import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Integer[] listOfIntegers = {1, 5, 2, 2, 3, 3, 3, 4, 4, 3, 3, 3, 2, 2, 1};
        System.out.println(findOddNumber(listOfIntegers));
    }

    public static Integer findOddNumber(Integer[] integerArray) {
        Set<Integer> integerSet = new TreeSet<>(Arrays.asList(integerArray));

        int countOfAppears;
        for (Integer integer : integerSet
        ) {
            countOfAppears = 0;
            for (Integer value : integerArray) {
                if (integer.equals(value))
                    countOfAppears++;
            }
            if (countOfAppears % 2 == 1) return integer;
        }
        return null;
    }
}
