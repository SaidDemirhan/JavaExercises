package Inheritance_ornegi;

public class SporAraba extends Araba {

    //@Override

    /*void hizlan() {
        System.out.println("Spor araba hizlandi!");
    }*/

    //Eger burda method olmasa bile extend oldugu klasstaki tüm concrete methodlari alacaktir.

    //Ancak ayni isimle farkli body li bir method üretirsek önce bu klass taki methodu getirir.

    void sunroof(){
        System.out.println("Arabada Sunroof var");
    };
}

