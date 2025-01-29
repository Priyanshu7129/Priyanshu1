import java.util.*;
public class hello{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                double sum = 0;
                int digits = 0;
                int temp = num;
                while(temp>0){
                        temp = temp/10;
			digits++;
                        }
                temp = num;
                while(num!=0){
                        int rem = num%10;
                        sum = sum + Math.pow(rem,digits);
                        num = num / 10;
                }
                if(temp == sum){
                        System.out.println("is a armstrong number");
}
                else{
                        System.out.println("not a armstrong number");
}
}
}

