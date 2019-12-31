import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class Test {

	public static void main(String[] args) {

		
		String credentials = "1";
		
		//盐值： 
		String salt = "1";//用户名用户领域 唯一的
		
		ByteSource aa = ByteSource.Util.bytes(salt);
		
		//用户注册的时候，保存密码时，必须保存这个obj；
		Object obj = new SimpleHash("SHA-256", credentials, aa, 3);
		System.out.println(obj);
	}

}
