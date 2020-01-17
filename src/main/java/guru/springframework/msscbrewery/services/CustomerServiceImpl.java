package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDTO;
import guru.springframework.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .customerName("john doe")
                .build();
    }


    public CustomerDTO saveNewCustomer(CustomerDTO customerDto) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    public void updateCustomer(UUID customerId, CustomerDTO customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }


    }

