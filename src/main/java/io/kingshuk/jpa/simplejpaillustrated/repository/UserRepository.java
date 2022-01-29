package io.kingshuk.jpa.simplejpaillustrated.repository;

import io.kingshuk.jpa.simplejpaillustrated.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
