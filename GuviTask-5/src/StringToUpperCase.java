import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Class Creation
public class StringToUpperCase {
//    Main method
    public static void main(String[] args) {


//        Creating Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

                map(names);

    }

//    Method for mapping the String
    public static void map(Stream<String> names){
//        Maping the Stream to Convert Strings into UpperCase and Stored in the List
        List<String> ToupperCase= names.map(String::toUpperCase).collect(Collectors.toList());

//        Print Statement
        System.out.println(ToupperCase);
    }

}