package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Customer;



public interface ICustomerDao {
	//根据id查找
	Customer select(int id);
		
		
	//判断用户名和密码是否正确
	boolean select(String username,String password);
		
	//判断用户名是否存在
	boolean select(String username);
		
	//查询所有用户
	List<Customer> select();
		
	//添加用户
	boolean insert(String username, String password, String customer_name, int sex, int age, String id_card);
		
	//修改用户
	boolean update(Customer admin);
		
	//删除用户
	boolean delete(Customer admin);

}
