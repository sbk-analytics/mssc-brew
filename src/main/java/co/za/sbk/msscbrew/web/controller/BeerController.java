package co.za.sbk.msscbrew.web.controller;

import co.za.sbk.msscbrew.web.model.BeerDto;
import co.za.sbk.msscbrew.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}
