import java.util.Scanner;
public class numword{
        public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
                case 1: 
               System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
                case 4:
                System.out.println("Four");
                case 5:
                System.out.println("Five");
                break;
                 case 6:
                System.out.println("Six");
                break;
                 case 7:
                System.out.println("Seven");
                break;
                 case 8:
                System.out.println("Eight");
                break;
                 case 9:
                System.out.println("Nine");
                break;
                default:
                System.out.println("Give only single digit and non zero  number");

}
sc.close();
}
}
