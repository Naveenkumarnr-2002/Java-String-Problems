import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
public class AgeCalculation {

    public static void main(String[] args) {

//        Getting Input From the user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Date of Birth(YYYY-MM-DD): ");
        String  dateOfBirth=scanner.nextLine();

//        Parsing date of birth into local Date
        LocalDate birthDate=LocalDate.parse(dateOfBirth);

//        Getting Current Date
        LocalDate CurrentDate=LocalDate.now();

//        Using Period Class To calculate age
        Period age=Period.between(birthDate,CurrentDate);

        System.out.println("Yours Age is: "+age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days");
    }


}
