import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void binSearch_KeyFoundInArray_ShouldReturnOne() throws Exception {

        Double[] inputs = {1.0, 2.0, 2.0, 4.0, 5.0};
        Double key = 2.0;
        String result;
        MyList myList = new MyList();

        result = myList.binSearch(inputs, key);

        assertEquals("1", result);
    }

    @Test
    public void binSearch_KeyNotFoundInArray_ShouldReturnZero() throws Exception {

        Double[] inputs = {1.0, 2.0, 3.0, 4.0, 5.0, 7.0, 8.0};
        Double key = 6.0;
        String result;
        MyList myList = new MyList();

        result = myList.binSearch(inputs, key);

        assertEquals("The key was not found!", result);
    }
    @Test
    public void bubbleSort_CorrectlySortInputs_ShouldReturnSortedArray() throws Exception {

        Double[] inputs = {2.5, 1.0, 4.0, 0.5, 2.5, 3.0, 8.0};
        MyList myList = new MyList();
        Double first = 0.5;
        Double second = 1.0;
        Double third = 2.5;
        Double fourth = 2.5;
        Double fifth = 3.0;
        Double sixth = 4.0;
        Double seventh = 8.0;

        inputs = myList.bubbleSort(inputs);

        assertEquals(first, inputs[0]);
        assertEquals(second, inputs[1]);
        assertEquals(third, inputs[2]);
        assertEquals(fourth, inputs[3]);
        assertEquals(fifth, inputs[4]);
        assertEquals(sixth, inputs[5]);
        assertEquals(seventh, inputs[6]);
    }
}