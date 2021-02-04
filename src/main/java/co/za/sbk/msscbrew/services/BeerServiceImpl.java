package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Amstel")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Stella")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo update beer body
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer...");
    }
}
