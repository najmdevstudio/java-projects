import java.util.Scanner;

public class elemDel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={19, 34, 48, 12, 98, 47, 56};
        for(int i: arr){
            System.out.println(i);
        }

        System.out.println("\n Enter element to be deleted:");
        int elem = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elem){
                arr[i] = 0;
            }

        }

        System.out.println("\n Array after element deletion:");

        for(int i: arr){
            System.out.println(i);
        }
    }
}
