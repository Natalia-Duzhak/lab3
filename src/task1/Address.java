package task1;

import java.util.Objects;

public class Address {
    private String nameOfTheCity;
    private String streetName;
    private int houseNumber;

    public Address(final String nameOfTheCity, final String streetName, final int houseNumber) {
        this.nameOfTheCity = nameOfTheCity;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address() {
        this.nameOfTheCity = "L";
        this.streetName = "M";
        this.houseNumber = 12;
    }

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    public void setNameOfTheCity(final String nameOfTheCity) {
        this.nameOfTheCity = nameOfTheCity;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(final int houseNumber) {
        this.houseNumber = houseNumber;

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Address address = (Address) o;
        return houseNumber == address.houseNumber && Objects.equals(nameOfTheCity, address.nameOfTheCity) && Objects.equals(streetName, address.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheCity, streetName, houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "Name of the city='" + nameOfTheCity + '\'' +
                ", Street name='" + streetName + '\'' +
                ", House number=" + houseNumber +
                '}';
    }
}
