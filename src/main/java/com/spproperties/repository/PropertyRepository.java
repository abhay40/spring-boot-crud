package com.spproperties.repository;

import org.springframework.data.repository.CrudRepository;  
import com.spproperties.model.Property;  

public  interface PropertyRepository extends CrudRepository<Property, Integer>  
{
	
}
