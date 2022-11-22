package ru.cars.repository;

import ru.cars.model.PriceHistory;

import java.util.Optional;

public interface PriceHistoryRepository {

    Optional<PriceHistory> add(PriceHistory priceHistory);
}
