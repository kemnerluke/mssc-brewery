package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
     BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    void updateBeer(UUID beerId, BeerDTO beerDto);

}

