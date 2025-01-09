package se.lexicon.data_access;

import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao{

    private List<Student> students;

    public StudentDaoListImpl() {
        this.students = new ArrayList<Student>();
    }
}
