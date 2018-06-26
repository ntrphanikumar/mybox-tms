package com.mybox.tms.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
