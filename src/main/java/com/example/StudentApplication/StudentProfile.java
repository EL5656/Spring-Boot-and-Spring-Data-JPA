package com.example.StudentApplication;

import jakarta.persistence.*;

@Entity
public class StudentProfile {
    @Id
    @GeneratedValue
    private Integer id;
    private String bio;
    public StudentProfile(String bio) {
        this.bio = bio;
    }
    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;
    public StudentProfile() {

    }
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
