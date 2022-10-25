package ru.netology.entity;

public class Location {

    private final String city;

    private final Country country;

    private final String street;

    private final int builing;

    public Location(String city, Country country, String street, int builing) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.builing = builing;
    }

    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getBuiling() {
        return builing;
    }

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        Location object = (Location) obj;
        if ((((Location) obj).getCountry() == null && this.getCountry() == null) &&
            (((Location) obj).getCity() == null && this.getCity() == null) &&
            (((Location) obj).getStreet() == null && this.getStreet() == null) &&
                (((Location) obj).getBuiling() == this.getBuiling())) {
            return true;
        }
        return this.getCountry().equals(object.getCountry()) &&
                this.getCity().equals(object.getCity()) &&
                ((this.getStreet() == null && object.getStreet() == null) || (this.getStreet().equals(object.getStreet()))) &&
                this.getBuiling() == object.getBuiling();
    }
}
