package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentSimple {
    private final Map<Subject,Grade> gradeMap = new HashMap<>();

    private String name;
    private String surname;
    private long id;

    public StudentSimple() {

    }
    public StudentSimple(final String name, final String surname, final long id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public String getName(){
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

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final StudentSimple that = (StudentSimple) o;
        return id == that.id && Objects.equals(gradeMap, that.gradeMap) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeMap, name, surname, id);
    }

    @Override
    public String toString() {
        return "StudentSimple{" +
                "gradeMap=" + gradeMap +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
