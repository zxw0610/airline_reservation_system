package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Administrator;

/**
 * 管理员管理
 * @author 张泽
 */
public interface IAdministratorDao {
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	Administrator select(int id);
	
	/**
	 * 判断用户名和密码是否正确
	 * @param username
	 * @param password
	 * @return
	 */
	boolean select(String username,String password);
	
	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	boolean select(String username);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<Administrator> select();
	
	
	/**
	 * 添加用户
	 * @param username
	 * @param password
	 * @return
	 */
	boolean insert(String username,String password);
	
	/**
	 * 修改用户
	 * @param admin
	 * @return
	 */
	boolean update(Administrator admin);
	
	/**
	 * 删除用户
	 * @param admin
	 * @return
	 */
	boolean delete(Administrator admin);
}
