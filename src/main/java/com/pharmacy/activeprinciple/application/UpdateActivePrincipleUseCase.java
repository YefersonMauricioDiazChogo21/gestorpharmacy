package com.pharmacy.activeprinciple.application;

import com.pharmacy.activeprinciple.domain.service.ActiveprincipleService;

public class UpdateActivePrincipleUseCase {
    private ActiveprincipleService activeprincipleService;

    public UpdateActivePrincipleUseCase(ActiveprincipleService activeprincipleService){
        this.activeprincipleService = activeprincipleService;
    }

    public void execute(int idap){
        activeprincipleService.updateActivePrinciple(idap);
    }
}
