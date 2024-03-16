package org.projecth200.camsh200.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "student")
public class Student{
    @Id
    private String regNumber;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String programme;
    @Column
    private String classesTaking;
    @Column
    private String hitmail;

}
