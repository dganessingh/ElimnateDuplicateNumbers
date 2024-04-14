import java.util.*;

public class Numbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numList = new int[10];

        System.out.println("Please enter 10 numbers.");

        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();

            if (input.matches("^\\d+$") == false) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }


            numList[i] = Integer.parseInt(input);

        }


        System.out.println("Original array: ");
        for (int num : numList) {
            System.out.println(num + " ");
        }

        int[] numListNew = eliminateDuplicates(numList);
        System.out.println("New array with distinct numbers: ");
        for (int num : numListNew) {
            System.out.println(num + " ");

        }

    }


    public static int[] eliminateDuplicates(int[] list){

        List<Integer> newList = new ArrayList<>();

        // loop through each number in original list
        for (int i : list) {
            // if newList does not contain the number, then add it
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }

        //newList contains Integers. Convert back to an array of int
        int size = newList.size();
        int[] result = new int[size];
        Integer[] temp = newList.toArray(new Integer[size]);
        for (int n = 0; n < size; ++n) {
            result[n] = temp[n];
        }

        // return int array
        return result;
    }


}
