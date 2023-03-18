import java.string;

public class classWork {



//Q1
    public static void main(string[] arges){
        //Question 1.
        String firstName;
        firstName = "TahJae";
        String lastName;
        lastName = "Lewis";
        String fullName = "TahJae Lewis";
        System.out.println("fullName");
    }



//Q3
// Create an array of your top three musicians, use a while loop to loop through them and print out their names
static int  i = 1;
        //(i <= 3);
      //while ("Rodwave","Drake""Yeat");
        //Code Block to be excuted.
    {
        System.out.println("Rodwave" + i);
        i++;

    System.out.println("Drake" + i );
    i++;

    System.out.println("Yeat"+ i);
    i++;

    }

//- Create a static method that returns the value : Learning Java Is Fun
//- Finally, Call/invoke the method inside main()to see the result. 

    //Q4
    public static void main(string args){
        System.out.println("Learning Java is Fun");
}

// Create a static method that that accepts a number as an argument/parameter then prints from 0 to that number`
            // eg: if number passed as argument to method is five then print 0 1 2 3 4 5
//Q5
    public static int main(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (num > max) {
            }
            max = num;
            System.out.println(i++);
        }


        // Write a for-loop that prints every number from 13 - 19 including 19
//Q6
        for (int i = 13; i <= 19; i = i + 1) {
            System.out.println(i);
        }

        // Write a for-loop that prints only odd numbers between 1 and 20
//Q7
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        /* Create a variable to store a student's grade then print out the student's grade.
        - Next step, use if else and else if statements to account for the following below.
                - Test your code by changing the value(s) of the grade variable to see different results.

                - if a student's grade is between 90 and 100 then print you got an A
                - if a student's grade is between 89 and 80 then print you got a B
                - if a student's grade is between 79 and 70 then print you got a C
                - if a student's grade is between 69 and 60 then print you got an D
                - if a student's grade is  59 and below then print you got an F */
        //Q8
        int grade = 99; //assign value to the grade variable
        char letterGrade = 'A'; //assign a char value;
        //check if the grade is greater
        if (grade > 90) {
            System.out.println("You got an" + letterGrade);
        } else {
            System.out.println("Try Again");
        }

        // Perform the following calculations on the array below named arrayOfNumbers.
//Q9
        int[] numbersArray = {2, 34, 7, 48, 0, 13, 24};

        //Calculations to perform
        //      - Use a for-loop to print out all the elements in the array.
        //    - Also print out the sum of all the elements in the array.
        //  - Also print out the average of this array.

        //Create a method that prints numbers starting from 45 - 1.
        //However it should print the following based on the following conditions:
        for (int i = 45; i >= 1; i = 1)
            if ( i = 3) {
                System.out.println("Year");
            }

        if (i - 5) {
            System.out.println("Up");
        }

        // print the word Year, if the number is divisible by 3
        // print the word Up if the number is divisible by 5
        // Print the words Year Up if the number is divisible by both 3 and 5
          // If none of these applies then just print the number (value)*/
    } }