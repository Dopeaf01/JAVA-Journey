import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = True;
        for(i = 1; i = n/2; i++){
            if(n % i == 0){
                isPrime = false;
            break;
            }
        }
    }

    if(isPrime){
        if(n == 1){
            System.out.println("This is neither prime nor composite");
        }
        else{
            System.out.println("This is a prime number");
        }
        }else{
            System.out.println("This is not a prime number");
    }
}