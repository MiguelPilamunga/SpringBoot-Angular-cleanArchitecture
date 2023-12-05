package epn.edu.ec.apigym.auth.aplication;

import epn.edu.ec.apigym.auth.Jwt.JwtService;
import epn.edu.ec.apigym.auth.domain.Role;
import epn.edu.ec.apigym.auth.domain.User;
import epn.edu.ec.apigym.auth.infrastructure.inputport.AuthInputPort;
import epn.edu.ec.apigym.auth.infrastructure.outputport.UserRepository;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.AuthResponse;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.LoginRequest;
import epn.edu.ec.apigym.auth.infrastructure.inputadapter.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class AuthService implements AuthInputPort {

    @Autowired
    UserRepository userRepository;
    @Autowired
    JwtService jwtService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Override
    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
            .token(token)
            .build();

    }
    @Override
    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
            .username(request.getUsername())
            .password(passwordEncoder.encode( request.getPassword()))
            .firstname(request.getFirstname())
            .lastname(request.getLastname())
            .country(request.getCountry())
            .role(Role.USER)
            .build();

        userRepository.save(user);

        return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();
        
    }

}
