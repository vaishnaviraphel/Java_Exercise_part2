package Java_practice3;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        System.out.print("Enter your first string: ");
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next();
        System.out.print("Enter your second String: ");
        String s2 = sc.next();
        if(s1.equals(s2)){
            System.out.println("Wrong String");
        }
        int a=0;
        for (int i=0; i<s1.length();i++){
            for (int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    a++;
                    break;
                }
            }
        }
        if (a==s1.length()){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not Anagram");
        }
    }
}
