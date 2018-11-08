import java.util.ArrayList;

public class List {
    Student one = new Student("Anton", "Belov", 1);
    Student two = new Student("Stepan","Kolikov", 3);
    Student three = new Student("Gleb", "Milov", 4);
    Student four = new Student("Valera", "Gnomov", 2);
    ArrayList<Student> list = new ArrayList<>();
    List(){
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
    }
}
