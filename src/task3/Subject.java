package task3;

import java.util.Arrays;

public class Subject {

    private String sub;

    public Subject(final String subject){
        this.sub = subject;
    }

    public String getSubject() {

        return sub;
    }

    public void setSubject(final String subject) {

        this.sub = this.sub;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Subject s = (Subject) o;
            return sub == s.sub ;
        }
    }

    @Override
    public int hashCode() {
        return 17 * this.getSubject().hashCode() ;
    }
    public String toString() {
        return   "Subject is: " + sub +  '\n';
    }
}
