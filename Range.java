import java.util.Scanner;

public class Range {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=0;
        int min=999999999;
        for(int j=0;j<n;j++){
            if(a[j]>max)
                max=a[j];
            if(a[j]<min)
                min=a[j];
        }
        int Range=max-min;
        System.out.println("Range is "+Range);
    }
}
