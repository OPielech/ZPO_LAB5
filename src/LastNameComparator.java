import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {//<>typ parametryczny


    @Override
    public int compare(Student o1, Student o2) {
        return  o1.getLastName().compareTo(o2.getLastName());
    }
}//end of class
