import java.util.Scanner;

public class Faktoryel {
    public static void main(String[] args) {
        System.out.println("lütfen bir sayi giriniz: ");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();

        long faktoryel = 1;

        for (int i=1; i<=sayi; i++){
           // int faktoryel=1;
            faktoryel*=i;
            if (i==sayi)
                System.out.println(faktoryel);
        }

    }
}
