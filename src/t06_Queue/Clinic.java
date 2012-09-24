package t06_Queue;

import java.util.Iterator;

public class Clinic {

	//// data
	Queue<Patient> queue;
	int patientsSeen = 0;
	
	
	//// constructor
	public Clinic(){
		queue = new Queue<Patient>();
	}
	
	//// methods
	
	public void newPatient(String name, String symptom){
		queue.enqueue(new Patient(name, symptom));
	}
	public void newPatient(Patient p){
		queue.enqueue(p);
	}
	public Patient checkNextPatient(){
		return queue.front();
	}
	public Patient checkLastPatient(){
		return queue.rear();
	}
	public Patient seeNextPatient(){
		patientsSeen += 1;
		return queue.dequeue();
	}
	public int numOfPatientsWaiting(){
		return queue.size();
	}
	public int numOfPatientsSeen(){
		return patientsSeen;
	}
	public int getPosition(Patient p){
		return queue.getPosition(p);
	}
	
	
	
	
	public void disp(){
		System.out.println("========== Current queue ==========");
		System.out.println("Patents in line: " +numOfPatientsWaiting());
		System.out.println("Patents seen:    " +numOfPatientsSeen());
		System.out.println("-----------------------------------");
		System.out.println("Queuing:");
		Iterator<Patient> i = queue.getIterator();
		while(i.hasNext()){
			System.out.println("\t" + i.next().toString());
		}
		System.out.println("===================================");
	}
}
