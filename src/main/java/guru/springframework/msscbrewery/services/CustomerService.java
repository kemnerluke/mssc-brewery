package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);

    void updateCustomer(UUID customerId, CustomerDTO customerDto);


}
