import java.util.ArrayList;
import java.util.Scanner;

public class MyList {

    public double getKey(){
        Scanner scanner = new Scanner(System.in);
        double key = Double.parseDouble(scanner.next());
        return key;
    }

    public String binSearch(Double[] array, double value) {

        // Source: majority of algorithm comes from Starting out with Java from Control Structures
        // to Data Structures by Tony Gaddis and Godfrey Muganda. I added some code to adapt it to my need.
        int first;
        int last;
        int middle;
        int position;
        boolean found;

        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        while (!found && first <= last) {
            middle = (first + last) / 2;

            if (array[middle].doubleValue() == value) {
                if (middle == 0 || array[middle].doubleValue() != array[middle -1].doubleValue()) {
                    found = true;
                    position = middle;
                } else {
                    while(array[middle].doubleValue() == array[middle -1].doubleValue()){
                        middle = middle - 1;
                    }
                    found = true;
                    position = middle;
                }
            } else if (array[middle].doubleValue() > value)
                last = middle - 1;
            else
                first = middle + 1;
        }

        if(position < 0)
            return "The key was not found!";
        else
            return Integer.toString(position);
    }

    // I made some modifications and here's the bubbleSort
    // source: https://www.javatpoint.com/bubble-sort-in-java
    public Double[] bubbleSort(Double[] inputs){

        int arrLength = inputs.length;
        double temp;

        // Compare first element with each element in the array
        for(int i = 0; i < arrLength; i++){
            for(int j = 1; j < (arrLength - i); j++){
                // If first element is bigger than element to its right swap
                if(inputs[j - 1] > inputs[j]){
                    temp = inputs[j - 1];
                    inputs[j - 1] = inputs[j];
                    inputs[j] = temp;
                }
            }
        }
        return inputs;
    }


    public static void main(String args[]){

        Double[] inputs = new Double[args.length];

        for (int i = 0; i < args.length; i++) {
                inputs[i] = Double.parseDouble(args[i]);
        }

        MyList myList = new MyList();
        inputs = myList.bubbleSort(inputs);
        for(Double input : inputs){
            System.out.println(input);
        }
        System.out.println(myList.binSearch(inputs, myList.getKey()));
    }
}
