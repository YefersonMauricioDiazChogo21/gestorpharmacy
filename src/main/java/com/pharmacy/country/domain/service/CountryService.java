package com.pharmacy.country.domain.service;

import java.util.List;
import java.util.Optional;
import com.pharmacy.country.domain.entity.Country;

public interface CountryService{

    void createCountry (Country country);
    void updateCountry (Country country);
    Country deleteCountry (String codecounrty);
    Optional<Country> findCountryById(String codecountry);
    List<Country> findAllCountries();
}