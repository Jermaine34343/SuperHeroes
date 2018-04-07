package superheros;

public class Flash extends SuperHero{


    public Flash(String realName, String[] specialPowers) {
        super(realName, specialPowers);
    }

    public String nameOfHero() {
        return getRealName();
    }

    public String[] listOfPowers() {
        return getSpecialPowers();
    }
}
