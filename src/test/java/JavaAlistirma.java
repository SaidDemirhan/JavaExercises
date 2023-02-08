import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaAlistirma {
    public static void main(String[] args) {
        System.out.println("nasilsin kocum?");
        int a = 32;
        double b= 3.14;
        float c= 3.14f;
        char d= 'A';
        String test= "ben String'im!";
        boolean e = false;
        long uzun= 12365;

        Scanner scanner=new Scanner(System.in);

        System.out.println("sayilarinizi giriniz: ");

        int i= scanner.nextInt();

        while (i>0){
            System.out.println(i);
            i--;

        }

        for (i=0; i<10; i+=2 ){
            System.out.println("i'nin degeri:"+i);
        }

        toplama(20,30);

        String cümle= "nasilsin, iyi misin?";

        System.out.println(cümle.toUpperCase());
        System.out.println(cümle.replaceAll("\\S","*"));

        StringBuilder sb= new StringBuilder();


        System.out.println(sb.append(cümle+ " kocum?"));

        int[] number={1,2,3};
        System.out.println(Arrays.toString(number));

        for (i=0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        //System.out.println(list);
        //list.addAll(Arrays.asList(number));



    }

    public static void toplama(int a,int b){

        System.out.println("sayilarin toplamlari: "+ (a+b));
    }
}
