package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.BeerDto;
import co.za.sbk.msscbrew.web.model.v2.BeerDtoV2;
import co.za.sbk.msscbrew.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .name("Amstel")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .name("Stella")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo update beer body
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer...");
    }
}
