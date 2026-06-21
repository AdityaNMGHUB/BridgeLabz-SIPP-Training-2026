public class removeADupli {
    public static void main(String[] args) {
        int[] arr = {1,13,123,1,12,1,9,11,11,0,121,123};

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {

                    for(int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    n--;
                    j--;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}