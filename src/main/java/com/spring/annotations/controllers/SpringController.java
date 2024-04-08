package com.spring.annotations.controllers;

import com.spring.annotations.model.Company;
import com.spring.annotations.services.CompanyService;
import com.spring.annotations.services.ICompanyService;
import com.spring.annotations.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring")
public class SpringController {


    @Autowired
    private ICompanyService service;

    @RequestMapping("/test")
    public String test() {
        return "AZAR WAKE UP!";
    }

    @GetMapping("/list")
    public List<Company> getCompanies() {

        List<Company> companies = service.findAll();
        return companies;
    }

    @PostMapping("/add")
    @ResponseBody
    public String addCompany(@RequestBody Company company) {
        service.addCompany(company.getcName(), company.getcId());
        return "OK";
    }

}
