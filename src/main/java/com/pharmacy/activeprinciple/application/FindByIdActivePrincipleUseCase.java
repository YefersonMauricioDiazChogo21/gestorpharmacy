package com.pharmacy.activeprinciple.application;

import java.util.Optional;

import com.pharmacy.activeprinciple.domain.entity.ActivePrinciple;
import com.pharmacy.activeprinciple.domain.service.ActiveprincipleService;

public class FindByIdActivePrincipleUseCase {
    private ActiveprincipleService activeprincipleService;

    public FindByIdActivePrincipleUseCase(ActiveprincipleService activeprincipleService){
        this.activeprincipleService = activeprincipleService;
    }

    public Optional<ActivePrinciple> execute(int id){
        return activeprincipleService.findActivePrincipleById(id);
    }
}
