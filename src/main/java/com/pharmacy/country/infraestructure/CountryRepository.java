package com.pharmacy.country.infraestructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import  com.pharmacy.Database;
import com.pharmacy.country.domain.entity.Country;
import com.pharmacy.country.domain.service.CountryService;

public class CountryRepository implements CountryService{
    @Override
    public void createCountry(Country country) {
        try (Connection connection = Database.getConnection()){
            String query = "INSERT INTO country (codecountry,namecountry) VALUES (?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, country.getCodecountry());
            ps.setString(2, country.getNamecountry());
            ps.executeUpdate();            
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }

    @Override
    public void updateCountry(Country country) {
        try (Connection connection = Database.getConnection()){
            String query = "UPDATE country SET codecountry= ?,namecountry= ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, country.getCodecountry());
            ps.setString(2, country.getNamecountry());
            ps.executeUpdate();            
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }

    @Override
    public Country deleteCountry(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCountry'");
    }

   
    @Override
    public Optional<Country> findCountryById(String codecountry) {
       // TODO Auto-generated method stub
   throw new UnsupportedOperationException("Unimplemented method 'findAllCountries'");
    }

    @Override
    public List<Country> findAllCountries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllCountries'");
    }
    
}