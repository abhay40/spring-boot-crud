package com.spproperties.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spproperties.service.*;
import com.spproperties.model.Property;  
//import com.spproperties.*; 

@RestController
public class SPpropertyController 
{
	
	@Autowired
	PropertyService propertyService;
	
	
	@GetMapping("/properties")  
	private List<Property> getAllProperty()   
	{  
	return propertyService.getAllProperty();  
	
	}  
	
	@GetMapping("/property/{pid}")  
	private Property getProperty(@PathVariable("pid") int pid)   
	{  
	return propertyService.getPropertyByPId(pid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/property/{pid}")  
	private void deleteProperty(@PathVariable("pid") int pid)   
	{  
		propertyService.delete(pid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/property")  
	private int saveProperty(@RequestBody Property property)   
	{  
	  propertyService.saveOrUpdate(property);  
	  return property.getpId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/property")  
	private Property update(@RequestBody Property property)   
	{  
	propertyService.saveOrUpdate(property);  
	return property;  
	} 
	

}
