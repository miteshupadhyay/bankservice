package com.mitesh.tech.learn.bankservice.controller.v1;


import com.mitesh.tech.learn.bankservice.constant.CommonConstant;
import com.mitesh.tech.learn.bankservice.constant.OpenAPIConstant;
import com.mitesh.tech.learn.bankservice.entity.CustomerDetails;
import com.mitesh.tech.learn.bankservice.response.CustomerDetailsResponse;
import com.mitesh.tech.learn.bankservice.service.CustomerDetailsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;

/**
 * <p>
 *     This class is the V1 version CustomerDetailController, which aims to perform the operations
 *     related to Customer Details.
 *     <ul>
 *         <li>Get the Customer Details By Debit Card</li>
 *     </ul>
 *
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 * </p>
 */
@RestController("customerDetailControllerV1")
@Tag(name = "customerDetails",description = "Customer Details API")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerDetailsService;

    /**
     * Below Method will return the Customer Details against the particular Debit Card No
     *
     * @param CardNumber against which Customer Details needs to be fetched
     * @return CustomerDetails Response Object of {@link CustomerDetailsResponse}
     */
    @Operation(tags = {"customer-details"},summary = OpenAPIConstant.CUST_DETAILS_OPERATION_SUMMARY,description = OpenAPIConstant.CUST_DETAILS_OPERATION_DESC)
    @Parameter(name = OpenAPIConstant.X_API_VERSION,in= ParameterIn.HEADER,required = true,schema = @Schema(defaultValue = OpenAPIConstant.API_VERSION_V1))
    @ApiResponses(value = {
            @ApiResponse(description = OpenAPIConstant.RESPONSE_CODE_200_DESC,responseCode = OpenAPIConstant.RESPONSE_CODE_200,content = @Content(schema = @Schema(implementation = CustomerDetailsResponse.class))),
            @ApiResponse(description = OpenAPIConstant.RESPONSE_CODE_400_DESC,responseCode = OpenAPIConstant.RESPONSE_CODE_400,content = @Content(schema = @Schema(description = "Bad Request",hidden = true))),
            @ApiResponse(description = OpenAPIConstant.RESPONSE_CODE_404_DESC,responseCode = OpenAPIConstant.RESPONSE_CODE_404,content = @Content(schema = @Schema(description = "No Data Found",hidden = true)))
    })
    @GetMapping(value = OpenAPIConstant.CUST_DETAILS_REQ_MAPPING,headers = OpenAPIConstant.X_API_VERSION+"="+OpenAPIConstant.API_VERSION_V1,produces = CommonConstant.APPLICATION_JSON)
    public ResponseEntity<CustomerDetailsResponse> getCustomerDetailsByCardNumber(
            @Parameter(description = OpenAPIConstant.CUST_DETAILS_CARD_NO_DESC,required = true)
            @NotNull(message = "{cardNum.not.blank}")
            @PathParam("cardNumber") String cardNumber){
    return new ResponseEntity<>(customerDetailsService.getCustomerDetails(cardNumber), HttpStatus.OK);
    }


}
