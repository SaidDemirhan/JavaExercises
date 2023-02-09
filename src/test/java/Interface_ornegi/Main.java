package Interface_ornegi;

public class Main {
    public static void main(String[] args) {

        Kedi kedi =new Kedi();      //obje ürettik

        kedi.sesCikar();    //kedi ses cikarir
        kedi.beslen();      //kediler beslenmek zorundadir
        kedi.yürü();        //yürüyebiliyorum

        MuhabbetKusu muhabbetKusu=new MuhabbetKusu();

        muhabbetKusu.sesCikar();    //cik cik
        muhabbetKusu.beslen();      //kuslar da beslenir:)
        muhabbetKusu.uc();          //ucabiliyorum

        EvcilHayvan evcilHayvan =new MuhabbetKusu();

        evcilHayvan.beslen();       //kuslar da beslenir:)
        evcilHayvan.sesCikar();     //cik cik
        // evcilHayvan.uc(); methooduna buradan ulasamayiz.

        /*
        Hayvan sınıfı ve Kus sınıfı arasındaki ilişki belirtilmeden yapılan bu tanımlama,
        Kus sınıfının Hayvan sınıfından türettiği anlamına gelir.
        Bu durumda Kus sınıfı, Hayvan sınıfındaki metodları ve değişkenleri miras alır ve
        aynı zamanda kendi özelleştirdiği metodlar ve değişkenleri de içerebilir.

        Hayvan sınıfının tüm hayvanlar için ortak özellikleri tanımladığı varsayılabilir.
        Ancak, Kus sınıfı için bu ortak özellikler yeterli olmayabilir.
        Bu durumda Kus sınıfı Hayvan sınıfından türeyerek ortak özellikleri miras alır ve
        kendine özgü özellikler ekleyebilir.

        Bu tanımlama ile hayvan isimli bir nesne, Kus sınıfından bir nesne olarak tanımlanmış
        ve bu nesnenin metodları ve değişkenleri kullanılabilir.
         */


    }

}



/*
abstract class ve interface arasında bazı farklar bulunur. Bunlar şunlardır:

Abstract class'ların methodları hem abstract hem de concrete olabilir,
ancak interface'lerdeki tüm methodlar abstract'dır.

Abstract class'lar inheritance (kalıtım) yaparken birden fazla class'ı extend edemez,
ancak interface'ler birden fazla interface'i implement edebilir.

Abstract class'ların içerisinde instance veri bulunabilir, ancak interface'lerde bulunamaz.

Abstract class'lar concrete sınıflar tarafından extend edilir,
ancak interface'ler concrete sınıflar tarafından implement edilir.

Bu farklılıklar, programlamada kullanım amaçlarına göre belirlenmelidir. Örneğin,
bir sınıfın birden fazla interface'i implement etmesi gerektiğinde interface tercih edilir.
Aynı zamanda, abstract methodların yanı sıra concrete methodların da bulunması gerektiğinde
abstract class tercih edililir.
 */