package Continent;

import Continent.Continent;

public enum Country {

    /*This code is not correct, and this class do not needed*/
    China(Continent.Asia), Ethiopia(Continent.Africa), France(Continent.Europe),
    UnitedStates(Continent.NorthAmerica), Chile(Continent.SouthAmerica), Fiji(Continent.Australia),
    Antarctica(Continent.Antarctica);

    private final Continent continent;

    // get methods go here

    Country(Continent continent) {
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }
}
