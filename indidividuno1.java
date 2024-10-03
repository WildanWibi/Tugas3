import java.util.Scanner;
public class indidividuno1 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        int bilangan1, bilangan2 , bilangan3;

        System.out.print("Masukkan Bilangan 1 : ");
        bilangan1 = input14.nextInt();
        
        System.out.print("Masukkan Bilangan 2 : ");
        bilangan2 = input14.nextInt();
        
        System.out.print("Masukkan Bilangan 3 : ");
        bilangan3 = input14.nextInt();

        if (bilangan2 > bilangan1) {
            if (bilangan2 > bilangan3)
            System.out.println("Bilangan 2 adalah Bilangan Terbesar");
            else
            System.out.println("Bilangan 3 adalah Bilangan Tebesar");

        }  else if (bilangan3 > bilangan1)
        
        if (bilangan3 > bilangan2)
        System.out.println("Bilangan 3 adalah Bilangan terbesar");
        else 
        System.out.println("Bilangan 2 adalah Bilangan terbesar");
        input14.close();
    }
}