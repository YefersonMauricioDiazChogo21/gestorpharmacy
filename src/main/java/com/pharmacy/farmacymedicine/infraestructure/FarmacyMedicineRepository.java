package com.pharmacy.farmacymedicine.infraestructure;

import java.util.List;
import java.util.Optional;

import com.pharmacy.farmacymedicine.domain.entity.FarmacyMedicine;
import com.pharmacy.farmacymedicine.domain.service.FarmacyMedicineService;

public class FarmacyMedicineRepository implements FarmacyMedicineService{

    @Override
    public void createFarmacy(FarmacyMedicine farmacymedicine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFarmacy'");
    }

    @Override
    public void updateFarmacy(FarmacyMedicine farmacymedicine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateFarmacy'");
    }

    @Override
    public FarmacyMedicine deleteFarmacy(String idfarmacy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFarmacy'");
    }

    @Override
    public Optional<FarmacyMedicine> findFarmacyById(String idfarmacy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findFarmacyById'");
    }

    @Override
    public List<FarmacyMedicine> findAllFarmacies() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllFarmacies'");
    }

}
