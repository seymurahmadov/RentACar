package com.company.rentacar.business.abstracts;

import com.company.rentacar.business.requests.CreateBrandRequest;
import com.company.rentacar.business.responses.GetAllBrandsResponse;
import com.company.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
    void delete(CreateBrandRequest createBrandRequest);
}
