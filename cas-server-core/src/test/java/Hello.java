import org.apache.commons.lang.StringUtils;


public class Hello {
	
	public static void main(String[] args) {
		String ss="1~|~2~|~3";
    	String[] xx=StringUtils.split(ss, "~|~");
    	System.out.println(xx[0]);
    	System.out.println(xx[1]);
    	System.out.println(xx[2]);
	}
}
