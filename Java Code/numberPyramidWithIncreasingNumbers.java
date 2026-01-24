import java.util.Scanner;

public class numberPyramidWithIncreasingNumbers {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Variables
        System.out.print("Enter number of rows you want: ");
        int noOfRows = scanner.nextInt();
        int currentRow = 0;
        int noOfStars = 1;
        int no = 1;
        String space = " ";


        // Loop
        while (currentRow < noOfRows){
            for (int i = 0; i < noOfStars; i++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
            currentRow++;
            noOfStars++;
        }
    }
}
