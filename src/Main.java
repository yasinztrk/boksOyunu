public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Yasin", 15, 160, 85,60);
        Fighter f2 = new Fighter("Fatih", 12, 150, 75,50);


        /*f1.fighterİnfo();
        System.out.println("*********");
        f2.fighterİnfo();*/

        Match match=new Match(f1,f2,200,50);
        match.run();


    }
}