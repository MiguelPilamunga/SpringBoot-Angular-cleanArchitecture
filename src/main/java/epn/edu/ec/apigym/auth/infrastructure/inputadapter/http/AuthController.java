package epn.edu.ec.apigym.auth.infrastructure.inputadapter.http;

import epn.edu.ec.apigym.auth.aplication.AuthService;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.AuthResponse;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.LoginRequest;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.RegisterRequest;
import epn.edu.ec.apigym.auth.infrastructure.inputport.AuthInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthInputPort authInputPort;
    
    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authInputPort.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authInputPort.register(request));
    }
}
