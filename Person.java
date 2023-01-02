import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {
  private String gender;
  private LocalDate dateOfBirth;
  private String eligible;
  private LocalDate serviceStartDate;
  private LocalDate serviceEndDate;

  public Person(String gender, LocalDate dateOfBirth) {
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
  }

  public void setVaccineEligibility(LocalDate vaccinePeriodStart, LocalDate vaccinePeriodEnd) {
	
    Period age = Period.between(dateOfBirth, LocalDate.now());
    int ageInYears = age.getYears();
    int ageInMonths = age.getMonths();

    if (ageInYears >= 65 || (ageInYears == 2 && ageInMonths <= 6)) {
      eligible = "Y";
      serviceStartDate = vaccinePeriodStart;
      serviceEndDate = vaccinePeriodEnd;
    } else {
      eligible = "N";
      serviceStartDate = null;
      serviceEndDate = null;
    }
  }

  public String getEligible() {
    return eligible;
  }

  public LocalDate getServiceStartDate() {
    return serviceStartDate;
  }

  public LocalDate getServiceEndDate() {
    return serviceEndDate;
  }

  public String getGender() {
	  return gender;
  }
  public LocalDate getDateOfBirth() {
	  return dateOfBirth;
  }
}
