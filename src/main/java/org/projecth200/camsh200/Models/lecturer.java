package org.projecth200.camsh200.Models;


import jakarta.persistence.*;

@Entity(name = "lecturer")
public class lecturer {

    @Id
    private String memberId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String department;
    @Column
    private String coursesTaught;
    @Column
    private String hitmail;


}
