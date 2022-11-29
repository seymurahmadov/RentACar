package com.company.rentacar.dataAccess.abstracts;

import com.company.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {


}
