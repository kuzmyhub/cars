package ru.cars.repository;

import ru.cars.model.Car;

import java.util.Optional;

public interface CarRepository {

    Optional<Car> add(Car car);

    Optional<Car> findById(int id);

    Car update(Car car);
}
