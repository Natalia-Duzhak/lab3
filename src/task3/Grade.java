package task3;

import java.util.List;
import java.util.Objects;

public class Grade {
    private int grade;


    public Grade(final int grade){
        this.grade = grade;
    }

    public int getGrade() {

        return grade;
    }

    public void setGrade(final int grade) {

        if(grade > 1 && grade <5) this.grade = grade;
        else
            System.out.println("Invalid age");
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Grade g = (Grade) o;
            return grade == g.grade;
        }
    }

    @Override
    public int hashCode() {
        return 17 * this.getGrade();
    }
    public String toString() {
        return "Grade is: " + grade ;
    }
}
