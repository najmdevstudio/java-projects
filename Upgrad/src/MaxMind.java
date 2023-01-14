public class MaxMind {
    public static void main(String[] args) {
        int[] arr = {98, 56, 7, 28, 3, 196, 2, 99, 102};
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        int min = arr[0];

        for (int i : arr) {
             if (i < min) {
                min = i;
            }
        }

        System.out.println("max is:" + max + "\n" + "min is:" + min);

    }
}
