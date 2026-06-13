import java.util.*;

class WordLength2DArray {

    static String[] splitWords(String text){

        int count=1;

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ')
                count++;
        }

        String[] words=new String[count];

        String temp="";
        int index=0;

        for(int i=0;i<text.length();i++){

            if(text.charAt(i)==' '){
                words[index++]=temp;
                temp="";
            }
            else{
                temp+=text.charAt(i);
            }
        }

        words[index]=temp;

        return words;
    }

    static String[][] getWordLength(String[] words){

        String[][] data=new String[words.length][2];

        for(int i=0;i<words.length;i++){

            data[i][0]=words[i];
            data[i][1]=String.valueOf(words[i].length());
        }

        return data;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String[] words=splitWords(text);

        String[][] result=getWordLength(words);

        System.out.println("Word\tLength");

        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t"+result[i][1]);
        }
    }
}