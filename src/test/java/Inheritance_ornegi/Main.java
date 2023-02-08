package Inheritance_ornegi;

public class Main {
    public static void main(String[] args) {
        Araba araba=new Araba();
        SporAraba sporAraba=new SporAraba();

        araba.hizlan();     //Arac hizlandi

        sporAraba.hizlan();     //Arac hizlandi

        sporAraba.sunroof();       //Arabada Sunroof var
    }
}
