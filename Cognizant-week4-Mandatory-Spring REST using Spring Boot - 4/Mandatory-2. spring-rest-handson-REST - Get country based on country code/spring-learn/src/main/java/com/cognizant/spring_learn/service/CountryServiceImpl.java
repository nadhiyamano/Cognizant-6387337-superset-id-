package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private List<Country> countryList;

    public CountryServiceImpl() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countryList = (List<Country>) context.getBean("countryList");
    }

    @Override
    public Country getCountry(String code) {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
