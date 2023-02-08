package Interface_ornegi;

public interface EvcilHayvan {
    abstract void sesCikar();
    void beslen();      //abstract yazmasak bile zaten tüm methodlar Interface de absctact tir.

    public static void kacarMi(){
        System.out.println("Hayvan her zaman kacabilir!");
    }

}
