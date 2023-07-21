import java.util.ArrayList;

public class Students {
    private String studentName;
    private Integer studentRollNum;
    private Integer studentAge;
    private String studentAddress;
    private Integer mark1;
    private Integer mark2;
    private Integer mark3;

    public Students(String studentName, Integer studentRollNum, Integer studentAge, String studentAddress, Integer mark1, Integer mark2, Integer mark3) {
        this.studentName = studentName;
        this.studentRollNum = studentRollNum;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    Students() {

    }


    public int smark() {
        return (mark1 + mark2 + mark3);
    }


    public int average() {
        return (this.mark1 + this.mark2 + this.mark3) / 3;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentRollNum() {
        return studentRollNum;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public Integer getMark1() {
        return mark1;
    }

    public Integer getMark2() {
        return mark2;
    }

    public Integer getMark3() {
        return mark3;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentRollNum(Integer studentRollNum) {
        this.studentRollNum = studentRollNum;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setMark1(Integer mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(Integer mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(Integer mark3) {
        this.mark3 = mark3;
    }
}





