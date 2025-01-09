package se.lexicon.models;

import java.util.UUID;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = Integer.parseInt(UUID.randomUUID().toString());
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
