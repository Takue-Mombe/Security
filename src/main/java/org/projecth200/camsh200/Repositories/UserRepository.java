package org.projecth200.camsh200.Repositories;

import org.projecth200.camsh200.Models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,String > {
}
