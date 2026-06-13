import java.util.*;

class CharacterFrequencyNestedLoop {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            char[] arr = text.toCharArray();
            int[] freq = new int[arr.length];

            for(int i=0;i<arr.length;i++){

                freq[i] = 1;

                for(int j=i+1;j<arr.length;j++){

                    if(arr[i] == arr[j]){
                        freq[i]++;
                        arr[j] = '0';
                    }
                }
            }

            System.out.println("Character\tFrequency");

            for(int i=0;i<arr.length;i++){

                if(arr[i] != '0'){
                    System.out.println(arr[i] + "\t\t" + freq[i]);
                }
            }
        }
    }
}