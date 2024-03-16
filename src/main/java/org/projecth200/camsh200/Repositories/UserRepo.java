package org.projecth200.camsh200.Repositories;

import jakarta.transaction.Transactional;
import org.projecth200.camsh200.AppUser.Appuser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Transactional
@Repository
public interface UserRepo {
    Optional<Appuser>findByEmail(String email);
}
