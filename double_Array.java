package Java_practice3;
import java.util.Scanner;
public class double_Array {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        for(int i=0;i< a.length;i++){
            int c=sc.nextInt();
            System.out.print(c*2+" ");
        }
    }
}
