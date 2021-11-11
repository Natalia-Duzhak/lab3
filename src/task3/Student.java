package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private Map <Subject,Grade> gradeMap = new HashMap<>();

    private String name;
    private String surname;
    private int course;
    private String specialty;
    private long id;


    public Student (final String name,final String surname,final int course, final String specialty,final Map <Subject,Grade> gradeMap, final long id){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.specialty = specialty;
        this. gradeMap = gradeMap;
        this.id = id;
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

    public int getCourse() {

        return course;
    }

    public void setCourse(final int course) {

        this.course = course;
    }

    public String getSpecialty() {

        return specialty;
    }

    public void setSpecialty(final String specialty) {

        this.specialty = specialty;
    }
    public Map <Subject,Grade> getGradeMap() {

        return gradeMap;
    }

    public void setGradeMap(final Map <Subject,Grade> gradeMap) {

        this.gradeMap = gradeMap;
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
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Student student = (Student) o;
            return name == student.name && surname.equals(student.surname)&& Objects.equals(course, student.course)&& specialty.equals(student.specialty)&& gradeMap.equals(student.gradeMap)  ;
        }
    }

    @Override
    public int hashCode() {
        return
                17 * this.getName().hashCode() +
                        17 * this.getSurname().hashCode()  +
                        17 * this.getCourse()+
                        17 * this.getSpecialty().hashCode() +
                        17 * this.getGradeMap().hashCode() ;
    }
    public String toString() {
        return  "Name : " + name + "," + "Surname: " + surname+ "," + "Course: " + course+ "," + "Specialty: " + specialty + getGradeMap()  + "Id: " + id + '\n';
    }

}