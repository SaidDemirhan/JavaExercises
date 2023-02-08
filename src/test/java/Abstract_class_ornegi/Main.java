package Abstract_class_ornegi;

public class Main {
    public static void main(String[] args) {
        Inek inek=new Inek();
        Marti marti=new Marti();


        inek.sesCikar();    //moooo!                                    abstract
        inek.ayakSayisi();  //ineklerin dort ayagi vardir               abstract
        inek.nefesAlir();   //Hayvanlar nefes almadan yasayamaz!        concrete

        inek.cins="smental";        //bir instance veridir. burds farkli sekilde tanimladik.
        System.out.println(inek.cins);                              //smental

        marti.sesCikar();   //ciyak ciyak!                              abstract
        marti.ayakSayisi(); //martilarin ayak sayisi ikidir.            abstract
        marti.nefesAlir();  //Hayvanlar nefes almadan yasayamaz!        concrete

        System.out.println(marti.cins);                             //tanimlanmamis
        //instance veridir ama tanimlama yapmadik
    }
}
