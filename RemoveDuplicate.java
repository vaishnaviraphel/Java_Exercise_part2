package Java_practice3;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next();
        String s2 = "";
        char c;
        for(int i=0;i<s1.length();i++){
            c=s1.charAt(i);
//            System.out.println(c);
            if(s2.indexOf(c)==-1){
                s2=s2+c;
            }
        }
        System.out.println(s2);
    }
}
