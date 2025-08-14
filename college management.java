class College {
    private String collegeName;
    private String location;

    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    // Getter methods
    public String getCollegeName() {
        return collegeName;
    }

    public String getLocation() {
        return location;
    }

    // Setter methods
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
    }
}

// Child class: School (inherits from College)
class School extends College {
    private String schoolName;
    private String principalName;

    public School(String collegeName, String location, String schoolName, String principalName) {
        super(collegeName, location); // Call the constructor of the parent class
        this.schoolName = schoolName;
        this.principalName = principalName;
    }

    // Getter methods for School specific attributes
    public String getSchoolName() {
        return schoolName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    // Setter methods for School specific attributes
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public void displaySchoolInfo() {
        displayCollegeInfo(); // Call parent class method
        System.out.println("School Name: " + schoolName);
        System.out.println("Principal Name: " + principalName);
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        // Create an instance of the School class
        School engineeringSchool = new School("Tech University", "Silicon Valley", "School of Engineering", "Dr. Jane Doe");

        // Access and modify data using getter and setter methods
        System.out.println("Initial Information:");
        engineeringSchool.displaySchoolInfo();

        System.out.println("\nUpdating School Name...");
        engineeringSchool.setSchoolName("School of Advanced Engineering");
        System.out.println("New School Name: " + engineeringSchool.getSchoolName());

        System.out.println("\nUpdating College Location...");
        engineeringSchool.setLocation("Global Tech Park");
        System.out.println("New College Location: " + engineeringSchool.getLocation());

        System.out.println("\nFinal Information:");
        engineeringSchool.displaySchoolInfo();
    }
}