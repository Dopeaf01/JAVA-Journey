import java.util.*;
public class switchy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Digga");
            break;
            
            case 2 : System.out.println("Chigga");
            break;

            case 3 : System.out.println("Nigga");
            break;

            default : System.out.println("Homie");
        }
    }
}







    //This is the old method and the above one is the new and easy one.
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int button = sc.nextInt();
    //     if(button == 1){
    //         System.out.println("Namaste");
    //     }
    //     else if(button == 2){
    //         System.out.println("Hello");
    //     }
    //     else if(button == 3){
    //         System.out.println("Bonjour");
    //     }
    //     else{
    //         System.out.println("Invalid");
    //     }
    // }