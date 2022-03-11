package com.Donor.donorService.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonorApi {

    @RequestMapping(value = "/donor",method = RequestMethod.GET)
    public String getDonor(){
        return "Donor";
    }
}
