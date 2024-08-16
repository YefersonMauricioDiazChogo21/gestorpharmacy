package com.pharmacy.activeprinciple.application;

import com.pharmacy.activeprinciple.domain.service.ActiveprincipleService;

public class DeleteActivePrincipleUseCase {
    private ActiveprincipleService activeprincipleService;

    public DeleteActivePrincipleUseCase(ActiveprincipleService activeprincipleService){
        this.activeprincipleService = activeprincipleService;
    }

    public void execute(int idap){
        activeprincipleService.deleteActivePrinciple(idap);
    }
}
