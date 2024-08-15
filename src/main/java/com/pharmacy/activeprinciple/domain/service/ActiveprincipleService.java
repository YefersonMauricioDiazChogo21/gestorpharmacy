package com.pharmacy.activeprinciple.domain.service;
import java.util.List;
import java.util.Optional;

import com.pharmacy.activeprinciple.domain.entity.ActivePrinciple;;

public interface ActiveprincipleService {
    void createActivePrinciple (ActivePrinciple activeprinciple);
    void updateActivePrinciple (ActivePrinciple activeprinciple);
    ActivePrinciple deleteActivePrinciple (String idap);
    Optional<ActivePrinciple> findActivePrincipleById(String idap);
    List<ActivePrinciple> findAllCActivesPrinciples();

}
