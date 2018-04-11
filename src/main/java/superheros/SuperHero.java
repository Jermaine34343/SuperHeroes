package superheros;

import java.util.Arrays;

public abstract class SuperHero implements IFlight {

private String realName;
private String[] specialPowers;

public  SuperHero(String realName, String [] specialPowers){
    this.realName = realName;
    this.specialPowers = specialPowers;
}

    public abstract String nameOfHero();
    public abstract String[] listOfPowers();
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(String[] specialPowers) {
        this.specialPowers = specialPowers;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "realName='" + realName + '\'' +
                ", specialPowers=" + Arrays.toString(specialPowers) +
                '}';
    }
}
