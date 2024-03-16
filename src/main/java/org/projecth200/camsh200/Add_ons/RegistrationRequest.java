package org.projecth200.camsh200.Add_ons;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String firstname;
    private final String lastname;
    private final String email;
    private final String password;


}
