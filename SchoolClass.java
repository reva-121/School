import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClass {
    private String grade;
    private String teacher;
    private Integer studentNum;

    ArrayList<Students> studentList = new ArrayList<Students>();

    public SchoolClass(String grade, String teacher, Integer studentNum, ArrayList<Students> Students) {

        this.grade = grade;
        this.teacher = teacher;
        this.studentNum = studentNum;
        this.studentList.addAll(Students);
    }

    public String getTopper() {
        int max = -1;
        String TopStudent = "";
        for (Students s : studentList) {
            if (s.average() > max) {
                max = s.average();
                TopStudent = s.getStudentName();
            }
        }
        return TopStudent;
    }

    public Integer ClassAverage() {
        int sumAvg = 0;
        int count = 0;
        for (Students i : this.studentList) {
            sumAvg += i.average();
            count += 1;
        }
        return sumAvg / count;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }
}
