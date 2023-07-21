import java.util.ArrayList;

public class School {
    private String schoolName;
    private String schoolPlace;
    ArrayList<SchoolClass> classList = new ArrayList<SchoolClass>();

    public School(String schoolName, String schoolPlace, ArrayList<SchoolClass> Classdet) {
        this.schoolName = schoolName;
        this.schoolPlace = schoolPlace;
        this.classList.addAll(Classdet);
    }

    public String topClass() {
        int max1 = -1;
        String bestClass = "";
        for (SchoolClass s : classList) {
            if (s.ClassAverage() > max1) {
                max1 = s.ClassAverage();
                bestClass = s.getGrade();
            }
        }
        return bestClass;
    }

    public int schoolAverage() {
        int sclAvgSum = 0;
        int count = 0;
        for (SchoolClass i : classList) {
            sclAvgSum += i.ClassAverage();
            count++;
        }
        return sclAvgSum / count;
    }
}
