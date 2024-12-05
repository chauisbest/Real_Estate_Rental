package com.javaweb.BLL.Interface;

import java.util.List;
import java.util.Map;


import com.javaweb.BLL.Model.accomDTO;

public interface accomService {

	List<accomDTO> findAllAccom();
	
	List<accomDTO> searchAccom(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName);


}
