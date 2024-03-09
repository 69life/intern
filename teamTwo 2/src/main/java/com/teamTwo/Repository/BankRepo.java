package com.teamTwo.Repository;


import com.teamTwo.Entity.TRAN_FMS_ACTVY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepo extends JpaRepository<TRAN_FMS_ACTVY, String> {
    @Query("SELECT ISSUING_BANK_CODE from TRAN_FMS_ACTVY")
    List<TRAN_FMS_ACTVY> getallDetails();
}
