/*
 * Author Name: Chittra Kumari
 * IDE : Intellej Idea Ultimate Edition
 * Date : 08-02-2022
 */
package Student;
import User.User;

import java.util.Objects;

public class Student extends User {
    private String sec;
    private int rollNumber;
    public Student(String firstName,String lastName,String emailAddress,int ID,String sec,int rollNumber){
        super(firstName,lastName,emailAddress,ID);
        this.sec=sec;
        this.rollNumber=rollNumber;

    }

    @Override
    public String toString() {
        return "Student{" +
                "sec='" + sec + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(sec, student.sec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sec, rollNumber);
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
