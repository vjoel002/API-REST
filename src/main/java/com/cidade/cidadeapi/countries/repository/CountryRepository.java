package com.cidade.cidadeapi.countries.repository;

import com.cidade.cidadeapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
