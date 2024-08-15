package com.pharmacy.farmacy.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.farmacy.domain.entity.Farmacy;

public interface FarmacyService {
    void createFarmacy (Farmacy farmacy);
    void updateFarmacy (Farmacy farmacy);
    Farmacy deleteFarmacy (String idfarmacy);
    Optional<Farmacy> findFarmacyById(String idfarmacy);
    List<Farmacy> findAllFarmacies();
}
