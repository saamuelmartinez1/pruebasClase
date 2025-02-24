package tema4.POO3.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Turismo kona = new Turismo("2123GMT", "23423h234",4,5, Turismo.TipoUso.PRFESIONAL);
        System.out.println(kona);
        Camion volvo = new Camion("2123GMT", "23423h234",12,5000,false);
        System.out.println(volvo);
        Moto hondaCB500 = new Moto("2345GYT", "23423h234",2,500);
        System.out.println(hondaCB500);
        System.out.println(hondaCB500.necesitaCarnet());
    }
}
