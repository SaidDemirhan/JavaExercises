public class Buyuk_sayi {
    public static void main(String[] args) {
        int[] zahlen = {8,2,1,9,1};
        System.out.println(maxzahl(zahlen));
        //maxzahl(zahlen);
    }

    public static int maxzahl(int[] zahlen){
        int max=0;
        for (int i=0 ; i<zahlen.length; i++){
            int zahl= zahlen[i];

            if(zahl>max){
                max=zahl;
            }
            //System.out.println(max);
        }
        return max;
    }
}
