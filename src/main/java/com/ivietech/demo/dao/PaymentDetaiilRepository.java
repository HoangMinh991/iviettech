/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivietech.demo.dao;

import com.ivietech.demo.entity.User;
import com.ivietech.demo.entity.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HoangMinh
 */
@Repository
public interface PaymentDetaiilRepository  extends JpaRepository<PaymentDetail, Long> {
    
}
