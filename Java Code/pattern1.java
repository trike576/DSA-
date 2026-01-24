import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        int  currentRow = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows you want: ");
        int noOfRows = scanner.nextInt();
        int noOfStars = 1, noOfSpaces = 2 * noOfRows - 3;
        String star = "*";
        String space = " ";
        while (currentRow != noOfRows){
            if(currentRow == noOfRows - 1){
                System.out.println(star.repeat(2*noOfRows - 1));
                currentRow ++;
            }
            else{
                System.out.print(star.repeat(noOfStars));
                System.out.print(space.repeat(noOfSpaces));
                System.out.print(star.repeat(noOfStars));
                System.out.println();
                currentRow ++;
                noOfStars ++;
                noOfSpaces -= 2;
            }

        }
    }
}
