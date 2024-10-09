package com.aditya.service;

import com.aditya.domain.VerificationType;
import com.aditya.model.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;
    public User finduserByEmail(String email) throws Exception;
    public User findUserById(Long userId) throws Exception;

    public User enableTwoFactorAuthentication(
            VerificationType verificationType,
            String sendTo, User user);

    User updatePassword(User user, String newPassword);
}
