package se.lexicon;

import se.lexicon.data_access.StudentDao;

public class AnnotationConfigApplicationContext {
    public AnnotationConfigApplicationContext(Class<ConfigFileName> configFileNameClass) {
    }

    public StudentDao getBean(Class<StudentDao> studentDaoClass) {
    }
}
