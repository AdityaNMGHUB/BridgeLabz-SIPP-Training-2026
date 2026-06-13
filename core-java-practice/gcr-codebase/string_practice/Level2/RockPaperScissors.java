import java.util.*;

class RockPaperScissors {

    static String computerChoice(){

        int random=(int)(Math.random()*3);

        if(random==0)
            return "rock";
        else if(random==1)
            return "paper";
        else
            return "scissors";
    }

    static String winner(String user,String comp){

        if(user.equals(comp))
            return "Draw";

        if((user.equals("rock") && comp.equals("scissors")) ||
           (user.equals("paper") && comp.equals("rock")) ||
           (user.equals("scissors") && comp.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int userWin=0;
        int compWin=0;

        for(int i=1;i<=n;i++){

            String user=sc.next();

            String comp=computerChoice();

            String result=winner(user,comp);

            System.out.println(
                "User="+user+
                " Computer="+comp+
                " Winner="+result);

            if(result.equals("User"))
                userWin++;

            if(result.equals("Computer"))
                compWin++;
        }

        System.out.println("User Wins = "+userWin);
        System.out.println("Computer Wins = "+compWin);

        System.out.println(
          "User Win % = "+
          ((double)userWin/n)*100);

        System.out.println(
          "Computer Win % = "+
          ((double)compWin/n)*100);
    }
}