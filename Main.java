import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("male", LocalDate.of(1958, Month.JANUARY, 1));
		p.setVaccineEligibility(LocalDate.of(2022, Month.JUNE, 1), LocalDate.of(2022, Month.AUGUST, 31));
		
		
		String gender = p.getGender();
		LocalDate dateOfBirth = p.getDateOfBirth();
		System.out.println("Input:");
		System.out.println("Gender: " + gender);
		System.out.println("Date of birth: " + dateOfBirth);
		
		
		String eligible = p.getEligible();
		LocalDate serviceStartDate = p.getServiceStartDate();
		LocalDate serviceEndDate = p.getServiceEndDate();
		
		System.out.println("Eligible: " + eligible);
		System.out.println("Service start date: " + serviceStartDate);
		System.out.println("Service end date: " + serviceEndDate);

	
	}

	
}
