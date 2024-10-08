package com.pharmacy.activeprinciple.application;

import com.pharmacy.activeprinciple.domain.entity.ActivePrinciple;
import com.pharmacy.activeprinciple.domain.service.ActiveprincipleService;

public class CreateActivePrincipleUseCase {
    private ActiveprincipleService activeprincipleService;

    public CreateActivePrincipleUseCase(ActiveprincipleService activeprincipleService){
        this.activeprincipleService = activeprincipleService;
    }

    public void execute(ActivePrinciple activePrinciple){
        activeprincipleService.createActivePrinciple(activePrinciple);
    }
}
