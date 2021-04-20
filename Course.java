package StudentAndCourse;

public class Course {
	
	String courseName;
	
	int courseFees;
	
	String trainerName;

	public Course(String courseName, int courseFees, String trainerName) {
		super();
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.trainerName = trainerName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseFees=" + courseFees + ", trainerName=" + trainerName + "]";
	}

	}
