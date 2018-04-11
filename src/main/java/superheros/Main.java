package superheros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
         Flash flash = new Flash("", new String[]{"Superspeed", "lightning strike"});
         GreenLantern greenLantern = new GreenLantern("Hal Jordan", new String[]{"harvesting will power"});
         Falcon falcon = new Falcon("Samuel Thomas Wilson", new String[]{"telepathically communicate with any bird"});
         SuperGirl superGirl = new SuperGirl(" Kara Zor-El", new String[]{"Flight, eye beam, super strength"});

         ArrayList<SuperHero> superHeroFlight = new ArrayList<SuperHero>();
         superHeroFlight.add(greenLantern);
         superHeroFlight.add(superGirl);
         superHeroFlight.add(falcon);


        Iterator<SuperHero> mmo = superHeroFlight.iterator();
        while(mmo.hasNext()){
            SuperHero result = mmo.next();
            System.out.println(result.Flight());;
        }

     // SuperHero[] superHeroes = new SuperHero[]{greenLantern, falcon, superGirl, flash};

       // IFlight[] flight = new IFlight[]{greenLantern,falcon, superGirl};
       // for(IFlight f : flight){
        //    System.out.println(f.Flight());
      //  }

        //  for(SuperHero powersOfHeores: superHeroes){
        // System.out.println(powersOfHeores.getRealName() + "posses these super powers: " + Arrays.toString(powersOfHeores.listOfPowers()));
        //System.out.println("==============================================================================================");
    }

    //System.out.println(greenLantern.Flight());
    //System.out.println("===================================================");
    //System.out.println(superGirl.Flight());
    //System.out.println("===================================================");
    //System.out.println(falcon.Black() + falcon.Flight());

}


