package Interface_ornegi;

public class Kedi implements EvcilHayvan, Yürüyebilme{
    @Override
    public void sesCikar() {
        System.out.println("kedi ses cikarir");
    }

    @Override
    public void beslen() {
        System.out.println("kediler beslenmek zorundadir");
    }

    @Override
    public void yürü() {
        System.out.println("yürüyebiliyorum");
    }
}
