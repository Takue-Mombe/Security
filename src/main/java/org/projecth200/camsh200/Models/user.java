package org.projecth200.camsh200.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users")
public class user {

    @Id
    private String memberId;
    @Column
    public String username;
    @Column
    private String password;
    @Column
    private roles roles;
}
