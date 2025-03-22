import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListEmptyOrNot {

    public static void main(String[] args) {

//        List of Strings
        List<String>ListStrings= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        EmptyOrNot(ListStrings);
    }

//    method Creation
    public static void EmptyOrNot(List<String>ListStrings){

//        Filter the List With String
        List<String>NonEmptyStrings=ListStrings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());

        System.out.println("String list: "+ListStrings);
        System.out.println("Non Empty Strings: "+NonEmptyStrings);

    }
}
