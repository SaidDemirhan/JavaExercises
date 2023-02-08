package Abstract_class_ornegi;

public abstract class Hayvan {

    abstract void sesCikar();

    abstract void ayakSayisi();

    void nefesAlir(){

        System.out.println("Hayvanlar nefes almadan yasayamaz!");
    }

    //hem Abstaract hem de concrete method bulunabilir.
    //Abstract methodu isterse implement eder ama concrete metodu almak zorundadir
    // eger concrete methodda bir degisiklik yapmak isterse yazar yoksa yazmasina gerek yok!

    String cins= "tanimlanmamis";
    //instance veri de tanimlanabilir.

    //String cins;
    //bu sekilde tanimlamadan da her birinde kullanmak üzere olusturlabilir.

}
