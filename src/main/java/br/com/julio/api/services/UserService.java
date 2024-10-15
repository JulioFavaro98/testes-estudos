package br.com.julio.api.services;

import br.com.julio.api.domain.User;
import br.com.julio.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.orElse(null);
    }
}
