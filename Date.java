import java.util.Scanner;
public class Date{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date with formular DD/MM/YY");
        String date=sc.nextLine();
        String real=date.replace("/",".");
        System.out.println(real);
    }
}