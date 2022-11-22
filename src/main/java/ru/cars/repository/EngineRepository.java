package ru.cars.repository;

import ru.cars.model.Engine;

import java.util.List;
import java.util.Optional;

public interface EngineRepository {

    Optional<Engine> add(Engine engine);

    List<Engine> findAll();

    Optional<Engine> findById(int id);
}
