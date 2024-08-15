package com.pharmacy.city.infraestructure.repository;
import java.util.List;
import java.util.Optional;

import com.pharmacy.city.domain.entity.City;
import com.pharmacy.city.domain.service.CityService;

public class CityRepository implements CityService{

    @Override
    public void createCity(City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCity'");
    }

    @Override
    public void updateCity(City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCity'");
    }

    @Override
    public City deleteCity(String codecity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCity'");
    }

    @Override
    public Optional<City> findCityById(String codecity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCityById'");
    }

    @Override
    public List<City> findAllCoities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllCoities'");
    }

}
