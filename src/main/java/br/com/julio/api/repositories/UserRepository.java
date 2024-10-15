package br.com.julio.api.repositories;

import br.com.julio.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
