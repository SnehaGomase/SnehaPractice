package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController
{
public String saveCustomerDetails()
{
return "Customer Controller Modified";
}
public String updateCustomer()
{
	return "Customer Details Updated";
}
}
