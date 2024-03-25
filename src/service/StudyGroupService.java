package service;

import model.StudyGroup;
import model.Teacher;
import model.Student;

import java.util.List;

public class StudyGroupService {
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(teacher);
        for (Student student : students) {
            studyGroup.addStudent(student);
        }
        return studyGroup;
    }
}
