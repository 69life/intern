package com.teamTwo.Controller;


import com.teamTwo.Entity.TRAN_FMS_ACTVY;
import com.teamTwo.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {
    @Autowired
    //private BankService bankService;
    private BankService bankService;
    @GetMapping("/getDetails")
    public ResponseEntity<?> getDetails(){
        return ResponseEntity.ok(this.bankService.getAllDetils());
    }
}
