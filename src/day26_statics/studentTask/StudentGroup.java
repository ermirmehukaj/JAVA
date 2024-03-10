package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {

    public String groupName;
    public int groupID;
    public ArrayList<Student> students;


    public StudentGroup(String groupName, int groupID) {
        this.groupName = groupName;
        this.groupID = groupID;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){// Takes one student object, and adds it to the arrayList of students

        students.add(student);
    }

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }// takes one array of student and adds the array of students to the arraylist of student

    public void addStudent(String name,int age,char gender, String id){// Tkes name age ,gender and id of students, and creates students object
        //Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }

public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));

}// takes the id and then removes the student object from the arraylist of student


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID=" + groupID +
                ",number of  students=" + students.size() +
                '}';
    }
}
