package Java_practice3;
import java.util.Scanner;
public class Existence {
    public static void main(String[] args) {
        int arr[][]={
                {2,6,13},
                {7,8,45},
                {4,80,15}
        };

        System.out.println("Check the number is available or not");
        System.out.print("Enter the number to check availability: ");
        Scanner sc = new Scanner(System.in);
        int check_no = sc.nextInt();
        int row = -1;
        int col = -1;
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == check_no) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        if(row!=-1 && col!=-1){
            System.out.println("Number "+check_no+" is available at position "+row+ ","+col);
        }
        else{
            System.out.println("Number is not found");
        }
    }
}
