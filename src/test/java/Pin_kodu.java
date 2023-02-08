import java.util.Scanner;

public class Pin_kodu {
    public static void main(String[] args) {
        int i;
        for ( i =0;i<3;i++){
            System.out.println("Lütfen PIN kodunu giriniz...");
            Scanner scanner=new Scanner(System.in);
            int girilen_kod=scanner.nextInt();
            String girilen_kod_string=Integer.toString(girilen_kod);
            int dogru_kod= 2358;
            System.out.println(girilen_kod_string.replaceAll("\\S","*"));

            if (girilen_kod==dogru_kod){
                System.out.println("Sisteme hos geldiniz!");
                break;
            }else if (i==0) {
                System.out.println("yanlis kod girisi yaptiniz,2. denemeniz..");
            }else if (i==1) {
                System.out.println("yanlis kod girisi yaptiniz,3. ve son hakkiniz!");
            }else if (i==2) {
                System.out.println("Sistem kilitlenmistir!!!");
            }
        }

    }
}
