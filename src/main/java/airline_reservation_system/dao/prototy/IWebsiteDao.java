package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Website;


public interface IWebsiteDao {
	
	/**
	 * 判断是否正确
	 * @param username
	 * @return
	 */
	boolean select(String username,String password);
	
	//根据id查找信息
	Website select(int id);
		

		//查询所有信息
		List<Website>select();
		
		//添加信息
		boolean insert(String username,String password,int website_id, String website_name,String address, String telephone,String province,String city );
		
		//修改信息
		boolean update(Website web);
		
		//删除信息
		boolean delete(Website web);
}
