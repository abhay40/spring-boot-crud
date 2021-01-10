package com.spproperties.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.spproperties.model.*;
import com.spproperties.controller.*;
import com.spproperties.repository.*;

@Service
public class PropertyService {
	@Autowired  
	PropertyRepository propertyRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Property> getAllProperty()   
	{  
	  List<Property> property = new ArrayList<Property>();  
	  propertyRepository.findAll().forEach(property1 -> property.add(property1));  
	  return property;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Property getPropertyByPId(int id)   
	{  
	return propertyRepository.findByPId(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Property property)   
	{  
	 propertyRepository.save(property);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	  propertyRepository.deleteByPId(id);  
	}  
	//updating a record  
	public void update(Property property, int id)   
	{  
	   propertyRepository.save(property);  
	}
}
