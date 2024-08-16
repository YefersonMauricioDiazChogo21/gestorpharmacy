package com.pharmacy.activeprinciple.infraestructure;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pharmacy.Database;
import com.pharmacy.activeprinciple.domain.entity.ActivePrinciple;
import com.pharmacy.activeprinciple.domain.service.ActiveprincipleService;

public class ActivePrincipleRepository implements ActiveprincipleService{
    Scanner scanner =new Scanner(System.in);

    @Override
    public void createActivePrinciple(ActivePrinciple activeprinciple) {
        String sql= "INSERT INTO activeprincipe (nameap) VALUES (?)";
        try (Connection connection = Database.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, activeprinciple.getNameap());
            ps.executeUpdate();
            System.out.println("Successful add");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateActivePrinciple(int idap) {
        String sql= "UPDATE activeprincipe SET nameap =? WHERE idap =?";
        try (Connection connection = Database.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql)){
            System.out.print("Name of Active Principle: ");
            String name= scanner.nextLine();
            ps.setString(1, name);
            ps.setInt(2, idap);
            ps.executeUpdate();
            System.out.println("Successful add");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public ActivePrinciple deleteActivePrinciple(int idap) {
        String sql= "DELETE FROM activeprincipe WHERE idap =?";
        try (Connection connection = Database.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1,idap);
            ps.executeUpdate();
            System.out.println("Successful delete");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.print("Id not found");
        }
        return null;
    }

    @Override
    public Optional<ActivePrinciple> findActivePrincipleById(int idap) {
        String sql= "SELECT idap,nameap FROM activeprincipe WHERE idap =?";
        try (Connection connection = Database.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, idap);
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt("idap");
                String name=rs.getString("nameap"); 
                ActivePrinciple activePrinciple =new ActivePrinciple(id,name);
                return Optional.of(activePrinciple);
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<ActivePrinciple> findAllCActivesPrinciples() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllCActivesPrinciples'");
    }

}
