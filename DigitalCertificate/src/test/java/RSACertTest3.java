import com.fujitsu.RSACertificate;
import com.fujitsu.RSACertificateException;

/**
 * RSA证书测试3，
 * 
 */
public class RSACertTest3 {

	public static void main(String[] args) {
		String message = "ABC123abc&^*中文";


		try {
			RSACertificate privateCertificate = new RSACertificate("D:\\private.cer", RSACertificate.KEY_PRIVATE);

			byte[] encode = privateCertificate.encodeData1(message.getBytes("UTF-8"));

			RSACertificate publicCertificate = new RSACertificate("D:\\public.cer", RSACertificate.KEY_PUBLIC);
//
//			String decode = publicCertificate.decode(encode);

			System.out.println(new String(publicCertificate.decodeData1(encode),"UTF-8"));


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
