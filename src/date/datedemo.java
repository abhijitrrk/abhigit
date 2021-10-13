package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sd.format(d));
		
	}

}
