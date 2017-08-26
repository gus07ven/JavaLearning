import java.util.Scanner;

public class MyList {

    public int getKey(){
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.next());
        return key;
    }

    public int binSearch(int[] array, int value) {

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

            if (array[middle] == value) {
                found = true;
                position = middle;
            } else if (array[middle] > value)
                last = middle - 1;
            else
                first = middle + 1;
        }

        if(position < 0)
            return 0;
        else
            return 1;
    }


    public static void main(String args[]){

        int[] list = new int[args.length];

        for (int i = 0; i < args.length; i++) {
                list[i] = Integer.parseInt(args[i]);
        }

        MyList myList = new MyList();
        System.out.println(myList.binSearch(list, myList.getKey()));
    }
}
