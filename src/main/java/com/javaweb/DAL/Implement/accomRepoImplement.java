package com.javaweb.DAL.Implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaweb.DAL.Entity.accomEntity;
import com.javaweb.DAL.Interface.accomRepository;
import com.javaweb.DAL.Util.DBHelper;
import com.javaweb.DAL.Util.ListUtil;
import com.javaweb.DAL.Util.NumberUtil;
import com.javaweb.DAL.Util.StringUtil;


@Repository
public class accomRepoImplement implements accomRepository{
	
	public static void joinTableAccom(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName, StringBuilder sql) {
		
		String minPrice = (String) params.get("minPrice");
		String maxPrice = (String) params.get("maxPrice");
		if(StringUtil.checkString(minPrice) || StringUtil.checkString(maxPrice)) 
			sql.append(" join detailrenttype on accommodation.accommodationID = detailrenttype.accommodationID");
		
		if(ListUtil.checkList(amenityName)) 
			sql.append(" join detailamenity on accommodation.accommodationID = detailamenity.accommodationID"
					    + " join amenity on detailamenity.amenityID = amenity.amenityID");
		
		if(ListUtil.checkList(rentTypeName)) 
			sql.append(" join detailrenttype on accommodation.accommodationID = detailrenttype.accommodationID"
					    + " join renttype on detailrenttype.renttypeID = renttype.renttypeID");
	}

	public static void queryNormal(Map<String, Object> params, StringBuilder where) {
		
		for(Map.Entry<String, Object> item : params.entrySet()) {
			if(!item.getKey().equals("amenityName") && !item.getKey().equals("rentTypeName")
					&& !item.getKey().endsWith("Size") && !item.getKey().endsWith("Price")) {
				String value = item.getValue().toString();
				if(StringUtil.checkString(value)) {
					if(NumberUtil.isNumber(value))
						where.append(" AND " + item.getKey() + " = " + value);
					else
						where.append(" AND " + item.getKey() + " LIKE '%" + value + "%'");
				}
			}
		}
	}
	
	public static void querySpecial(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName, StringBuilder where) {
		
		String minPrice = (String) params.get("minPrice");
		if(StringUtil.checkString(minPrice)) 
			where.append(" AND price >= " + minPrice);
		
		String maxPrice = (String) params.get("maxPrice");
		if(StringUtil.checkString(maxPrice)) 
			where.append(" AND price <= " + maxPrice);
		
		String minSize = (String) params.get("minSize");
		if(StringUtil.checkString(minSize)) 
			where.append(" AND size >= " + minSize);
		
		String maxSize = (String) params.get("maxSize");
		if(StringUtil.checkString(maxSize)) 
			where.append(" AND size <= " + maxSize);
		
		if(ListUtil.checkList(amenityName)) {
			List<String> amenity = new ArrayList<String>();
			for (String item : amenityName)
				amenity.add("'" + item + "'");
			where.append(" AND amenityName IN (" + String.join(", ", amenity) + ")");
		}

		if(ListUtil.checkList(rentTypeName)) {
			List<String> rentType = new ArrayList<String>();
			for (String item : rentTypeName)
				rentType.add("'" + item + "'");
			where.append(" AND rentTypeName IN (" + String.join(", ", rentType) + ")");
		}

	}
	
	@Override
	public List<accomEntity> findAllAccom() {


		String sql = "select * from accommodation";
		List<accomEntity> listAccom = new ArrayList<accomEntity>();
		
		try (Connection con = DBHelper.getConnection()) {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				accomEntity accom = new accomEntity();
				accom.setAccommodationID(rs.getInt("accommodationID"));
				accom.setAccommodationName(rs.getString("accommodationName"));
				accom.setStreet(rs.getString("street"));
				accom.setWard(rs.getString("ward"));
				accom.setDistrict(rs.getString("district"));
				accom.setCity(rs.getString("city"));
				accom.setProvince(rs.getString("province"));
				accom.setDirection(rs.getString("direction"));
				accom.setSize(rs.getFloat("size"));
				accom.setNumberOfRooms(rs.getInt("numberOfRooms"));
				accom.setDescription(rs.getString("description"));
				accom.setLessorID(rs.getInt("lessorID"));
				listAccom.add(accom);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Connected database failed...");
		}
		
		return listAccom;
	}

	@Override
	public List<accomEntity> searchAccom(Map<String, Object> params, List<String> amenityName, List<String> rentTypeName) {
		
		StringBuilder sql = new StringBuilder("select * from accommodation ");
		joinTableAccom(params, amenityName, rentTypeName, sql);
		StringBuilder where = new StringBuilder(" where 1 = 1 ");
		queryNormal(params, where);
		querySpecial(params, amenityName, rentTypeName, where);
		sql.append(where);
		sql.append(" group by accommodation.accommodationID");
		
		List<accomEntity> result = new ArrayList<accomEntity>();
		
		try (Connection con = DBHelper.getConnection()) {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				accomEntity accom = new accomEntity();
				accom.setAccommodationID(rs.getInt("accommodationID"));
				accom.setAccommodationName(rs.getString("accommodationName"));
				accom.setStreet(rs.getString("street"));
				accom.setWard(rs.getString("ward"));
				accom.setDistrict(rs.getString("district"));
				accom.setCity(rs.getString("city"));
				accom.setProvince(rs.getString("province"));
				accom.setDirection(rs.getString("direction"));
				accom.setSize(rs.getFloat("size"));
				accom.setNumberOfRooms(rs.getInt("numberOfRooms"));
				accom.setDescription(rs.getString("description"));
				accom.setLessorID(rs.getInt("lessorID"));
				result.add(accom);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Connected database failed...");
		}
		
		return result;
	}

}
