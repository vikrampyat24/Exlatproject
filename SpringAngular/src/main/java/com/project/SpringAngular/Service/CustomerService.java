package com.project.SpringAngular.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.project.SpringAngular.DTO.CustomerDTO;
import com.project.SpringAngular.DTO.CustomerSaveDTO;
import com.project.SpringAngular.DTO.CustomerUpdateDTO;

@Service
public interface CustomerService {

	
	 String addCustomer(CustomerSaveDTO customerSaveDTO);

	    List<CustomerDTO> getAllCustomer();

	    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

	    boolean deleteCustomer(int id);
}
