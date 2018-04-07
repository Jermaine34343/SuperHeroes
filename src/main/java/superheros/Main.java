package superheros;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flash flash = new Flash("", new String[]{"Superspeed", "lightning strike"});
        GreenLantern greenLantern = new GreenLantern("Hal Jordan", new String[]{"harvesting will power"});
        Falcon falcon = new Falcon("Samuel Thomas Wilson", new String[]{"telepathically communicate with any bird"});
        SuperGirl superGirl = new SuperGirl(" Kara Zor-El", new String[]{"Flight, eye beam, super strength"});

        SuperHero[] superHeroes = new SuperHero[] {flash, greenLantern, falcon, superGirl};

        for(SuperHero powersOfHeores: superHeroes){
            System.out.println(powersOfHeores.getRealName() + "posses these super powers: " + Arrays.toString(powersOfHeores.listOfPowers()));
            System.out.println("==============================================================================================");
        }

        System.out.println(greenLantern.Flight());
        System.out.println("===================================================");
        System.out.println(superGirl.Flight());
        System.out.println("===================================================");
        System.out.println(falcon.Black() + falcon.Flight());


    }
}
