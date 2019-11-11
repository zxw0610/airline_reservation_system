package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IAdministratorDao;
import airline_reservation_system.entity.Administrator;


@Repository("administratorDaoImpl")
public class AdministratorDaoImpl implements IAdministratorDao {
	@Autowired
	private JdbcTemplate jt;
	
	/**
	 * 通过id查找
	 * @param id
	 * @return Administrator
	 */
	public Administrator select(int id) {
		
		return jt.queryForObject(
				"select * from t_administrator where id=?",
				new Object[] {id},
				new BeanPropertyRowMapper<>(Administrator.class)
				);
	}
	/**
	 * 通过用户名和密码查找
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean select(String username,String password) {
		
		return jt.queryForObject(
				"select count(*) from t_administrator where username=? and password=?",
				new Object[] {username,password},
				Integer.class
				)==1;
	}
	
	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	@Override
	public boolean select(String username) {
		return jt.queryForObject(
				"select count(*) from t_administrator where username=?",
				new Object[] {username},
				Integer.class
				)==1;
	}
	
	
	/**
	 * 查询所有用户
	 * @return
	 */
	@Override
	public List<Administrator> select() {
		return jt.query(
				"select * from t_administrator",
				new BeanPropertyRowMapper<Administrator>(Administrator.class)
				);
	}
	
	/**
	 * 添加管理员用户
	 * @param admin
	 * @return
	 */
	@Override
	public boolean insert(String username,String password) {

		return jt.update(
				"insert into t_administrator(username,password) values(?,?)",
				new Object[] {username,password}
				)==1;
	}
	
	
	
	/**
	 * 修改管理员用户
	 * @param admin
	 * @return
	 */
	@Override
	public boolean update(Administrator admin) {
		return jt.update(
				"update t_administrator set username=?,password=? where id=?",
				new Object[] {admin.getUsername(),admin.getPassword(),admin.getId()}
				)==1;
	}
	
	/**
	 * 删除管理员账户
	 * @param admin
	 * @return
	 */
	@Override
	public boolean delete(Administrator admin) {
		return jt.update(
				"delete from t_administrator where id=?",
				new Object[] {admin.getId()}
				)==1;
	}

	

}
