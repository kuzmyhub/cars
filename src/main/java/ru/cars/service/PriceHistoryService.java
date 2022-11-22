package ru.cars.service;

import ru.cars.model.PriceHistory;

import java.util.Optional;

public interface PriceHistoryService {

    Optional<PriceHistory> add(PriceHistory priceHistory);
}
