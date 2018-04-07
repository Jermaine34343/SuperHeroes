package superheros;

public class Falcon extends SuperHero implements IBlackHero, IFlight {


    public Falcon(String realName, String[] specialPowers) {
        super(realName, specialPowers);
    }

    public String Black() {
        return "My black hero is Falcon";
    }

    public String Flight() {
        return "Falcon can fly at 240 mph";
    }

    public String nameOfHero() {
        return getRealName();
    }

    public String[] listOfPowers() {
        return getSpecialPowers();
    }
}
