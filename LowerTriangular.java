import java.util.Scanner;

public class LowerTriangular {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int count=1;
        int a[][]=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                a[i][j]=count;
                count=count+1;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
