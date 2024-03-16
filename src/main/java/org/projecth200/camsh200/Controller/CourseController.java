package org.projecth200.camsh200.Controller;

import org.projecth200.camsh200.Models.Courses;
import org.projecth200.camsh200.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class CourseController {

    @Autowired
    private    CourseService courseService;
    @PostMapping("/save")
    public String saveCourse(Courses courses){

        courseService.saveCourse(courses);
        return "Saved";
    }

}
