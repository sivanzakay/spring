package com.spring.annotations.services;

import com.spring.annotations.model.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService implements ICompanyService{

    private List<Company> companyList = new ArrayList<>();

    @Override
    public List<Company> findAll(){
        if(companyList.size() == 0)
            return null;
        return companyList;
    }

    @Override
    public void addCompany(String cName, int cId){
        Company company = new Company(cName,cId);
        companyList.add(company);
    }
}
