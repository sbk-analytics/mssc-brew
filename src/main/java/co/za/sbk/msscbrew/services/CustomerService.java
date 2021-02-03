package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
public interface CustomerService {
    
    CustomerDto getById(UUID customerId);
}
