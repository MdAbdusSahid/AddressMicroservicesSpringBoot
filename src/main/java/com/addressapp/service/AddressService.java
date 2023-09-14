package com.addressapp.service;

import com.addressapp.entity.Address;
import com.addressapp.repository.AddressRepository;
import com.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepository addressRepository;

    public AddressResponse findAddressByEmployeeId(int employeeId){
        logger.info("GetAddress By Employee Id invoked");
            Address address = addressRepository.findAddressByEmployeeId(employeeId);
            AddressResponse addressResponse=modelMapper.map(address, AddressResponse.class);
            return addressResponse;

    }
}
