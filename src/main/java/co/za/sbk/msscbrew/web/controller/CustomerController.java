package co.za.sbk.msscbrew.web.controller;

import co.za.sbk.msscbrew.services.CustomerService;
import co.za.sbk.msscbrew.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
@RequestMapping("/api/v1/customers")
@RestController
public class CustomerController {
    
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID customerId) {
        return new ResponseEntity<>(customerService.getById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> handlePost(CustomerDto customerDto) {
        CustomerDto savedCustomerDto = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO add host name url
        headers.add("Location", "/api/v1/customers/"+savedCustomerDto.getId().toString());

        return new ResponseEntity<>(savedCustomerDto, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID customerId, CustomerDto customerDto) {
        customerService.updateCustomer(customerId, customerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteById(customerId);
    }
}
