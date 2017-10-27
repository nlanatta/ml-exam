import java.util.TimerTask;

public class TimerTaskImp extends TimerTask {

	private int count;
	private int firstone = 0;
	private int secondone = 0;
	private int thirthdone = 0;
	private int thirthdonepos;
	@Override
	public void run() {
		count +=1;
		//System.out.println("Inside Timer Task" + count);
		checkSameAngule(count);
	}

	private void checkSameAngule(int count2) {
//		System.out.println("Day :"+count2);
		if( count2 > 10000)
			this.cancel();
		
		firstone += 1;
		secondone += 3;
		thirthdone -= 5;
		
		thirthdonepos = thirthdone + 360;
//		System.out.println("////////////////////");
//		System.out.println("firstone :"+firstone);
//		System.out.println("secondone :"+secondone);
//		System.out.println("thirthdone :"+thirthdone);
		
		if ( firstone >= 360 )
			firstone = firstone - 360;
		if ( secondone >= 360 )
			secondone = secondone - 360;
		if ( thirthdonepos >= 360 ) {
			thirthdonepos = thirthdonepos - 360;
		}
		if ( thirthdone <= -360)
		{
			thirthdone = thirthdone + 360;
		}
		
		if ( (firstone == secondone 
				|| firstone == (secondone + 180)
				|| firstone == (secondone - 180))
				&& (firstone == thirthdone 
						|| firstone == (thirthdone + 180)
						|| firstone == (thirthdone - 180))) {
			System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[SEQUÍA]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
			System.out.println("////////////////////");
			System.out.println("Day :"+count2);
			System.out.println("firstone :"+firstone);
			System.out.println("secondone :"+secondone);
			System.out.println("thirthdone :"+thirthdone);
		}
		
			
	}

}
