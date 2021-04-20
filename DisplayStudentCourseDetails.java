package StudentAndCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DisplayStudentCourseDetails {

	static Course[] course = new Course[5];

	static {
		course[0] = new Course("Java", 10000, "Madhavan");
		course[1] = new Course("Spring", 18000, "Aravindh");
		course[2] = new Course("SpringBoot", 15000, "Gayathri");
		course[3] = new Course("AngularJs", 20000, "Sheela");
		course[4] = new Course("ReactJs", 12000, "Bavithra");
		System.out.println("Course Details Loaded " + Arrays.toString(course));
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Of Students You need to add ");
		int studentsCount = scan.nextInt();
		scan.nextLine();

		Student[] studentArray = new Student[studentsCount];

		for (int i = 0; i < studentArray.length; i++) {
			Student studObj = new Student();
			System.out.println("Enter Student Name");
			studObj.setStudentName(scan.nextLine());
			System.out.println("Enter Course");
			studObj.setCourseTaken(scan.nextLine());
			System.out.println("Enter Fee Paid");
			studObj.setFeePaid(scan.nextInt());
			System.out.println("Enter Date Of Joining");

			String date = scan.next();
			scan.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDate = LocalDate.parse(date, formatter);
			studObj.setDateOfJoining(localDate);

			studentArray[i] = studObj;
		}

		System.out.println(Arrays.toString(studentArray));

		DisplayStudentCourseDetails studentAndCourseDetails = new DisplayStudentCourseDetails();

		studentAndCourseDetails.displayStudentListIncompleteInFee(studentArray);
		studentAndCourseDetails.displayStudentListBasedOnTrainer(studentArray);
		studentAndCourseDetails.sortBasedOnDateOfJoining(studentArray);

	}

	/* Returns Student Name For Given Trainer */
	public void displayStudentListBasedOnTrainer(Student[] studentArray) {
		for (Course cor : course) {
			List<String> studentName = new ArrayList<String>();
			for (Student std : studentArray) {
				if (cor.courseName.equals(std.courseTaken)) {
					studentName.add(std.studentName);
				}
			}
			System.out.println("Trainer Name  " + cor.trainerName + " < == >" + " Student Name " + studentName);
		}
	}

	/* Returns Student List who are incomplete in fees */
	public void displayStudentListIncompleteInFee(Student[] studentArray) {
		List<String> studentInCompleteFee = new ArrayList<String>();
		for (Course cor : course) {
			for (Student std : studentArray) {
				if (cor.courseName.equals(std.courseTaken)) {
					if (cor.courseFees > std.feePaid) {
						studentInCompleteFee.add(std.studentName);
					}
				} else {
					continue;
				}
			}
		}
		System.out.println("Incomplete In fees :: " + studentInCompleteFee);
	}

	public Student[] sortBasedOnDateOfJoining(Student[] studentArray) {
		Student temp;
		for (int i = 0; i < studentArray.length; i++) {
			for (int j = i + 1; j < studentArray.length; j++) {
				if (studentArray[i].getDateOfJoining().isBefore(studentArray[j].getDateOfJoining())) {
					temp = studentArray[i];
					studentArray[i] = studentArray[j];
					studentArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(studentArray));
		return studentArray;
	}

}
