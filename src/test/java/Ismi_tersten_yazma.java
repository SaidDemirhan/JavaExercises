import java.util.Scanner;

public class Ismi_tersten_yazma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz: ");

        String isim= scanner.nextLine();
        System.out.println(isim);

        /*StringBuilder sb=new StringBuilder(isim);
        String ters_isim= sb.reverse().toString();
        System.out.println(ters_isim);*/

        String ters_isim2;
        for (int i=isim.length()-1; i>-1;i--){
            System.out.print(isim.charAt(i));
        }



        scanner.close();


    }
}
