package com.litvas.carpark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
@RequestMapping("/api/v1/carpark/driver")
public class DriverController {

        @GetMapping(value = "/username")
        @ResponseBody
        public String currentUserNameSimple(HttpServletRequest request) {
            Principal principal = request.getUserPrincipal();
            return principal.getName();
        }

}
