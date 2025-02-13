package tema4;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero1 = new Hero("paco",54,30,49,0,20,9);
        Hero hero2 = new Hero("pedro",54,35,60,0,30,9);


        System.out.println(hero1);
        System.out.println(hero2);
        int contador =0;
        while(contador==0){
            hero1.attack(hero2);
            System.out.println(hero2);
            hero2.attack(hero1);
            System.out.println(hero1);
            if(hero2.getHealth()<=0 || hero1.getHealth()<=0){
                hero1.victory(hero2);
                hero2.victory(hero1);

                contador ++;
            }
        }
    }

}
