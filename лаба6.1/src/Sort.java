import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        List example = new List();
        for(Student student:example.list){
            System.out.println(student.toString());
        }
        Collections.sort(example.list, new SortingStudentsByGPA());
        System.out.println("После сортировки:");
        for(Student student:example.list){
            System.out.println(student.toString());
        }
    }
}
