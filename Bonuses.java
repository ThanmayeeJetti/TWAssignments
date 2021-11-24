import java.util.Scanner;

public class Bonuses {
    public static void main(String[] args){
        int []hours=new int[7];
        Scanner s=new Scanner(System.in);
        int total=0;
        for(int i=0;i<7;i++) {
            hours[i] = s.nextInt();

        }
        int salary=0;
        for(int i=1;i<6;i++){
            total=total+hours[i];
            if (hours[i]<=8)
                salary=salary+hours[i]*100;
            if(hours[i]>8)
                salary=salary+hours[i]*100+((hours[i]-8)*15);


        }
        int amount;
        if(total>40){
            salary=salary+((total-40)*25);
        }
        if (hours[0]!=0)
            salary=salary+(hours[0]*150);

        if(hours[6]!=0)
            salary=salary+(hours[6]*125);

        System.out.println("The final salary is "+salary);
    }
}
