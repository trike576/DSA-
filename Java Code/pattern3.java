import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows you want: ");
        int noOfRows = scanner.nextInt(), currentRow = 0;
        if (noOfRows %2 == 0){
            System.out.println("Diamond pattern with " + noOfRows + " rows is not possible.\n" +
                    "Printing diamond pattern with " + (noOfRows + 1) + " rows.");
        } else if (noOfRows < 0) {
            System.out.println("The diamond pattern is not possible with 0 rows.");
            return;
        }
        String plus = "+";
        String space = " ";
        int noOfSpaces = noOfRows / 2;
        int noOfPlus = 1;

        while (currentRow != noOfRows/2 + 1){
            System.out.print(space.repeat(noOfSpaces));
            System.out.print(plus.repeat(noOfPlus));
            System.out.println(space.repeat(noOfSpaces));
            noOfSpaces --;
            noOfPlus += 2;
            currentRow ++;
        }
        currentRow = 0;
        noOfSpaces = 1;
        noOfPlus -= 4;
        while (currentRow != noOfRows / 2){
            System.out.print(space.repeat(noOfSpaces));
            System.out.print(plus.repeat(noOfPlus));
            System.out.println(space.repeat(noOfSpaces));
            noOfSpaces ++;
            noOfPlus -= 2;
            currentRow ++;
        }
    }
}