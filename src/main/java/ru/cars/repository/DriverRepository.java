package ru.cars.repository;

import ru.cars.model.Driver;
import ru.cars.model.User;

import java.util.Optional;

public interface DriverRepository {

    Optional<Driver> add(Driver driver);

    Optional<Driver> findByUser(User user);
}
