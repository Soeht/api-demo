package org.ace.apidemo.service;

import org.ace.apidemo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface UserService {
    List<User> findALL();
    void save(User user );


}
