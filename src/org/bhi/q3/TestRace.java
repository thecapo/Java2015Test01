package org.bhi.q3;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestRace {

    public static void main(String[] args) {

        Race race1 = new Race();
        race1.setRaceid(100);
        race1.setTypeofrace("Graded Scratch Race");
        race1.setDistance(60);

        Race race2 = new Race();
        race2.setRaceid(110);
        race2.setTypeofrace("Handicap");
        race2.setDistance(70);

        Race race3 = new Race();
        race3.setRaceid(120);
        race3.setTypeofrace("Time Trial");
        race3.setDistance(35);

        System.out.println("Types of races of Eastern Vets");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println(race1.getTypeofrace());
        System.out.println(race2.getTypeofrace());
        System.out.println(race3.getTypeofrace());
    }

}
