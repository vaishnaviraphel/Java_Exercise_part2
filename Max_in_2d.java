package Java_practice3;

public class Max_in_2d {
    public static void main(String[] args) {
        int[][] arr = {
                {7,9,45},
                {0,35,67},
                {13,68,90}
        };
        int max_no = arr[0][0];
        int max_row = 0;
        int max_col = 0;

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                max_no = arr[i][j];
                max_row = i;
                max_col = j;
            }
        }
        System.out.println(max_no+" is the max number at position "+(max_row+1)+ ","+ (max_col+1)+" ");
    }
  }