import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Students Class Creation
public class Students {

//    Main method
    public static void main(String[] args) {

//        Student list Creation
        List<String> studentNames = new ArrayList<>(10);

        StudentsName(studentNames);
    }

//    Method for Find Student name Starts with "A"
    public static void StudentsName(List<String>studentNames){
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Names: ");

//        Getting Student name from User
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Student name"+(i+1) +": ");
            studentNames.add(scanner.nextLine());
        }
//        Filtering Student Whose name Starts with "A"
            List<String> nameStartWithA = studentNames.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());


        System.out.println("Total Students name's: "+studentNames);

        System.out.println("Students name's Start's With 'A': "+nameStartWithA);

    }
}