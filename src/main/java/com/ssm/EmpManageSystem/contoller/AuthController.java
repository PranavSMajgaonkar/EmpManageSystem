package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.JwtTokenProvider;
import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
    @Autowired
    Employee employee;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private UserDetailsService userDetailsService;
    @PostMapping("/sign_in")
    public ResponseEntity<String> signin(@RequestBody EmployeeEnt employeeEnt){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        employeeEnt.getFirstName(),
                        employeeEnt.getEmail()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenProvider.generateToken(authentication);
        EmployeeEnt emp = employee.isUserPresent(employeeEnt.getFirstName(),employeeEnt.getEmail());
         if (emp != null){
             return ResponseEntity.ok(jwt);
         }else {
             return ResponseEntity.badRequest().body("No record found");
         }
    }
}
