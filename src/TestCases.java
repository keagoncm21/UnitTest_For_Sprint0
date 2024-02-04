import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestCases {

    //testing binary sort with positive numbers
    @Test
    public void testPositiveNumbers() {
        //creating an instance of BinarySort
        BinarySort binarySort = new BinarySort();

        int[] input = {2, 1, 0, 46, 5, 7, 8, 3, 67, 65, 13};
        int[] expected = {0, 1, 2, 3, 5, 7, 8, 13, 46, 65, 67};

        binarySort.sort(input);

        //check to make sure the output is the same as what was expected
        assertArrayEquals(expected, input);
    }

    //test binary sort with negative numbers
    @Test
    public void testNegativeNumbers() {
        //creating an instance of BinarySort
        BinarySort binarySort = new BinarySort();

        int[] input = {-2, -11, 0, -3, -7};
        int[] expected = {-11, -7, -3, -2, 0};

        binarySort.sort(input);

        //check to make sure the output is the same as what was expected
        assertArrayEquals(expected, input);
    }
}