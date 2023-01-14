import java.util.Scanner;

public class valueDetection {
    public static void main(String[] args) {
        int [] arr = {19, 56, 87, 56, 47, 29, 78};
        Scanner input = new Scanner(System.in);
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println("\n Enter element to search:");
        int elem = input.nextInt();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==elem){
                System.out.println("Element exists at index number: "+i);
                break;
            }

        }
    }
}
