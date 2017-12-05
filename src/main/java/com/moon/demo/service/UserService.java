package com.moon.demo.service;

import com.moon.demo.dto.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class UserService {

    private static final List<User> users = Arrays.asList(new User("1", "Mina"), new User("2", "Alia"));

    public User getUser(String  id) {
//   Optional<User> userOptional


        User user1 = users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);

        return user1;

    }

}
