import java.util.Scanner;

public class indexReterival {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={19, 34, 48, 12, 98, 47, 56};
        for(int i: arr){
            System.out.println(i);
        }

        System.out.println("\n Enter element to find the index:");
        int elem = input.nextInt();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elem){
                index = i;
            }

        }

        System.out.println("\n Index of "+elem+":");

        System.out.println(index);
    }
}
