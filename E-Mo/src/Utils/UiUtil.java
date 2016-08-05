package Utils;

public class UiUtil {
	public static String toUnicode(String str)
	{
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			return new String(b);
		}
		catch (java.io.UnsupportedEncodingException uee) {
			uee.printStackTrace();
			return null;
		}
	}
	public static String toLatin(String str)
	{
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			return new String(b, "ISO-8859-1");
		}
		catch (java.io.UnsupportedEncodingException uee) {
			uee.printStackTrace();
			return null;
		}
	}
}
