package com.javaweb.BLL.Implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.BLL.Interface.accomService;
import com.javaweb.BLL.Model.accomDTO;
import com.javaweb.DAL.Entity.accomEntity;
import com.javaweb.DAL.Interface.accomRepository;

@Service
public class accomSerImplement implements accomService {

	@Autowired
	private accomRepository accomRepo;
	
	@Override
	public List<accomDTO> findAllAccom() {
		
		List<accomEntity> listAccomEntity = accomRepo.findAllAccom();
		List<accomDTO> listAccomDTO = new ArrayList<accomDTO>();
		
		for(accomEntity item : listAccomEntity) {
			accomDTO ac = new accomDTO();
			ac.setAccommadationName(item.getAccommodationName());
			ac.setAddress(item.getStreet() + ", " + item.getWard() + ", " + item.getDistrict() + ", " + item.getCity() + ", " + item.getProvince());
			ac.setDirection(item.getDirection());
			ac.setSize(item.getSize());
			ac.setNumberOfRooms(item.getNumberOfRooms());
			ac.setDescription(item.getDescription());
			listAccomDTO.add(ac);
		}
		return listAccomDTO;
	}
	
	@Override
	public List<accomDTO> searchAccom(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName) {
		
		List<accomEntity> listAccomEntity = accomRepo.searchAccom(params, amenityName, rentTypeName);
		List<accomDTO> listAccomDTO = new ArrayList<accomDTO>();
		
		for(accomEntity item : listAccomEntity) {
			accomDTO ac = new accomDTO();
			ac.setAccommadationName(item.getAccommodationName());
			ac.setAddress(item.getStreet() + ", " + item.getWard() + ", " + item.getDistrict() + ", " + item.getCity() + ", " + item.getProvince());
			ac.setDirection(item.getDirection());
			ac.setSize(item.getSize());
			ac.setNumberOfRooms(item.getNumberOfRooms());
			ac.setDescription(item.getDescription());
			listAccomDTO.add(ac);
		}
		return listAccomDTO;
	}

}
