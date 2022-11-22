package ru.cars.service;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.cars.repository.PriceHistoryRepository;
import ru.cars.model.PriceHistory;

import java.util.Optional;

@ThreadSafe
@Service
@AllArgsConstructor
public class SimplePriceHistoryService implements PriceHistoryService {

    private PriceHistoryRepository hibernatePriceHistoryRepository;

    public Optional<PriceHistory> add(PriceHistory priceHistory) {
        return hibernatePriceHistoryRepository.add(priceHistory);
    }
}
