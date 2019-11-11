package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IShopAssistantDao;
import airline_reservation_system.entity.ShopAssistant;

@Repository("ShopAssistantDaoImpl")
public class ShopAssistantDaoImpl implements IShopAssistantDao {

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
				"select count(*) from t_shop_assistant where username=? and password=?",
				new Object[] {username,password},
				Integer.class
				)==1;
	}
	
	//通过id查找
	@Override
	public ShopAssistant select(int id) {
		return jt.queryForObject(
				"select * from t_shop_assistant where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<>(ShopAssistant.class)
				);
	}

	//查询所有用户
	@Override
	public List<ShopAssistant> select() {
		return jt.query(
				"select * from t_shop_assistant",
				new BeanPropertyRowMapper<ShopAssistant>(ShopAssistant.class)
				);
	}

	//添加用户信息
	@Override
	public boolean insert(String username, String password, int assistant_id, String assistant_name, int website_id) {
		return jt.update(
				"insert into t_shop_assistant(username,password,assistant_id,assistant_name,website_id)value(?,?,?,?,?)",
				new Object[] {username,password,assistant_id,assistant_name,website_id}
				)==1;
	}

	//修改用户信息
	@Override
	public boolean update(ShopAssistant sa) {
		return jt.update(
				"update t_shop_assistant set username=?,password=?,assistant_id=?,assistant_name=?,website_id=? where id=?",
				new Object[] {sa.getUsername(),sa.getPassword(),sa.getAssistant_id(),sa.getAssistant_name(),sa.getWebsite_id(),sa.getId()}
				)==1;
	}

	//删除用户信息
	@Override
	public boolean delete(ShopAssistant sa) {
		return jt.update(
				"delete from t_shop_assistant where id=?",
				new Object[]{sa.getId()}
				)==1;
	}

}
