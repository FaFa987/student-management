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

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }
}
