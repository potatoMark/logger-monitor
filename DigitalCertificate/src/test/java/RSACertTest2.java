import com.fujitsu.RSACertificate;

/**
 * RSA证书测试2，保存和读取证书，加密解密字符串
 * 
 */
public class RSACertTest2 {

	public static void main(String[] args) {
		String message = "1234567890北京掌舵者科技有限公司0987654321";
		try {
			RSACertificate encoder = new RSACertificate();
			encoder.saveKey("D:\\public.cer", RSACertificate.KEY_PUBLIC);
			encoder.saveKey("D:\\private.cer", RSACertificate.KEY_PRIVATE);
			byte[] data = encoder.encode(message);

			RSACertificate decoder = new RSACertificate("D:\\private.cer", RSACertificate.KEY_PRIVATE);
			String result = decoder.decode(data);

			System.out.println(" input: " + message);
			System.out.println("output: " + result);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
