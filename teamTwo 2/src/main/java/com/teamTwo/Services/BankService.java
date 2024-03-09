package com.teamTwo.Services;


import com.teamTwo.Entity.TRAN_FMS_ACTVY;
import com.teamTwo.Repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepo bankRepo;

    public List<TRAN_FMS_ACTVY> getAllDetils(){
        return bankRepo.findAll();
    }

}

