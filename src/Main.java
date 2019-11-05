import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double [] data = {4.,1.,9.};

        Arrays.sort(data);
        System.out.println(data);

        Student s1=new Student("Ola",5.0);
        Student s2=new Student("Remek",4.0);
        Student s3=new Student("Kajetan",4.5);

        Student[] students={s1,s2,s3};
//        Arrays.sort(students);
        LastNameComparator lastNameComparator=new LastNameComparator();
        GPAComparator gpaComparator=new GPAComparator();
        Arrays.sort(students,lastNameComparator);
        Arrays.sort(students,gpaComparator);
    }
}//end of class
