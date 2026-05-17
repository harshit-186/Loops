
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , count=0 , sum = 0 ;
        System.out.println("Enter a number: ");
        for(; ;){
            n=sc.nextInt();
            if(n==0)
                break;
            if(n<0)
                continue;
            sum = sum+n;
            count++;
            
        }
        System.out.println("Sum is "+sum);
        System.out.println("And its Average is "+(sum/count));
    }
    
}
