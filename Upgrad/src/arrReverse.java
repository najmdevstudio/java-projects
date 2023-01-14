public class arrReverse {
    public static void main(String[] args) {
        int [] arr ={19, 87, 56, 78, 67, 34, 23, 87, 98};

        int swap;
        int l= arr.length;

        for (int j : arr) {
            System.out.println(j);
        }

        for (int i = 0; i < (l/2); i++) {
            swap = arr[i];
            arr[i] = arr[(l-1)-i];
            arr[(l-1)-i]= swap;
        }
        System.out.println("\n Reversed array:");

        for (int j : arr) {
            System.out.println(j);
        }


    }
}
