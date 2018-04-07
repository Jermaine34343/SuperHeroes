package superheros;

public class SuperGirl extends SuperHero implements IFlight {

    public SuperGirl(String realName, String[] specialPowers) {
        super(realName, specialPowers);

    }

    public String[] listOfPowers() {
        return getSpecialPowers();
    }

    public String nameOfHero() {
        return getRealName();
    }

    public String Flight() {
        return "Supergirl can fly at 7,200,000 mph ";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}