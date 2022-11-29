package com.company.rentacar.business.concretes;

import com.company.rentacar.business.abstracts.BrandService;
import com.company.rentacar.business.requests.CreateBrandRequest;
import com.company.rentacar.business.responses.GetAllBrandsResponse;
import com.company.rentacar.dataAccess.abstracts.BrandRepository;
import com.company.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }




    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands  =brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands){
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }

    @Override
    public void delete(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setId(createBrandRequest.getId());

        this.brandRepository.delete(brand);
    }

}
