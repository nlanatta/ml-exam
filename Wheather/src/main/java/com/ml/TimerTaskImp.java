package com.ml;

import java.util.TimerTask;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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
		if( count2 > 10000) {
			this.cancel();
			System.out.println("[[[[[[[[FINISHED]]]]]]]]]]]]]");
		}
		
		firstone += 1;
		secondone += 3;
		thirthdone -= 5;
		
		thirthdonepos = thirthdone + 360;
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
//		System.out.println("////////////////////");
//		System.out.println("firstone :"+firstone);
//		System.out.println("secondone :"+secondone);
//		System.out.println("thirthdone :"+thirthdone);
		
//		alignChequer();
//		triangleChequer();
		checkSameLine();
			
	}

	private void checkSameLine() {
		double x1 = 500*Math.cos(firstone);
		double y1 = 500*Math.sin(firstone);
		double x2 = 2000*Math.cos(secondone);
		double y2 = 2000*Math.sin(secondone);
		double x3 = 1000*Math.cos(thirthdone);
		double y3 = 1000*Math.sin(thirthdone);
		
		double m = (y2-y1)/(x2-x1);
		double a1 = Math.round(y1 - m*x1);
		double a2 = Math.round(y2 - m*x2);
		double a3 = Math.round(y3 - m*x3);
		
		if( a1 == a2 && a1 == a3 && a1 != 0)
		{
			System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[PRESION y TEMP OPTIMA]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
			System.out.println("////////////////////");
			System.out.println("Day :"+count);
			System.out.println("firstone :"+firstone);
			System.out.println("secondone :"+secondone);
//			System.out.println("thirthdone :"+thirthdone);
			System.out.println("thirthdone pos:"+thirthdonepos);
		}
	}

	private void triangleChequer() {
		
		
		if ( ((firstone - secondone) >= 100 || (secondone - firstone) >= 100)
			&& ((firstone - thirthdonepos) >= 100 || (thirthdonepos - firstone) >= 100)
			&& ((secondone - thirthdonepos) >= 90 || (thirthdonepos - secondone) >= 90)
			) {
			System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[LLUVIA]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
			System.out.println("////////////////////");
			System.out.println("Day :"+count);
			System.out.println("firstone :"+firstone);
			System.out.println("secondone :"+secondone);
//			System.out.println("thirthdone :"+thirthdone);
			System.out.println("thirthdone pos:"+thirthdonepos);
		}		
	}

	private void alignChequer() {
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
			System.out.println("Day :"+count);
			System.out.println("firstone :"+firstone);
			System.out.println("secondone :"+secondone);
			System.out.println("thirthdone :"+thirthdone);
			System.out.println("thirthdone pos:"+thirthdonepos);
		}		
	}

}
