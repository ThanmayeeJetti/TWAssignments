import java.util.Scanner;

public class Collatz_Sequence {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n!=1){
            System.out.print(n+" ");
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            count=count+1;

        }
        System.out.print(1+" "+count);

    }
}
