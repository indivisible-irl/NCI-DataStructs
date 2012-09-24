package t06_Queue;

/**
 * Class to house a patient's name and symptoms.
 * @author DavidA
 *
 */
public class Patient {

	//// data
	private String name;
	private String symptom;
	
	//// constructor
	
	public Patient(String name, String symptom){
		setName(name);
		setSymptom(symptom);
	}
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setSymptom(String s){
		symptom = s;
	}
	public String getSymptom(){
		return symptom;
	}
	
	public String toString(){
		return getName() + " [ " + getSymptom() + " ]";
	}
}
