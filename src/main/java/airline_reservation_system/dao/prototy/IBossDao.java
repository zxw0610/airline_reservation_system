package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Boss;

//Boss类的接口
public interface IBossDao {
	
	//根据id查找
	Boss select(int id);
	
	
	//判断用户名和密码是否正确
	boolean select(String username,String password);
	
	//判断用户名是否存在
	boolean select(String username);
	
	//查询所有用户
	List<Boss> select();
	
	//添加用户
	boolean insert(String username,String password);
	
	//修改用户
	boolean update(Boss admin);
	
	//删除用户
	boolean delete(Boss admin);
	
}
