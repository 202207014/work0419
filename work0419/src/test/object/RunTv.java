package test.object;

import java.util.Iterator;

public class RunTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.setProducer("삼성전자");
		tv1.setColor("RED");
		tv1.setModelNum("aa-11");
		tv1.setChannel(6);
		
		tv2.setProducer("LG전자");
		tv2.setColor("BLACK");
		tv2.setModelNum("bb-22");
		tv2.setChannel(1);
		
		tv1.PowerOn();
		tv1.upChannel();
		tv1.upChannel();
		tv1.upChannel();
		for(int i = 0; i< 10; i++)
		{
			tv1.upVolume();
		}
		
		tv2.PowerOn();
		for(int i = 0; i< 20; i++)
		{
			tv2.upChannel();
		}
		tv2.downChannel();
		
		
		

	}

}
