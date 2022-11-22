package ru.cars.service;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.cars.repository.EngineRepository;
import ru.cars.model.Engine;

import java.util.List;
import java.util.Optional;

@ThreadSafe
@Service
@AllArgsConstructor
public class SimpleEngineService implements EngineService {

    private EngineRepository hibernateEngineRepository;

    public Optional<Engine> add(Engine engine) {
        return hibernateEngineRepository.add(engine);
    }

    public List<Engine> findAll() {
        return hibernateEngineRepository.findAll();
    }

    public Optional<Engine> findById(int id) {
        return hibernateEngineRepository.findById(id);
    }
}
