package se.lexicon;

import se.lexicon.data_access.StudentDao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello & lets start⛳!");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigFileName.class);
        StudentDao studentDao = context.getBean(StudentDao.class);




    }
}