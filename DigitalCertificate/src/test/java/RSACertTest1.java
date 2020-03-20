import com.fujitsu.RSACertificate;

/**
 * RSA证书测试1，生成证书，加密解密字符串
 * 
 */
public class RSACertTest1 {


	public static void main(String[] args) {
		String message = "1234567890北京掌舵者科技有限公司0987654321";
		try {
			RSACertificate cert = new RSACertificate();
			byte[] data = cert.encode(message);
			String result = cert.decode(data);
			System.out.println(" input: " + message);
			System.out.println("output: " + result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
