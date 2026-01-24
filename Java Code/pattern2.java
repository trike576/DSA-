import java.util.Scanner;

public class pattern2{
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String star = "*";
        String space = " ";
        System.out.print("Enter number of rows you want:");
        int noOfRows = scanner.nextInt();
        int currentRow = 0;
        int noOfStars = noOfRows;
        int noOfSpaces = 0;
        while( currentRow != noOfRows){
            System.out.print(space.repeat(noOfSpaces));
            System.out.println(star.repeat(noOfStars));
            noOfSpaces ++;
            currentRow ++;
        }
    }
}