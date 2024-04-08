package com.spring.annotations.services;

import com.spring.annotations.model.Company;

import java.util.List;

public interface ICompanyService {

    List<Company> findAll();

    void addCompany(String cName, int cId);
}
