package Abstract_class_ornegi;

public class Inek extends Hayvan{

    @Override
    void sesCikar() {
        System.out.println("moooo!");
    }

    @Override
    void ayakSayisi() {
        System.out.println("ineklerin dort ayagi vardir");
    }

    /*@Override
    void nefesAlir(){
        System.out.println("Hayvanlar nefes almadan yasayamaz!");
    }*/

    //bu method zaten soyut olmadigi icin extend den gelecektir
    //yeniden override etmeye gerek yoktur.



}
