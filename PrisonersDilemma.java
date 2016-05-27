/**
 * Created by kimj6195 on 5/13/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class PrisonersDilemma{
    public static void main(String[]args){
        Scanner kb = new Scanner (System.in);

        System.out.println("Hello. What is your name?");
        String name = kb.next();

        System.out.println("\nOkay, " + name+ ". This is how Prisoner's Dilemma works. \n" +
                "     Imagine this:  Two members of a notorious gang are caught doing a petty robbery," +
                " stealing from a Jewelry Store\n- however the police have another file that contains an " +
                "unsolved mystery, that they are nearly sure was committed by these two.\n However, without " +
                "enough evidence to prosecute, they separate the two members, arbitrarily known now as " +
                "Person A and\n Person B into two rooms. The two aren't allowed to communicate with each " +
                "other, and the decision they make would affect both members.\n" +
                "\n" +
                "     They are quickly told that each would be serving 1 year in jail: however there would" +
                " be a catch. If Person A admits that Person B \ndid the crime, and Person B admits Person A " +
                "did the  crime, they would both serve not 1, but 3 years in jail. If both admit nothing,\n " +
                "they will keep the remaining one year. However, if Person A admits while Person B stays quite," +
                " or vice versa - Person A will be set free,\n while Person B will be set in jail for 3 years.\n" +
                "\n" +
                "    In our program however, the jail time is instead rewarded in terms of points: A confesses," +
                " B defects, the winner will receive a full\n 5 points. If both confess, each will earn 3, while " +
                "if they both defect, each will earn 1 point. \n " + "\n\n" +
                "Now you will be in this situation. Do you want to compete against the computer or a friend?"+
                "\n");
        String choice = kb.next();
        kb.nextLine();
        System.out.println("\nLet's begin!");
        System.out.println("\nRules:\n1. If Player A confesses, and Player B defects, the successful competitor" +
                " will receive 5 points.\n2. If Player A and B both confess, each earns 3 points.\n3." +
                " If player A and B both defect, each earns 1 point.");

        Games obj = new Games(name);

        if (choice.equals("friend")) {
            obj.friend();
        }

        if (choice.equals("computer")){
            System.out.println("\nThere are 3 game modes: Random, Retaliation, and Tit for Tat. !!!" +
                    "\nRandom: This game mode, which is most like a real situation in life,\n makes " +
                    "it so that the computer randomly chooses which path it will choose. It's" +
                    " randomized onto \n whether or not it will defect or cooperate. This is the most" +
                    " simple game mode as well. \n \n Retaliation: As it sounds, the computer will remember" +
                    " if you defect. As soon as you defect once, \n the computer will continue to defect," +
                    " no matter your continued choice. \n \n Tit for Tat: Arguably the most interesting " +
                    "out of the bunch, tit for tat works like this: \n Imagine in round 1, you cooperate" +
                    " while he defects. The next round, having witnessed your \n earlier cooperation," +
                    " the computer will then cooperate. However, this also works for the flip-side, \n " +
                    " if you were to, say defect on round 3, the following round, the computer will " +
                    "defect. \n\nWhich game mode would you like to play? \r");
            String choiceMode = kb.nextLine();

            if (choiceMode.equals("Random"))
                obj.random();

            if (choiceMode.equals("Retaliation"))
                obj.retaliation();

            if (choiceMode.equals("Tit for Tat"))
                obj.titForTat();
        }









    }

}
