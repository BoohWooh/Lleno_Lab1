import java.util.Scanner;
//This is for importing the input for Java

public class Lleno_Lab1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //settin up 'input' as the input variable

        int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //This is an array holding all of the possible whole numbers between 1-20 for easier looping

        while (true){
        System.out.println("Enter number (1-20): ");
        int number = input.nextInt();
        input.close();
        //Getting a value for the input variable


        //This checks if the input is valid or not
        if (number >= 21 || number <= 0){
            System.out.print("Please Try Again");
            break;
        }


        else {
        //This is the first half of the half-diamond
        for (int k = 0; k<= number; k++){
            for (int i = 0; i < k; i++){
                if (k == 1){
                    System.out.println("*");
                }
                if (i == 0){
                    System.out.print("*");
                }
                System.out.print(num[i]);
                    //This is for printing the first half of the number sequence
                if (i == 0 && k <= 1){
                    System.out.print("*");
                }
            }
            for (int j = k-2; j >= 0; j--){
                System.out.print(num[j]);
                    //This is for printing the second half of the number sequence
                if (j == 0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //This is the second half of the half-diamond
        for (int k = number -2 ; k >= 0; k--){
            for (int i = 0; i <= k; i++){
                if (i == 0){
                    System.out.print("*");
                }
                System.out.print(num[i]);
                    //This is for printing the first half of the number sequence
            }
            for (int j = k-1; j >= 0; j--){
                System.out.print(num[j]);
                    //This is for printing the second half of the number sequence
                if (j == 0){
                    System.out.print("*");
                }
            }
                if (k == 0){
                    System.out.println("*");
                    System.out.println("*");
                }
            System.out.println();
        }
        break;
    }
}
}
}

