package com.pharmacy.activeprinciple.domain.service;
import java.util.List;
import java.util.Optional;

import com.pharmacy.activeprinciple.domain.entity.ActivePrinciple;;

public interface ActiveprincipleService {
    void createActivePrinciple (ActivePrinciple activeprinciple);
    void updateActivePrinciple (int idap);
    ActivePrinciple deleteActivePrinciple (int idap);
    Optional<ActivePrinciple> findActivePrincipleById(int idap);
    List<ActivePrinciple> findAllCActivesPrinciples();

}
