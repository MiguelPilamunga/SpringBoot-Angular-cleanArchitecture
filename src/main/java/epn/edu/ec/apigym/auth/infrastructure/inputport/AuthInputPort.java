package epn.edu.ec.apigym.auth.infrastructure.inputport;

import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.AuthResponse;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.LoginRequest;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.RegisterRequest;

public interface AuthInputPort {
    AuthResponse login(LoginRequest request);
    AuthResponse register(RegisterRequest request);
}
