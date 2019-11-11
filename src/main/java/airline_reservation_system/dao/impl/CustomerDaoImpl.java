package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.ICustomerDao;
import airline_reservation_system.entity.Customer;


@Repository("CustomerDaoImpl")
public class CustomerDaoImpl implements ICustomerDao {

	//注入
	@Autowired
	private JdbcTemplate jt;
	
	//通过id查找
		@Override
		public Customer select(int id) {
			return jt.queryForObject(
					"select * from t_customer where id=?", 
					new Object[]{id},
					new BeanPropertyRowMapper<>(Customer.class)
					);
		}
		
		//通过用户名和密码查找
		@Override
		public boolean select(String username, String password) {
			return jt.queryForObject(
					"select count(*) from t_customer where username=? and password=?",	
					new Object[] {username,password},
					Integer.class
					)==1;
		}

		//判断用户是否存在
		@Override
		public boolean select(String username) {
			return jt.queryForObject(
					"select count(*) from t_customer where username=? ",
					new Object[] {username},
					Integer.class)==1;
		}

		//查询所与用户
		@Override
		public List<Customer> select() {
			return jt.query(
					"select * from t_customer", 
					new BeanPropertyRowMapper<Customer>(Customer.class));
		}

		//添加管理员用户
		@Override
		public boolean insert(String username, String password,String customer_name,int sex,int age,String id_card) {
			return jt.update(
					"insert into t_customer(username,password,customer_name,sex,age,id_card) value(?,?,?,?,?,?)",
					new Object[] {username,password,customer_name,sex,age,id_card}
					)==1;
		}

		//修改管理员用户
		@Override
		public boolean update(Customer admin) {
			
			return jt.update(
				"update t_customer set username=?,password=?,customer_name=?,sex=?,age=?,id_card=? where id=?",
				new Object[] {admin.getUsername(),admin.getPassword(),admin.getCustomer_name(),admin.getSex(),admin.getAge(),admin.getId_card(),admin.getId()}
					)==1;
		}

		//删除管理员账户
		@Override
		public boolean delete(Customer admin) {
			return jt.update(
					"delete from t_customer where id=?",
					new Object[] {admin.getId()}
					)==1;
		}

}
