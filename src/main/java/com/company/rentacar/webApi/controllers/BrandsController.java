package com.company.rentacar.webApi.controllers;

import com.company.rentacar.business.abstracts.BrandService;
import com.company.rentacar.business.requests.CreateBrandRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall/{id}")
    public String getAll(@PathVariable int id,@RequestParam String name){
        if (id==2){
            return "Seymur";
        }
        if (name.equals("Hyundai")){
            return "Elantra";
        }
        return "Hello";

//        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.delete(createBrandRequest);

    }
}
