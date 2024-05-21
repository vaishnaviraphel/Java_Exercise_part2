package Java_practice3;
import java.util.Scanner;
public class markswitharray {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner a = new Scanner(System.in);
        int arr[]=  new int[3];
        for(int i=0;i< arr.length;i++){
            int b = a.nextInt();
            System.out.println("Marks are: "+b);
        }
    }
}
