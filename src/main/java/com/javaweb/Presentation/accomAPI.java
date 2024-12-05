package com.javaweb.Presentation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.BLL.Interface.accomService;
import com.javaweb.BLL.Model.accomDTO;

@RestController
public class accomAPI {

	@Autowired
	private accomService accomSer;
	
	@PostMapping(value = "/api/accommodation/")
	public List<accomDTO> listAccomDTO() {
		return accomSer.findAllAccom();
	}
	
	@GetMapping(value = "/api/accommodation/")
	public List<accomDTO> searchAccom(@RequestParam Map<String, Object> params, 
										@RequestParam (name = "amenityName", required = false) List<String> amenityName,
										@RequestParam (name = "rentTypeName", required = false) List<String> rentTypeName) {
		return accomSer.searchAccom(params, amenityName, rentTypeName);		
	}
}
