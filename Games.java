
import java.util.Scanner;
import java.util.Random;

public class Games{
    private String name;

    Scanner kb = new Scanner(System.in);
    Random rand = new Random();

    public Games (String n){
        name = n;
    }
    public void friend(){
        String inputA, inputB;
        int ptsA=0;
        int ptsB =0;
        int turn =0;

        while (turn<9) {
            System.out.println("\nIt's Player A's turn! Type in C for Confess and D for Defect.");
            inputA = kb.next();
            System.out.println("It's Player B's turn! Type in C for Confess and D for Defect.");
            inputB = kb.next();

            if (inputA.equals("C") && inputB.equals("C")) {
                ptsA += 3;
                ptsB += 3;
            } else if (inputA.equals("C") && inputB.equals("D")) {
                ptsB += 5;
            } else if (inputA.equals("D") && inputB.equals("C")) {
                ptsA += 5;
            } else {
                ptsA += 1;
                ptsB += 1;
            }

            System.out.println("\nPlayer A: " + ptsA + " points \nPlayer B: " + ptsB + " points");

            turn += 1;
        }

        System.out.println("\nFINAL ROUND!!!");
        System.out.println("\nIt's Player A's turn! Type in C for Confess and D for Defect.");
        inputA = kb.next();
        System.out.println("It's Player B's turn! Type in C for Confess and D for Defect.");
        inputB = kb.next();

        if (inputA.equals("C") && inputB.equals("C")) {
            ptsA += 3;
            ptsB += 3;
        } else if (inputA.equals("C") && inputB.equals("D")) {
            ptsB += 5;
        } else if (inputA.equals("D") && inputB.equals("C")) {
            ptsA += 5;
        } else {
            ptsA += 1;
            ptsB += 1;
        }

        System.out.println("\nPlayer A: " + ptsA + " points \nPlayer B: " + ptsB + " points");

        if (ptsA>ptsB)
            System.out.println("\nPlayer A won!!!");

        else if (ptsB>ptsA)
            System.out.println("\nPlayer B won!!!");

        else
            System.out.println("\nTie!!!");


    }

    public void random(){
        System.out.println("\nSounds good. Get ready, " + name + "!");
        String inputA, inputB;
        int ptsA=0;
        int ptsB =0;
        int turn =0;

        while (turn<9) {
            System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
            inputA = kb.next();
            if (rand.nextInt(2)==0) {
                inputB = "C";
                System.out.println("It's my turn! I choose to confess.");
            }
            else {
                inputB="D";
                System.out.println("It's my turn! I choose to defect.");
                }

            if (inputA.equals("C") && inputB.equals("C")) {
                ptsA += 3;
                ptsB += 3;
            } else if (inputA.equals("C") && inputB.equals("D")) {
                ptsB += 5;
            } else if (inputA.equals("D") && inputB.equals("C")) {
                ptsA += 5;
            } else {
                ptsA += 1;
                ptsB += 1;
            }

            System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

            turn += 1;
        }

        System.out.println("\nFINAL ROUND!!!");
        System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
        inputA = kb.next();
        if (rand.nextInt(2)==0) {
            inputB = "C";
            System.out.println("It's my turn! I choose to confess.");
        }
        else {
            inputB="D";
            System.out.println("It's my turn! I choose to defect.");
        }


        if (inputA.equals("C") && inputB.equals("C")) {
            ptsA += 3;
            ptsB += 3;
        } else if (inputA.equals("C") && inputB.equals("D")) {
            ptsB += 5;
        } else if (inputA.equals("D") && inputB.equals("C")) {
            ptsA += 5;
        } else {
            ptsA += 1;
            ptsB += 1;
        }

        System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

        if (ptsA>ptsB)
            System.out.println("\nYou won!!!");

        else if (ptsB>ptsA)
            System.out.println("\nI won!!!");

        else
            System.out.println("\nTie!!!");



    }

    public void retaliation(){
        System.out.println("\nSounds good. Get ready, " + name + "!");
        String inputA="C";
        String inputB="C";
        int ptsA=0;
        int ptsB =0;
        int turn =0;

        while (turn<9) {
            if (inputA.equals("D"))
                inputB="D";
            System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
            inputA = kb.next();
            if (inputB.equals("C"))
                System.out.println("It's my turn! I choose to confess.");
            else
                System.out.println("It's my turn! I choose to defect.");

            if (inputA.equals("C") && inputB.equals("C")) {
                ptsA += 3;
                ptsB += 3;
            } else if (inputA.equals("C") && inputB.equals("D")) {
                ptsB += 5;
            } else if (inputA.equals("D") && inputB.equals("C")) {
                ptsA += 5;
            } else {
                ptsA += 1;
                ptsB += 1;
            }

            System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

            turn += 1;
        }

        System.out.println("\nFINAL ROUND!!!");
        System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
        inputA = kb.next();
        if (inputB.equals("C"))
            System.out.println("It's my turn! I choose to confess.");
        else
            System.out.println("It's my turn! I choose to defect.");

        if (inputA.equals("C") && inputB.equals("C")) {
            ptsA += 3;
            ptsB += 3;
        } else if (inputA.equals("C") && inputB.equals("D")) {
            ptsB += 5;
        } else if (inputA.equals("D") && inputB.equals("C")) {
            ptsA += 5;
        } else {
            ptsA += 1;
            ptsB += 1;
        }

        System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

        if (ptsA>ptsB)
            System.out.println("\nYou won!!!");

        else if (ptsB>ptsA)
            System.out.println("\nI won!!!");

        else
            System.out.println("\nTie!!!");

    }

    public void titForTat(){
        System.out.println("\nSounds good. Get ready, " + name + "!");
        String inputA;
        int ptsA=0;
        int ptsB =0;
        int turn =0;

        while (turn<9) {
            System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
            inputA = kb.next();
            if (inputA.equals("C"))
                System.out.println("It's my turn! I choose to confess.");
            else
                System.out.println("It's my turn! I choose to defect.");

            if (inputA.equals("C")) {
                ptsA += 3;
                ptsB += 3;
            }

            else {
                ptsA += 1;
                ptsB += 1;
            }

            System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

            turn += 1;
        }

        System.out.println("\nFINAL ROUND!!!");
        System.out.println("\nIt's your turn! Type in C for Confess and D for Defect.");
        inputA = kb.next();
        if (inputA.equals("C"))
            System.out.println("It's my turn! I choose to confess.");
        else
            System.out.println("It's my turn! I choose to defect.");

        if (inputA.equals("C")) {
            ptsA += 3;
            ptsB += 3;
        }

        else {
            ptsA += 1;
            ptsB += 1;
        }

        System.out.println("\nYou: " + ptsA + " points \nComputer: " + ptsB + " points");

        if (ptsA>ptsB)
            System.out.println("\nYou won!!!");

        else if (ptsB>ptsA)
            System.out.println("\nI won!!!");

        else
            System.out.println("\nTie!!!");
    }
}
