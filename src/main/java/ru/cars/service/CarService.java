package ru.cars.service;

import ru.cars.model.Car;

import java.util.Optional;

public interface CarService {

     Optional<Car> add(Car car);

     Optional<Car> findById(int id);

     Car update(Car car);
}
