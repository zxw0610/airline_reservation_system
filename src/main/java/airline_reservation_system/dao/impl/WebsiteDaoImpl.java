package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IWebsiteDao;
import airline_reservation_system.entity.Website;


@Repository("websiteDaoImpl")
public class WebsiteDaoImpl implements IWebsiteDao {
	@Autowired
	private JdbcTemplate jt;
	
	/**
	 * 通过用户名和密码查找
	 * @param username
	 * @param password
	 * @return boolean
	 */
	@Override
	public boolean select(String username,String password) {
		
		return jt.queryForObject(
				"select count(*) from t_website where username=? and password=?",
				new Object[] {username,password},
				Integer.class
				)==1;
	}
	
	
	//根据id 查询
	@Override
	public Website select(int id) {
		return jt.queryForObject(
				"select * from t_website where id=?",
				new Object[] {id},
				new BeanPropertyRowMapper<>(Website.class)
				);
	}
	
	//查询全部
	@Override
	public List<Website> select() {
		return jt.query(
				"select * from t_website",
				new BeanPropertyRowMapper<Website>(Website.class)
				);
	}
	
	//添加数据
	@Override
	public boolean insert(String username, String password, int website_id, String website_name, String address,String telephone, String province, String city) {
		return jt.update(
				"insert t_website(username,password,website_id,website_name,address,telephone,province,city) values(?,?,?,?,?,?,?,?)",
				new Object[] {username,password,website_id,website_name,address,telephone,province,city}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(Website web) {
		return jt.update(
				"update t_website set username=?, password=?,website_id=?, website_name=?, address=?,telephone=?, province=?, city=? where id=?" ,
				new Object[] {web.getUsername(),web.getPassword(),web.getWebsite_id(),web.getWebsite_name(),web.getAddress(),web.getTelephone(),web.getProvince(),web.getCity(),web.getId()}
				)==1;
		}
	
	//删除数据
	@Override
	public boolean delete(Website web) {
		return jt.update(
				"delete from t_website where id=?",
				new Object[] {web.getId()}
				)==1;	
		}



	
	
}
