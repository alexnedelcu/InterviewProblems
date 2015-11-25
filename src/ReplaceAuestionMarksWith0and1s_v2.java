
public class ReplaceAuestionMarksWith0and1s_v2 {
	public static void main (String [] args)  {
		String abc = "01?1?0";
		Integer x = 0;
		String[] parts = abc.split("\\?");
		
		for (long i=0; i<Math.pow(2, parts.length); i++) {
			System.out.println(i);
			String path = "";
			for (int j=0; j<parts.length; j++) {
				path += parts[j] + ((int) (i/Math.pow(2, j)))%2;
			}
			path = path.substring(0, path.length()-1);
			System.out.println(path);
		}
	}
}
