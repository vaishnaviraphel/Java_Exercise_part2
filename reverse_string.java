package Java_practice3;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        System.out.print("Enter your data: ");
        Scanner s= new Scanner(System.in);
        String s1= s.next();
//        for(int j=0; j<=s1.length();j++){
//            System.out.println(s1.charAt(j));
//        }
//        System.out.println("\n");

        for(int i=s1.length()-1;i>=0;i--){
            System.out.println(s1.charAt(i));
        }
    }
}
