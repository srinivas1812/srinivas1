/**
 * 
 */
package com.Customer;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author venu
 *
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}