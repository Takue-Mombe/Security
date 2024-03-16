package org.projecth200.camsh200.Controller;


import lombok.AllArgsConstructor;
import org.projecth200.camsh200.Add_ons.RegistrationRequest;
import org.projecth200.camsh200.Services.RegistrationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class userRegistration {

    private RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}
