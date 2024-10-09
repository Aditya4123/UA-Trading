package com.aditya.repository;

import com.aditya.model.TwofactorOTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoFactorOtpRepository extends JpaRepository<TwofactorOTP,String> {
    TwofactorOTP findByUserId(Long userId);
}
