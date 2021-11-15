package com.mitesh.tech.learn.bankservice.impl;

import com.mitesh.tech.learn.bankservice.response.CustomerDetailsResponse;
import com.mitesh.tech.learn.bankservice.service.CustomerDetailsService;
import org.springframework.stereotype.Component;

/**
 * <p>
 *     This class contains the implementation for the Abstract Methods of all the
 *     Customer Related Operations, those are defined in the {@link CustomerDetailsService} interface.
 *
 * </p>
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */
@Component
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    @Override
    public CustomerDetailsResponse getCustomerDetails(String cardNumber) {
        return null;
    }
}
