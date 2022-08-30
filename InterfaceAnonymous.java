package com.cf.OOps;
import java.time.LocalTime;
interface Railways{
	public abstract void departureTime(LocalTime lt );
	public abstract void arrivalTime(LocalTime lt);
	public abstract void journeyTime(LocalTime lt);
}
class ChennaiExpress implements Railways{
	public void departureTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void arrivalTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void journeyTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
}
class KumariExpress implements Railways{
	public void departureTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void arrivalTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void journeyTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
}
class NellaiExpress implements Railways{
	public void departureTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void arrivalTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
	public  void journeyTime(LocalTime lt) {
		System.out.println("Departure Time"+lt);
	}
}
public class InterfaceAnonymous {
public static void main(String[] args) {
	LocalTime time=LocalTime.now();
	LocalTime dTime=LocalTime.parse("10:18:19");
	LocalTime Atime=LocalTime.parse("06:09:08");
	Railways railway=new Railways(){
		public void departureTime(LocalTime time) {
			System.out.println("Departure Time"+time);
		}
		public  void arrivalTime(LocalTime time) {
			System.out.println("Departure Time"+time);
		}
		public  void journeyTime(LocalTime time) {
			System.out.println("Departure Time"+time.getHour());
		}
	};
	Railways chennai=new ChennaiExpress();
	railway.departureTime(time);
	railway.arrivalTime(time);
	railway.journeyTime(time);
	chennai.departureTime(time);
	chennai.arrivalTime(Atime);
	chennai.journeyTime(Atime);
}
}
