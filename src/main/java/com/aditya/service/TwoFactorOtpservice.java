package com.aditya.service;

import com.aditya.model.TwofactorOTP;
import com.aditya.model.User;

public interface TwoFactorOtpservice {
    TwofactorOTP createTwoFactorOtp(User user, String otp, String jwt);

    TwofactorOTP findByUser(Long userId);

    TwofactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwofactorOTP twofactorOtp, String otp);

    void deleteTwoFactorOtp(TwofactorOTP twofactorOtp);
}
