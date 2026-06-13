import java.util.*;

class DeckOfCards {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] suits = {
        "Hearts","Diamonds","Clubs","Spades"
        };

        String[] ranks = {
        "2","3","4","5","6","7","8","9","10",
        "Jack","Queen","King","Ace"
        };

        String[] deck = new String[52];

        int index=0;

        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                deck[index++] =
                ranks[j]+" of "+suits[i];
            }
        }

        for(int i=0;i<deck.length;i++){

            int random =
            i+(int)(Math.random()*(52-i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        System.out.print("Players : ");
        int players = sc.nextInt();

        System.out.print("Cards per player : ");
        int cards = sc.nextInt();

        int current=0;

        for(int i=0;i<players;i++){

            System.out.println("\nPlayer "+(i+1));

            for(int j=0;j<cards;j++){

                System.out.println(deck[current]);
                current++;
            }
        }
    }
}