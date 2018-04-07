package superheros;

public class GreenLantern extends SuperHero implements IFlight{


    public GreenLantern(String realName, String[] specialPowers) {
        super(realName, specialPowers);
    }

    public String[] listOfPowers(){
        return getSpecialPowers();
    }

    public String nameOfHero(){
       return getRealName();
    }


    public String Flight() {
        return "Green Lantern can fly at 1,440 mph";
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
