// Java Math
//The Java Math class has many methods that allows you to perform mathematical tasks on numbers
// Java Math method one is the Math.max(x,y) used for finding the highest value among numbers


public class Loops {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18"); // obviously
            // The if, else if and else
            int x = 20;
            int y = 18;
            if (x < y) {
                System.out.println("x is less than y");
            }
            else if  // Used if to specify a block of code to be executed if the first condition is false
            (x > y)
            {
                System.out.println("x is greater than y");
            }

            else   //Use the else statement to specify a block of code to be
            //executed if the condition is false.
            {
                System.out.println("x is greater");
            }

        }
// The short Hand if and else
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Java Math
        //The Java Math class has many methods that allows you to perform mathematical tasks on numbers
        // Java Math method one is the Math.max(x,y) used for finding the highest value among numbers

        System.out.println(Math.max(5, 10)); //the Math.max finds the highest number
        System.out.println(Math.min(5, 10));//the Math.min finds the lowest number
        System.out.println(Math.sqrt(25));//the Math.sqrt returns the square root of a number
        System.out.println(Math.abs(-2)); //the Math.abs returns the absolute postive of a number
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(randomNum);

        // The  java Switch statements
//Instead of writing many if else statements, you can use the switch statement.

//The switch statement selects one of many code blocks to be executed:


        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
//While loop
        int i = 1;
        while(i<6){
            System.out.println(i);
            i++;
        }

    }


    }



