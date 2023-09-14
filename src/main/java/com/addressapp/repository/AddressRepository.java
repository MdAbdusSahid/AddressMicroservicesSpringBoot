package com.addressapp.repository;

import com.addressapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address,Integer> {

    @Query(nativeQuery = true,value="SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip FROM microservices.address ea join microservices.employee e on ea.id=employee_id where ea.employee_id=:employeeId")
    Address findAddressByEmployeeId(@Param("employeeId")int employeeId);

}
