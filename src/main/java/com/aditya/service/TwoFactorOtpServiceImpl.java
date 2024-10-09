package com.aditya.service;

import com.aditya.model.TwofactorOTP;
import com.aditya.model.User;
import com.aditya.repository.TwoFactorOtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TwoFactorOtpServiceImpl implements TwoFactorOtpservice {

    @Autowired
    private TwoFactorOtpRepository twoFactorOtpRepository;
    @Override
    public TwofactorOTP createTwoFactorOtp(User user, String otp, String jwt) {
        UUID uuid = UUID.randomUUID();

        String id = uuid.toString();

        TwofactorOTP twofactorOTP=new TwofactorOTP();
        twofactorOTP.setOtp(otp);
        twofactorOTP.setJwt(jwt);
        twofactorOTP.setId(id);
        twofactorOTP.setUser(user);
        return twoFactorOtpRepository.save(twofactorOTP);
    }

    @Override
    public TwofactorOTP findByUser(Long userId) {
        return twoFactorOtpRepository.findByUserId(userId);
    }

    @Override
    public TwofactorOTP findById(String id) {
        Optional<TwofactorOTP> opt=twoFactorOtpRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public boolean verifyTwoFactorOtp(TwofactorOTP twofactorOtp, String otp) {
        return twofactorOtp.getOtp().equals(otp);
    }

    @Override
    public void deleteTwoFactorOtp(TwofactorOTP twofactorOtp) {
        twoFactorOtpRepository.delete(twofactorOtp);
    }
}
