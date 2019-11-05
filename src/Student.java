public class Student implements Comparable <Student>{

    private String lastName;
    private double gpa;

    public Student(String lastName, double gpa) {
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGpa() {
        return (Double.toString(gpa));
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override //zwraca liczbę całkowitą, któa jest ujemna jak obiekt 1 jest przed obiektem 2, dodatnią jak obiekt 1 jest za obiektem 2 a 0 jeśli obiekt 1=obiekt 2
    public int compareTo(Student student) {
        return Double .compare(gpa, student.gpa);
    }
}//end of class
