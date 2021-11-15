package com.mitesh.tech.learn.bankservice.repository;

import com.mitesh.tech.learn.bankservice.entity.CustomerDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
/**
 * <p>
 *     This Interface contains the Persistance logic for all the Customer Related Operations.
 * </p>
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */

@Repository
public interface CustomerDetailsRepository extends PagingAndSortingRepository<CustomerDetails,Long> {
}
