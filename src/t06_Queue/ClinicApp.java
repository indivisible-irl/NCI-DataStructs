package t06_Queue;

/**
 * Example of using the Clinic Queue
 * @author DavidA
 *
 */
public class ClinicApp {

	// new Clinic
	
	public static void main(String[] args){
		
		Clinic clinic = new Clinic();

		clinic.newPatient("Tom", "Headache");
		clinic.newPatient("Dick", "Broken leg");
		clinic.newPatient("Harry", "Face off");
		clinic.disp();
		
		clinic.seeNextPatient();
		clinic.disp();
		
		Patient p1 = new Patient("Jack", "Elephantitis");
		Patient p2 = new Patient("Jill", "Gangreene");
		clinic.newPatient(p1);
		clinic.newPatient(p2);
		clinic.disp();
		System.out.println("- Jack is number " +clinic.getPosition(p1)+ " in the queue.");
		System.out.println("- Jill is number " +clinic.getPosition(p2)+ " in the queue.");
		
		System.out.println("- The doctor has just seen " +clinic.seeNextPatient().getName());
		System.out.println("- Jack is now number " +clinic.getPosition(p1)+ " in the queue.");
		System.out.println("- Jill is now number " +clinic.getPosition(p2)+ " in the queue.");	
		System.out.println("- But " +clinic.checkNextPatient().getName()+ " is next.");
		System.out.println("- Sadly, " +clinic.checkLastPatient().getName()+ " is last in line.");
		System.out.println("\tHer poor " +clinic.checkLastPatient().getSymptom()+ "!");
		clinic.disp();
	}
	
}
