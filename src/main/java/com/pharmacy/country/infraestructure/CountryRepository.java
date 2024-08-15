package com.pharmacy.country.infraestructure;

import java.util.List;
import java.util.Optional;

import  com.pharmacy.country.domain.entity.Country;
import com.pharmacy.country.domain.service.CountryService;

public class CountryRepository implements CountryService{

    @Override
    public void createCountry(Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCountry'");
    }

    @Override
    public void updateCountry(Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCountry'");
    }

    @Override
    public Country deleteCountry(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCountry'");
    }

    @Override
    public Optional<Country> findCountryById(String codecountry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCountryById'");
    }

    @Override
    public List<Country> findAllCountries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllCountries'");
    }
    
}