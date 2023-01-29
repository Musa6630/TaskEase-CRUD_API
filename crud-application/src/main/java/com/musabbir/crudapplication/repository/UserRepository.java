package com.musabbir.crudapplication.repository;

import com.musabbir.crudapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface UserRepository extends JpaRepository<User, Long> {
}
