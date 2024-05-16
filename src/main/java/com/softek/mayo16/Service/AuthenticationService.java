package com.softek.mayo16.Service;

import com.softek.mayo16.DAO.request.SignInRequest;
import com.softek.mayo16.DAO.request.SignUpRequest;
import com.softek.mayo16.DAO.response.JwtAuthenticationResponse;


public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}

