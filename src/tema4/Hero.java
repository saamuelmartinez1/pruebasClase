package tema4;

import java.util.Random;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getlevel() {
        return level;
    }

    public void level(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public static void drinkPotion(int health){
        health = health +10;
    }
    public static void rest(int health){

        health = health +50;
    }
    public String toString() {
        return "Hero:\n" +
                "Name: " + name + "\n" +
                    "Level: " + level + "\n" +
                "Health: " + health + " / " + maxHealth + "\n" +
                "Experience: " + experience + "\n" +
                "Attack: " + attack + "\n" +
                "Defense: " + defense;
    }

    public void attack(Hero objeto){
        Random r = new Random();
        int ataque = r.nextInt(1,maxAttack(objeto));
        objeto.health -= ataque;
        experience += 10;
        if (experience >= 50){
            experience = 0;
            levelUp();
        }
        System.out.printf("El ataque de " +objeto.name+ " sido de %d de daño %n", ataque);
    }
    public void levelUp(){
        experience +=5;
        attack += 1;
        defense +=1;

    }
    private int maxAttack(Hero objeto){
        int max;
        if (attack > objeto.defense){
            max = attack - objeto.defense;
        }else {
            max = 10;
        }
        return max;
    }
    public  void victory(Hero objeto){
        if(objeto.getHealth()<=0){
            System.out.println("la batalla ha acabado el ganador es "+objeto.getName());
        }
    }
    public void descansar(Hero objeto){
        Random r = new Random();
        int descansar = r.nextInt(1,1000);
        if(descansar == 1){
        objeto.health = maxHealth;
            System.out.println("consiguio curarse");
        }else{
            System.out.println(" no pudo curarse");
        }

    }
    public void pocion(Hero objeto){
        Random r = new Random();
        int pocion = r.nextInt(1,10);
        if(pocion ==1){
            System.out.println("el heroe se curo");
            health = health +10;
            if( health >= maxHealth ){
                health = maxHealth;
            }
        }else{
            System.out.println(" no encontro ninguna pocion");
        }
    }
}
