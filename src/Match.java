public class Match {
    Fighter f1;
    Fighter f2;

    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;


    }

    void run() {
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                this.f2.health = this.f1.hit(this.f2);
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f2.name + "Canı :" + this.f2.health);

                System.out.println(this.f1.name + "Canı :" + this.f1.health);

                if (this.f1.health == 0) {
                    System.out.println(this.f2.name + " Kazandı !!");
                    isWin();
                }
               else if (this.f2.health==0){
                    System.out.println(this.f1.name+" Kazandı !!");
                    isWin();
                }

            }


        }
    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    boolean isWin(){
        return true;
    }

}



