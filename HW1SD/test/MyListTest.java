import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    void binSearch_KeyFoundInArray_ShouldReturnOne(){

        int[] inputs = {1,2,3,4,5,7,8};
        int key = 5;
        int result;
        MyList myList = new MyList();

        result = myList.binSearch(inputs, key);

        assertEquals(1, result);
    }

    @Test
    void binSearch_KeyNotFoundInArray_ShouldReturnZero(){

        int[] inputs = {1,2,3,4,5,7,8};
        int key = 6;
        int result;
        MyList myList = new MyList();

        result = myList.binSearch(inputs, key);

        assertEquals(0, result);
    }
}