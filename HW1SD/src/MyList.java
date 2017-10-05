import java.util.Scanner;

public class MyList {

    public Double getKey(){
        Scanner scanner = new Scanner(System.in);
        Double key = Double.parseDouble(scanner.next());
        return key;
    }

    public int binSearch(Double[] array, Double value) {

        // Source:
        // 1. Majority of algorithm comes from Starting out with Java from Control Structures
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

            if (array[middle].doubleValue() == value.doubleValue()) {
                    found = true;
                    position = middle;
            } else if (array[middle].doubleValue() > value.doubleValue())
                last = middle - 1;
            else
                first = middle + 1;
        }

        if(position < 0)
            return -1;
        else
            return 1;
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
                Double previous = inputs[j - 1].doubleValue();
                Double next = inputs[j].doubleValue();
                if(previous > next){
                    temp = inputs[j - 1];
                    inputs[j - 1] = inputs[j];
                    inputs[j] = temp;
                }
            }
        }
        return inputs;
    }

    public int indexUnsorted(Double[] unsorted, Double keyValue){

        int index = 0;

        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i].doubleValue() == keyValue.doubleValue()){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String args[]){

        Double key;
        int resultBinSearch;
        Double[] unsortedInputs = new Double[args.length];
        Double[] sortedInputs;
        Double[] test = new Double[args.length];

        for (int i = 0; i < args.length; i++) {
                unsortedInputs[i] = Double.parseDouble(args[i]);
                test[i] = Double.parseDouble(args[i]);
        }

       /* System.out.println("----Unsorted inputs-----");
        for(Double unsort : unsortedInputs){
            System.out.println(unsort);
        }*/

        MyList myList = new MyList();
        key = myList.getKey();
        /*System.out.println("Key value is: " + key);*/
        sortedInputs = myList.bubbleSort(unsortedInputs);

       /* System.out.println("----Sorted inputs-----");
        for(Double sort : sortedInputs){
            System.out.println(sort);
        }*/
        resultBinSearch = myList.binSearch(sortedInputs,key);
        /*System.out.println("Bin search result is: " + resultBinSearch);*/

        if(resultBinSearch == 1){
            System.out.println(myList.indexUnsorted(test,key));
        } else {
            System.out.println("The key was not found!");
        }
    }
}


