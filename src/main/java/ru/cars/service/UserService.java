package ru.cars.service;

import ru.cars.model.User;

import java.util.Optional;

public interface UserService {

     Optional<User> add(User user);

     Optional<User> findById(int id);

     Optional<User> findByLoginAndPassword(User user);

     void update(User user);

     Optional<User> findParticipatesByUser(int id);
}
