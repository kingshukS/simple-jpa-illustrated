package io.kingshuk.jpa.simplejpaillustrated.service;

import io.kingshuk.jpa.simplejpaillustrated.entity.User;
import io.kingshuk.jpa.simplejpaillustrated.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        user.setId(null);
       userRepository.save(user);
    }
}
