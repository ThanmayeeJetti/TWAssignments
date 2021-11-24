import java.util.*;
public class dora{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int treeno=sc.nextInt();
        if(treeno < cols && treeno>=0){
            System.out.println("yes");
        }
        else if(treeno % cols-1==1 || treeno%cols==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
