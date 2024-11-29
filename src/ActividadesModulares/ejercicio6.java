package ActividadesModulares;

public class ejercicio6 {
    public static void main(String[] args) {
        tablasMultiplicar();
    }
    public static void tablasMultiplicar(){
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println("la tabla del"+i);
                System.out.println("es de " +j+" por "+i+"que es:"+i*j);
            }
            System.out.println();
        }
    }
    }
