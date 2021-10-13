package coreJava;

public class AustralianTraffic implements CentralTraffic, trafficstatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CentralTraffic a= new AustralianTraffic();
		 trafficstatus b=new  AustralianTraffic();
		 AustralianTraffic c = new AustralianTraffic();
		 a.greenGo();
		 a.redStop();
		 a.yellowFlash();
		 b.checktime();
		 b.checkweather();
		 c.walkongreen();
		 c.greenGo();
		 
	}
	
	public void walkongreen() {
		System.out.println("Walk when the color turns green!");
	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo Implementation");
		System.out.println("Hello you can not move ahead");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop Implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Flashing Implementation");
	}

	@Override
	public void checkweather() {
		// TODO Auto-generated method stub
		System.out.println("Please check the weather before leaving for work!");
		
	}

	@Override
	public void checktime() {
		// TODO Auto-generated method stub
		System.out.println("Please Check the time before leaving!");
		
	}

}
