public class FrequencyElement {

    public static void frequency(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

            }

            System.out.println(arr[i] + " -> " + count);
        }

    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 2, 4, 3, 2};

        frequency(arr);
    }
}
