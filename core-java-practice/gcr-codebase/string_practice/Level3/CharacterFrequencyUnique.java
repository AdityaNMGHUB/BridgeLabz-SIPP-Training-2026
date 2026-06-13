import java.util.*;

class CharacterFrequencyUnique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] freq = new int[256];

        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }

        boolean[] visited = new boolean[256];

        System.out.println("Character\tFrequency");

        for(int i=0;i<text.length();i++){

            char ch = text.charAt(i);

            if(!visited[ch]){
                System.out.println(ch + "\t\t" + freq[ch]);
                visited[ch] = true;
            }
        }
    }
}