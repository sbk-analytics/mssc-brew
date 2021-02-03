package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public CustomerDto getById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("SAB")
                .build();
    }
}
