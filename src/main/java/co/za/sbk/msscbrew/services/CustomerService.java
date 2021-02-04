package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
public interface CustomerService {
    
    CustomerDto getById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
