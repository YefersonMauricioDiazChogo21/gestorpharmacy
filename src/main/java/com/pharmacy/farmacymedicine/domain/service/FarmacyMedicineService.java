package com.pharmacy.farmacymedicine.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.farmacymedicine.domain.entity.FarmacyMedicine;

public interface FarmacyMedicineService {
    void createFarmacy (FarmacyMedicine farmacymedicine);
    void updateFarmacy (FarmacyMedicine farmacymedicine);
    FarmacyMedicine deleteFarmacy (String idfarmacy);
    Optional<FarmacyMedicine> findFarmacyById(String idfarmacy);
    List<FarmacyMedicine> findAllFarmacies();
}
