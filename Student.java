package StudentAndCourse;

import java.time.LocalDate;


public class Student  {

	String studentName;

	String courseTaken;

	int feePaid;

	LocalDate dateOfJoining;


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}

	public int getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(int feePaid) {
		this.feePaid = feePaid;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", courseTaken=" + courseTaken + ", feePaid=" + feePaid
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}


	/*
	 * @Override public int compareTo(Student std) {
	 * 
	 * if (std.getDateOfJoining().before(this.getDateOfJoining())) { return -1; }
	 * else if (std.getDateOfJoining().after(this.getDateOfJoining())) { return 1; }
	 * else { return 0; } }
	 */

}





