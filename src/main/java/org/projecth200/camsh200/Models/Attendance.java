package org.projecth200.camsh200.Models;


import jakarta.persistence.*;

@Entity(name = "attendanceRecords")
public class Attendance {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "courseName",referencedColumnName = "courseName")
    private Courses courseName;
    @ManyToOne
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
    private Courses courseId;

    @ManyToOne
    @JoinColumn(name = "enrolledStudents",referencedColumnName = "enrolledStudents")
    private Courses enrolledStudents;


    @Column
    private Boolean state;
    @Column
    private String generatedQrCode;

}
