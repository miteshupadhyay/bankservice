package com.mitesh.tech.learn.bankservice.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
/**
 * <p>
 *     This class contains the Response for the Customer Details,
 *     which will get returned whenever Customer Details will get called.
 *
 * </p>
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */
@Data
public class CustomerDetailsResponse {

    @Schema(description = "First Name of the Customer",example = "Peter")
    private String firstName;

    @Schema(description = "Last Name of the Customer",example = "Parker")
    private String lastName;

    @Schema(description = "City of the Customer",example = "Mumbai")
    private String city;

    @Schema(description = "Account Balance of the Customer",example = "300220.50")
    private double accountBalance;

    @Schema(description = "Card Number of the Customer",example = "1231-2323-4523-5322")
    private String cardNumber;

}
