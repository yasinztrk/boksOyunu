public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        this.dodge=dodge;


    }

    void fighterİnfo() {
        System.out.println("Dövüşcü İsmi :" + this.name);
        System.out.println("Dövüşcü Canı:" + this.health);
        System.out.println("Dövüşçü Kilosu:" + this.weight);
        System.out.println("Dövüşçü Hasarı:" + this.damage);
    }

    int hit(Fighter foe) {

        System.out.println(this.name + "=> " + foe.name + ">=" + this.damage + " Hasar Vurdu .");

        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen Hasarı Savurdu!!!");
            return foe.health;
        }

        if (foe.health - this.damage <= 0) {
            return 0;
        }

        return foe.health - this.damage;


    }

    boolean isDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
