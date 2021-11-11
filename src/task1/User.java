package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private Address address = new Address();

    private String name;
    private String surname;
    private int age;
    private long id;
    private int phoneNumber;

    public User(final String name, final String surname, final int age, final long id, final int phoneNumber, final Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address.getNameOfTheCity();
        this.address.getStreetName();
        this.address.getHouseNumber();
        validate();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
        validate();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final User user = (User) o;
        return age == user.age && id == user.id && phoneNumber == user.phoneNumber && Objects.equals(address, user.address) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, surname, age, id, phoneNumber);
    }

    @Override
    public String toString() {
        return
                "Address=" + address +
                        ", Name='" + name + '\'' +
                        ", Surname='" + surname + '\'' +
                        ", Age=" + age +
                        ", Id=" + id +
                        ", Phone number=" + phoneNumber;
    }

    public void validate() {
        final List<String> exceptionsMessages = new ArrayList<>();
        if (getAddress().getNameOfTheCity() == null || getAddress().getNameOfTheCity().isEmpty()) {
            exceptionsMessages.add("City");
        }
        if (getAddress().getStreetName() == null || getAddress().getStreetName().isEmpty()) {
            exceptionsMessages.add("Street");
        }
        if (getAddress().getHouseNumber() == 0) {
            exceptionsMessages.add("House");
        }
        if (getName().isEmpty()) {
            exceptionsMessages.add("Name");
        }
        if (getSurname().isEmpty()) {
            exceptionsMessages.add("Surname");
        }
        if (getAge() < 1 || getAge() > 110) {
            exceptionsMessages.add("Age");
        }
        if (getId() < 1) {
            exceptionsMessages.add("Id");
        }
        if (getPhoneNumber() < 1) {
            exceptionsMessages.add("PhoneNumber");
        }
        if (!exceptionsMessages.isEmpty()) {
            throw new UncheckedException(exceptionsMessages, ErrorCode.ERROR_500);
        }

    }
}

