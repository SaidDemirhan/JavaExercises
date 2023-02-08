package Interface_ornegi;

public class MuhabbetKusu implements EvcilHayvan, Ucabilme{
    @Override
    public void sesCikar() {
        System.out.println("cik cik");
    }

    @Override
    public void beslen() {
        System.out.println("kuslar da beslenir:)");
    }

    @Override
    public void uc() {
        System.out.println("ucabiliyorum");
    }
}
