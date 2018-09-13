package design.singleton.e;


// 模拟与数据库的连接
public class Connection {
	
	private static Connection connection = new Connection();  
	
	private Connection(){
	}
	
	public static Connection getInstance() {

		return connection;
	}

}
