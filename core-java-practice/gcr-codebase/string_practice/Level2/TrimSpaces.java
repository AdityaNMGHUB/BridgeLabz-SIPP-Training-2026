import java.util.*;

class TrimSpaces {

    static String trimString(String text){

        int start=0;
        int end=text.length()-1;

        while(start<text.length() &&
              text.charAt(start)==' ')
            start++;

        while(end>=0 &&
              text.charAt(end)==' ')
            end--;

        String result="";

        for(int i=start;i<=end;i++)
            result+=text.charAt(i);

        return result;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String user=trimString(text);
        String built=text.trim();

        System.out.println("User : "+user);
        System.out.println("Built In : "+built);
        System.out.println(user.equals(built));
    }
}