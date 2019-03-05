import java.util.ArrayList;
import java.util.Arrays;

public class StudentRecordSystem {

	private static StudentRecordSystem studentRecordSystem;
	private StudentRecord[] studentRecords;
	private int totalStudentRecords;	// Actual number of student records currently in the system.
	
	static {
		studentRecordSystem = new StudentRecordSystem();
	}
	
	private StudentRecordSystem() {}
	
	public static StudentRecordSystem initializeInstance(int maxNumberOfStudentRecords){
		studentRecordSystem.studentRecords = new StudentRecord[maxNumberOfStudentRecords];
		studentRecordSystem.totalStudentRecords = 0;
        return studentRecordSystem;
    }
	
	// Getters
	public StudentRecord[] getStudentRecords() {
		return studentRecords;
	}
	
	public int getTotalStudentRecords() {
		return totalStudentRecords;
	}
	
	public void addAllStudents(StudentRecord[] sr) {
		ArrayList<StudentRecord> list = new ArrayList<StudentRecord>();
		for(int i = 0; i<totalStudentRecords; i++) {
			list.add(studentRecords[i]);
		}
		for(StudentRecord s: sr) {
			list.add(s);
		}
		studentRecords = list.toArray(new StudentRecord[0]);
		totalStudentRecords += sr.length;
	}
	
    /*
	 * IMPLEMENT USING AN ENHANCED FOR LOOP (For-each).
	 * 
	 * Adds a new student record with the given parameters.
	 * 
	 * HINT: Create a new array twice the size of the original array and move 
	 * all the elements to this mew array if the totalStudentRecords exceeds 
	 * the capacity of the current array.
	 */
	public void addStudentRecord(String id, String name, Gender gender, double gpa) {
		//Write your code here
		
	}


	/* IMPLEMENT USING A REGULAR FOR LOOP.
	 * 
	 * Returns an array of Strings where each entry represents a student record.
	 * 
	 * HINT: Use the toString method in the Student Record inner class.
	 */
	public String[] recordsToString() {
		//Write your code here
		return null; //Dummy return
	}
	
	/* IMPLEMENT USING A WHILE LOOP.
	 * 
	 * Returns true if this list contains the specified student. More 
	 * formally, returns true if and only if this list contains at 
	 * least one element e such that (o==null ? e==null : o.equals(e)).
	 * 
	 * 
	 */
	public boolean contains(StudentRecord s) {
		//Write your code here
		return false; //Dummy return
	}

	/* IMPLEMENT WITH ANY LOOP.
	 * 
	 * Returns the minimum element of the student record system, according 
	 * to the natural ordering of its GPA.
	 * 
	 */
	public double minStudentGPA() {
		//Write your code here
		return 0; //Dummy return
	}
	
/* IMPLEMENT WITH ANY LOOP.
	 * 
	 * Returns the maximum element of the student record system, according 
	 * to the natural ordering of its GPA.
	 * 
	 */
	public double maxStudentGPA() {
		//Write your code here
		return 0; //Dummy return
	}
	
	/* IMPLEMENT WITH ANY LOOPS
	 * 
	 * Returns the average of the GPA's in student record system.
	 */
	public double averageStudentGPA() {
		//Write your code here
		return 0; //Dummy return
	}
	
	/* IMPLEMENT WITH NESTED LOOPS.
	 * 
	 * Returns true if two instances of StudentRecord have the same name, false otherwise.
	 * HINT: Use the Equals method.
	 */
	public boolean repeatedStudentNames() {
		//Write your code here
		return false; //Dummy return
	}
	
	/*
	 * Enum of type Gender representing male or female.
	 */
	public enum Gender {
		MALE('M'), FEMALE('F');
		private final char letter;
		Gender(char letter) { this.letter = letter; }
		public char genderLetter() { return letter; }
	}
	
	/*
	 * Inner class representing student records in the student record system.
	 */
	public static class StudentRecord {
		
		private String id;
		private String name;
		private Gender gender;
		private double gpa;
		
		public StudentRecord(String id, String name, Gender gender, double gpa) {
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.gpa = gpa;
		}

		public String toString() {
			return String.format("ID: " + id + ", Name: " + name + ", Gender: " + gender.genderLetter() + ", GPA: %.2f", gpa);
		}
		
		// Getters
		public String getID() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public Gender getGender() {
			return gender;
		}
		
		public double getGPA() {
			return gpa;
		}
	}
}
