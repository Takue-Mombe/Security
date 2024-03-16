package org.projecth200.camsh200.Models;

import jakarta.persistence.*;

@Entity("assessment")
public class Assessments {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long assessemntid;
    @Column
    private String
}
