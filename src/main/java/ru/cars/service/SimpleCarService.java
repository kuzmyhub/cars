package ru.cars.service;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.cars.repository.CarRepository;
import ru.cars.model.Car;

import java.util.Optional;

@ThreadSafe
@Service
@AllArgsConstructor
public class SimpleCarService implements CarService {

    private CarRepository hibernateCarRepository;

    public Optional<Car> add(Car car) {
        return hibernateCarRepository.add(car);
    }

    public Optional<Car> findById(int id) {
        return hibernateCarRepository.findById(id);
    }

    public Car update(Car car) {
        return hibernateCarRepository.update(car);
    }
}
