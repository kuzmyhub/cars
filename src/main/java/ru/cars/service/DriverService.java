package ru.cars.service;

import ru.cars.model.Driver;
import ru.cars.model.User;

import java.util.Optional;

public interface DriverService {

    Optional<Driver> add(Driver driver);

    Optional<Driver> findByUser(User user);
}
