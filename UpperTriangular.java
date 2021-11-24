import java.util.Scanner;

public class UpperTriangular {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int a[][]=new int[row][row];
        int col=row;
        int count=1;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
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
