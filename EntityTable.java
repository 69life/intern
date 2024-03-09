package com.teamTwo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // to tell the spring boot that this class represents the corresponds table in  database
@Data // it will generate getters and setters
@Table(name = "TRAN_FMS_ACTVY")
@NoArgsConstructor
@AllArgsConstructor
public class EntityTable {
    //    @Id
//    @Column(name = "Id")
//    private String bank_code;
//    @Column(name = "Bank_code")
//    private String bank_name;
//    @Column(name = "Product_Type")
//    private String product_type;
//    @Column(name = "Month_Year")
//    private int month_year;
//    @Column(name = "Transaction_Year")
//    private int transaction_count;
//    @Column(name = "Alert_Type")
//    private String alert_type;
    @Id
    @Column(name = "ISSUING_BANK_CODE")
    private String ISSUING_BANK_CODE;
    private String MSG_TYPE;
}
