package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public CustomerDto getById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("SAB")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("SAB")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo update beer body
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting a beer...");
    }
}
