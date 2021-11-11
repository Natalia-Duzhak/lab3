package task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(final String... args) {

        final List<Student> students = new ArrayList<>();
        final List<StudentSimple> studentSimples = new ArrayList<>();


        final Map<Subject, Grade> gradeMap1 = new HashMap<>();
        final Map<Subject, Grade> gradeMap2 = new HashMap<>();
        final Map<Subject, Grade> gradeMap3 = new HashMap<>();
        final Map<Subject, Grade> gradeMap4 = new HashMap<>();

        final Student student1 = new Student("Natalia", "Duzhak", 2, "IT", gradeMap1, 214);


        gradeMap1.put(new Subject("Physics"), new Grade(5));
        gradeMap1.put(new Subject("English"), new Grade(4));
        gradeMap1.put(new Subject("Math"), new Grade(5));


        final Student student2 = new Student("Misha", "Duzhak", 2, "IT", gradeMap2, 432);


        gradeMap2.put(new Subject("Physics"), new Grade(3));
        gradeMap2.put(new Subject("English"), new Grade(3));
        gradeMap2.put(new Subject("Math"), new Grade(3));



        final Student student3 = new Student("Andriy", "Duzhak", 2, "IT", gradeMap3, 2156);


        gradeMap3.put(new Subject("Physics"), new Grade(5));
        gradeMap3.put(new Subject("English"), new Grade(5));
        gradeMap3.put(new Subject("Math"), new Grade(5));


        final Student student4 = new Student("Maria", "Duzhak", 2, "IT", gradeMap4, 4633);


        gradeMap4.put(new Subject("Physics"), new Grade(4));
        gradeMap4.put(new Subject("English"), new Grade(3));
        gradeMap4.put(new Subject("Math"), new Grade(2));


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


       System.out.println(studentSimple(students));
       System.out.println(bestStudents(students));
       getAllMarksEnglish(students);
       sortedStudents(students);
        System.out.println(bestAverageMark(students));
       returnSurname(students);


    }
    private static List studentSimple(final List<Student> students){
       return students.stream().map(obj -> new StudentSimple(obj.getName(), obj.getSurname(), obj.getId())).collect(Collectors.toList());

    }

    private static List<Student> bestStudents(final List<Student> students){
      return students.stream().filter(s->s.getGradeMap().values().stream().mapToInt(o ->o.getGrade()).average().orElse(0)>3).collect(Collectors.toList());

    }
    private static void getAllMark(final List<Student> students, final Subject subject){
        students.stream().map(e->e.getGradeMap().get(subject).getGrade()).distinct().forEach(System.out::println);

    }
    private static void getAllMarksEnglish(final List<Student> students){
        getAllMark(students,new Subject("English"));

    }
    private static void sortedStudents(final List<Student> students) {

        final Collection <Student> sort = students.stream()
                .sorted((o1,o2)->o1.getName()!= o2.getName()?o1.getName()
                        .compareTo(o2.getSurname()):o1.getSurname()
                        .compareTo(o2.getSurname()))
                .collect(Collectors.toList());

        System.out.println(sort);
    }
    private static double bestAverageMark(final List<Student> students) {
       return average(students.stream().findAny().get());


    }
    private static double average(final Student student){
        return student.getGradeMap().values().stream().mapToInt(e->e.getGrade()).average().orElse(0);
    }
    private static void returnSurname(final List<Student> students) {
        final List<String> transform = students.stream().map((s)->s.getSurname()+"-").collect(Collectors.toList());

        System.out.println(transform);

    }

}
