import java.util.Comparator;

public class GPAComparator implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa().compareTo(o2.getGpa());
    }
}//end od class
