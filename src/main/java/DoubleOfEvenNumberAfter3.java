import java.util.Arrays;
import java.util.List;

public class DoubleOfEvenNumberAfter3 {

    private static Integer computeImperative(List<Integer> numbers) {
        Integer result = null;

        for(int e : numbers) {
            if(Utility.findNumberGreaterThan3(e) && Utility.findEvenNumber(e)) {
                result = Utility.doubleTheValue(e);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

        int doubleOfFirstEvenGreaterThan3 = computeImperative(numbers);
        System.out.println("Result is : " + doubleOfFirstEvenGreaterThan3);
    }
}
