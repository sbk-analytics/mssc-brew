package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */
@Service
public class BeerServiceImpl implements BeerService {
    
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Amstel")
                .beerStyle("Pale Ale")
                .build();
    }
}
