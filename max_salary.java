package Java_practice3;

public class max_salary {
    public static void main(String[] args) {
        int[] a = {34,2,46,50,78,90,102,200};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                int n=a[i];
                max=n;
            }
        }
        System.out.println(max);
    }
}
