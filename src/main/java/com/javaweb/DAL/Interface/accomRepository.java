package com.javaweb.DAL.Interface;

import java.util.List;
import java.util.Map;

import com.javaweb.DAL.Entity.accomEntity;

public interface accomRepository {

	List<accomEntity> findAllAccom();
	
	List<accomEntity> searchAccom(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName);


}
