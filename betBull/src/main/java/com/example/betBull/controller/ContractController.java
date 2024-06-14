package com.example.betBull.controller;

import com.example.betBull.model.Contract;
import com.example.betBull.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
@CrossOrigin

public class ContractController {

    @Autowired
    private ContractService contractService;

    @PostMapping("/createcontract")
    public Contract createContract(@RequestBody Contract contract){
        return contractService.createContract(contract);
    }

    @PutMapping("/updatecontract")
    public Contract updateContract(@RequestBody Contract contract){
        return contractService.updateContract(contract);
    }

    @GetMapping
    public List<Contract> getAllContract(){
        return contractService.getAllContract();
    }
}
