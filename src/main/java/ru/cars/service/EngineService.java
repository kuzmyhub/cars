package ru.cars.service;

import ru.cars.model.Engine;

import java.util.List;
import java.util.Optional;

public interface EngineService {

    Optional<Engine> add(Engine engine);

    List<Engine> findAll();

    Optional<Engine> findById(int id);
}
