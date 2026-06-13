import java.util.*;

class CharacterTypeFinder {

    static String checkType(char ch){

        ch = Character.toLowerCase(ch);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return "Vowel";

        if(ch>='a' && ch<='z')
            return "Consonant";

        return "Not a Letter";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        System.out.println("Character\tType");

        for(int i=0;i<text.length();i++){

            char ch=text.charAt(i);

            System.out.println(ch+"\t\t"+checkType(ch));
        }
    }
}