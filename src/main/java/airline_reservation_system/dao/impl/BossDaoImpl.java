package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IBossDao;
import airline_reservation_system.entity.Boss;


/*
 * Boss类的实现类 
 * @author Administrator
 *
 */
@Repository("BossDaoImpl")
public class BossDaoImpl implements IBossDao {
	
	//注入
	@Autowired
	private JdbcTemplate jt;

	//通过id查找
	@Override
	public Boss select(int id) {
		return jt.queryForObject(
				"select * from t_boss where id=?", 
				new Object[]{id},
				new BeanPropertyRowMapper<>(Boss.class)
				);
	}
	
	//通过用户名和密码查找
	@Override
	public boolean select(String username, String password) {
		return jt.queryForObject(
				"select count(*) from t_boss where username=? and password=?",	
				new Object[] {username,password},
				Integer.class
				)==1;
	}

	//判断用户是否存在
	@Override
	public boolean select(String username) {
		return jt.queryForObject(
				"select count(*) from t_boss where username=? ",
				new Object[] {username},
				Integer.class)==1;
	}

	//查询所有用户
	@Override
	public List<Boss> select() {
		return jt.query(
				"select * from t_boss", 
				new BeanPropertyRowMapper<Boss>(Boss.class));
	}

	//添加管理员用户
	@Override
	public boolean insert(String username, String password) {
		return jt.update(
				"insert into t_boss(username,password) value(?,?)",
				new Object[] {username,password}
				)==1;
	}

	//修改管理员用户
	@Override
	public boolean update(Boss admin) {
		
		return jt.update(
			"update t_boss set username=?,password=? where id=?",
			new Object[] {admin.getUsername(),admin.getPassword(),admin.getId()}
				)==1;
	}

	//删除管理员账户
	@Override
	public boolean delete(Boss admin) {
		return jt.update(
				"delete from t_boss where id=?",
				new Object[] {admin.getId()}
				)==1;
	}

}
