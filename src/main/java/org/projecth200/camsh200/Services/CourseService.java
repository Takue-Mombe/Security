package org.projecth200.camsh200.Services;

import org.projecth200.camsh200.Models.Assessments;
import org.projecth200.camsh200.Models.Courses;
import org.projecth200.camsh200.Repositories.AssessmentRepository;
import org.projecth200.camsh200.Repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    private CourseRepository courseRepository;

    public String saveCourse(Courses courses){

        return courseRepository.save(courses).toString();
    }
    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }

    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }

}
