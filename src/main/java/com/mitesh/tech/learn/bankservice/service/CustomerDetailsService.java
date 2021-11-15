package com.mitesh.tech.learn.bankservice.service;

import com.mitesh.tech.learn.bankservice.response.CustomerDetailsResponse;
import org.springframework.stereotype.Service;

/**
 * <p>
 *     This Interface is CustomerDetailsService contains the Abstract Methods for all the
 *     Customer Related Operations.
 * </p>
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */

@Service
public interface CustomerDetailsService {

    public CustomerDetailsResponse getCustomerDetails(String cardNumber);
}
