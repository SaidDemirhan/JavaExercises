package Abstract_class_ornegi;

public class Marti extends Hayvan{
    @Override
    void sesCikar() {
        System.out.println("ciyak ciyak!");
    }

    @Override
    void ayakSayisi() {
        System.out.println("martilarin ayak sayisi ikidir.");
    }

    /*@Override
    void nefesAlir(){
        System.out.println("Hayvanlar nefes almadan yasayamaz!");
    }*/

    //bu method zaten soyut olmadigi icin extend den gelecektir
    //yeniden override etmeye gerek yoktur.

}
