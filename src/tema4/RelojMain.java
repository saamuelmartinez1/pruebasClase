package tema4;

public class RelojMain {
    public static void main(String[] args){
        Reloj reloj = new Reloj(15,23,33);
        reloj.amOrPm();
        reloj.showTime();
        System.out.println(reloj);
    }
}
