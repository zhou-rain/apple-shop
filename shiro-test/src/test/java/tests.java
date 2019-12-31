import com.qmall.apple.exception.ErrException;

/**
 * @author: zhouR
 * @date: Create in 2019/12/26 - 23:09
 * @function:
 */
public class tests {
	public static void main(String[] args) {

		try {
			ok();
		} catch (ErrException e) {
			e.printStackTrace();
			System.out.println("e = " + e.getMessage());
		}
	}

	


	static String ok() throws ErrException {
		throw new ErrException("hahah");
	}


}
