package org.projecth200.camsh200.Services;

import org.projecth200.camsh200.Add_ons.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "works";
    }
}
