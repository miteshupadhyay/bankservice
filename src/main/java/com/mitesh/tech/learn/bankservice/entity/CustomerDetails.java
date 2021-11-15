package com.mitesh.tech.learn.bankservice.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.persistence.*;

/**
 *
 *      Below class is the entity for the Customer Details.
 *      <html>
 *      <head>
 *      <table border="1">
 *          <tr>
 *              <td>customerId</td>
 *              <td>"Unique Id of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>firstName</td>
 *              <td>"FirstName of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>lastName</td>
 *               <td>"LastName of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>city</td>
 *               <td>"City of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>accountType</td>
 *               <td>"Account Type of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>accountBalance</td>
 *               <td>"Account Balance of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>panNumber</td>
 *               <td>"PAN Number of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>cardNumber</td>
 *               <td>"Card Number of the Customer"</td>
 *          </tr>
 *          <tr>
 *              <td>isActive</td>
 *               <td>"Status of the Customer's Account"</td>
 *          </tr>
 *      </table>
 *      <head>
 *      </html>
 *
 */
@Data
@Entity(name = "CustBankInfo")
public class CustomerDetails {

    @Column(name = "custId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    @Column(name = "fName")
    private String firstName;

    @Column(name = "lName")
    private String lastName;

    @Column(name = "city")
    private String city;

    @Column(name = "accType")
    private String accountType;

    @Column(name = "accBal")
    private double accountBalance;

    @Column(name = "pan")
    private String panNumber;

    @Column(name = "cardNo")
    private String cardNumber;

    @Column(name = "isActive")
    private boolean isActive;
}
