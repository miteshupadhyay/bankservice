package com.mitesh.tech.learn.bankservice.constant;

/**
 * This class contains the Open API Specific Constants which will get used
 * for OpenAPI Specification Only.
 *
 * @author Mitesh Upadhyay
 * @version 1.0.0
 * @since 2021-11-10 10:30:23
 */

public class OpenAPIConstant {

    private OpenAPIConstant(){

    }

    /*
        Constants specific to Customer Details API Only
     */

    public static final String CUST_DETAILS_OPERATION_SUMMARY="Get Customer Details by Card Number";
    public static final String CUST_DETAILS_OPERATION_DESC="Display Customer Details";
    public static final String CUST_DETAILS_REQ_MAPPING="/customer-details";
    public static final String CUST_DETAILS_CARD_NO_DESC="Card Number Against which Customer Details needs to be fetched";

    public static final String API_VERSION_V1="v1";
    public static final String X_API_VERSION="X-API-VERSION";
    public static final String RESPONSE_CODE_200="200";
    public static final String RESPONSE_CODE_200_DESC="Successful Operation";
    public static final String RESPONSE_CODE_400="400";
    public static final String RESPONSE_CODE_400_DESC="Bad Request";
    public static final String RESPONSE_CODE_404="404";
    public static final String RESPONSE_CODE_404_DESC="No Data Found";
    public static final String RESPONSE_CODE_401="401";
    public static final String RESPONSE_CODE_401_DESC="UnAuthorized";

}
