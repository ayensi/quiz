import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[] rightAnswers = {'A','B','B','A'};

        char[] answers = new char[4];

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        //store answer 1
        char answerOne = scan.next().charAt(0);
        answerOne = Character.toUpperCase(answerOne);
        answers[0] = answerOne;
        System.out.println("\nYour answer is "+answerOne);
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        //store answer 2
        char answerTwo = scan.next().charAt(0);
        answerTwo = Character.toUpperCase(answerTwo);
        answers[1] = answerTwo;

        System.out.println("\nYour answer is "+answerTwo);

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        char answerThree= scan.next().charAt(0);
        answerThree = Character.toUpperCase(answerThree);
        answers[2] = answerThree;

        System.out.println("\nYour answer is "+answerThree);


        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        char answerFour = scan.next().charAt(0);
        answerFour = Character.toUpperCase(answerFour);
        answers[3] = answerFour;

        System.out.println("\nYour answer is "+answerFour);

        int score = 0;


        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == rightAnswers[i]){
                score +=5;
            }
        }
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        if (score>=15) {
            System.out.println("Wow, you know your stuff!");
        }
        else if(score >5 && score <15){
            System.out.println("Not bad!");

        }
        else{
            System.out.println("Better luck next time :(");
        }
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 

        scan.close();

    }
}