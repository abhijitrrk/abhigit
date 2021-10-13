package coreJava;

public class CanadianTraffic implements trafficstatus, CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trafficstatus a = new CanadianTraffic();
		a.checktime();
		a.checkweather();

		 CentralTraffic b = new CanadianTraffic();
		 b.greenGo();
		 b.redStop();
		 b.yellowFlash();
	}

	@Override
	public void checkweather() {
		// TODO Auto-generated method stub
		System.out.println("Is it snowing??");
		System.out.println("IS it Sunny?");
		
	}

	@Override
	public void checktime() {
		// TODO Auto-generated method stub
		System.out.println("What time is it in Canada?");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Canadian Green Light");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Canadian Red light");
		
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Canadian Yellow Flashing Light");
		
	}

}
