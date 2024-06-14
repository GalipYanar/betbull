package com.example.betBull.service;

import com.example.betBull.model.Contract;
import com.example.betBull.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public Contract createContract(Contract contract){
        return contractRepository.save(contract);
    }

    public List<Contract> getAllContract(){
        return contractRepository.findAll();
    }

    public Contract updateContract(Contract contract){
        return contractRepository.save(contract);
    }
}
