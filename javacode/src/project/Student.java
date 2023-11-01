package project;
import java.util.ArrayList;

public class Student {
private ArrayList<student>students=new ArrayList<>();
public void addStudent(Student student) {
	students.add(student);
}
	public  void removeStudent(int rollNumber)
	student.add(student);
}
public void removeStudent(int rollNumber)
{
	
		
		     private String name;
		     private int rollNumber;
		     private String grade;

		     public Student(String name, int rollNumber, String grade) {
		         this.name = name;
		         this.rollNumber = rollNumber;
		         this.grade = grade;
		     }

		     public String getName() {
		         return name;
		     }

		     public int getRollNumber() {
		         return rollNumber;
		     }

		     public String getGrade() {
		         return grade;
		     }
		 }

		 public class StudentManagementSystem {
		     private ArrayList<Student> students = new ArrayList<>();

		     public void addStudent(Student student) {
		         students.add(student);
		     }

		     public void removeStudent(int rollNumber) {
		         students.removeIf(student -> student.getRollNumber() == rollNumber);
		     }

		     public Student searchStudent(int rollNumber) {
		         for (Student student : students) {
		             if (student.getRollNumber() == rollNumber) {
		                 return student;
		             }
		         }
		         return null;
		     }

		     public void displayAllStudents() {
		         System.out.println("List of Students:");
		         for (Student student : students) {
		             System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Grade: " + student.getGrade());
		         }
		     }
		 }

		 public class StudentManagementApp {
		     public static void main(String[] args) {
		         StudentManagementSystem system = new StudentManagementSystem();
		         Scanner scanner = new Scanner(System.in);

		         while (true) {
		             System.out.println("\nOptions:");
		             System.out.println("1. Add Student");
		             System.out.println("2. Remove Student");
		             System.out.println("3. Search Student");
		             System.out.println("4. Display All Students");
		             System.out.println("5. Exit");
		             System.out.print("Enter your choice: ");

		             int choice = scanner.nextInt();
		             scanner.nextLine(); // Consume newline

		             switch (choice) {
		                 case 1:
		                     System.out.print("Enter student name: ");
		                     String name = scanner.nextLine();
		                     System.out.print("Enter student roll number: ");
		                     int rollNumber = scanner.nextInt();
		                     scanner.nextLine(); // Consume newline
		                     System.out.print("Enter student grade: ");
		                     String grade = scanner.nextLine();
		                     system.addStudent(new Student(name, rollNumber, grade));
		                     System.out.println("Student added successfully!");
		                     break;

		                 case 2:
		                     System.out.print("Enter student roll number to remove: ");
		                     int rollNumToRemove = scanner.nextInt();
		                     scanner.nextLine(); 
		                     system.removeStudent(rollNumToRemove);
		                     System.out.println("Student removed successfully!");
		                     break;

		                 case 3:
		                     System.out.print("Enter student roll number to search: ");
		                     int rollNumToSearch = scanner.nextInt();
		                     scanner.nextLine(); // Consume newline
		                     Student foundStudent = system.searchStudent(rollNumToSearch);
		                     if (foundStudent != null) {
		                         System.out.println("Student found:");
		                         System.out.println("Name: " + foundStudent.getName() + ", Roll Number: " + foundStudent.getRollNumber() + ", Grade: " + foundStudent.getGrade());
		                     } else {
		                         System.out.println("Student not found.");
		                     }
		                     break;

		                 case 4:
		                     system.displayAllStudents();
		                     break;

		                 case 5:
		                     System.out.println("Exiting the application.");
		                     scanner.close();
		                     System.exit(0);
		                     break;

		                 default:
		                     System.out.println("Invalid choice. Please choose a valid option.");
		             }
		         }
		     }
		 
		// TODO Auto-generated method stub

	}

}
