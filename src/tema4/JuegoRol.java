package tema4;

import java.util.Random;

public class JuegoRol {
    public static void main(String[] args) {
        Hero hero = new Hero("heroe", 10, 26, 50, 0, 16, 21);
        int rondas = 0;

        Random r = new Random();
        int enemigos = r.nextInt(1, 3);
        Hero enemigo1 = new Hero("enemigo1", 2, 12, 30, 0, 6, 8);
        Hero enemigo2 = new Hero("enemigo2", 2, 12, 30, 0, 6, 8);
        Hero enemigo3 = new Hero("enemigo3", 2, 12, 30, 0, 6, 8);
        while (hero.getHealth() > 0) {

            switch (enemigos) {
                case 1:
                    while (hero.getHealth() >= 0 && enemigo1.getHealth() >= 0) {

                        int huida = r.nextInt(1, 100);
                        if (huida <= 10) {
                            System.out.println("el enemigo ha huido");
                        } else {
                            hero.attack(enemigo1);
                            enemigo1.attack(hero);
                        }
                        if (hero.getHealth() > 0) {

                            System.out.println(" siguiente ronda:");
                            hero.descansar(hero);
                            hero.pocion(hero);
                            System.out.println("tienes " + hero.getHealth() + "puntos de vida");
                            rondas++;
                        }
                    }

                        break;

                        case 2:
                            while (hero.getHealth() > 0 && (enemigo1.getHealth() > 0 || enemigo2.getHealth() > 0)){
                                int huida = r.nextInt(1, 100);
                                if (huida <= 10) {
                                    System.out.println("el enemigo ha huido");
                                }else if (enemigo1.getHealth() > 0){
                                    hero.attack(enemigo1);
                                    enemigo1.attack(hero);
                                }else {
                                    hero.attack(enemigo2);
                                    enemigo2.attack(hero);
                                }
                            }
                            if (enemigo1.getHealth() <= 0 && enemigo2.getHealth() <= 0){
                                System.out.println("Siguiente ronda");
                                hero.descansar(hero);
                                System.out.println("Tienes "+ hero.getHealth()+" puntos de vida");
                                hero.pocion(hero);
                                rondas++;
                            }
                            break;
                case 3:
                    while (hero.getHealth() > 0 && (enemigo1.getHealth() > 0 || enemigo2.getHealth() > 0 || enemigo3.getHealth() > 0)){
                        int huirEnemigo = r.nextInt(1,100);
                        if (huirEnemigo <= 10){
                            System.out.println("El enmemigo a huido");
                        }else if (enemigo1.getHealth() > 0) {
                            hero.attack(enemigo1);
                            enemigo1.attack(hero);
                        }else if (enemigo2.getHealth() > 0){
                            hero.attack(enemigo2);
                            enemigo2.attack(hero);
                        }else {
                            hero.attack(enemigo3);
                            enemigo3.attack(hero);
                        }
                    }
                    if (enemigo1.getHealth() <= 0 && enemigo2.getHealth() <= 0 && enemigo3.getHealth() <= 0){
                        System.out.println("Siguiente ronda");
                        hero.descansar(hero);
                        System.out.println("Tienes "+ hero.getHealth()+" puntos de vida");
                        hero.pocion(hero);
                        rondas++;
                    }
                    break;
            }
        }
        System.out.println("Has perdido, has llegado hasta la ronda "+rondas);
    }
}
