package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

import java.util.List;

public class Controller  {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();;
    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }
    public void getAllStudent(){
        List<User>userList = service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
    public void createStudyGroup(List<Student> students, Teacher teacher) {
        StudyGroup studyGroup = studyGroupService.formStudyGroup(teacher, students);
        System.out.println(studyGroup.toString());
    }
}
