package com.cf.OOps;
class Electronics {
    Electronics() {

    }

   public void recycle() {
	   System.out.println("recycle with care");
   }
    public void claimMoney(int price) {
    	price=price-price/5;
    	System.out.println("price");
    }
    public void operationalNeeds() {
        System.out.println("needs power");
    }
}

class Tv extends Electronics {
    Tv() {

    }

    public void recycle() {
 	   System.out.println("Not Disposable and less recyclable");
    }
     public void claimMoney(int price) {
     	price=price-price/3;
     	System.out.println(price);
     }
     public void operationalNeeds() {
         System.out.println("needs power and  wireless signal/cable connection/pendrive");
     }
     public void display() {
         System.out.println("displaying");
     }
}

class DvdPlayer extends Electronics {
    DvdPlayer() {

    }
    public void recycle() {
 	   System.out.println("recycle with care");
    }
     public void claimMoney(int price) {
     	price=price-price/2;
     	System.out.println(price);
     }

    public void operationalNeeds() {
        System.out.println("needs power and host device");
    }
    //unique method
    public void read() {
        System.out.println("reading");
    }
    //unique method
    public void write() {
        System.out.println("writing");
    }
}

class Radio extends Electronics {
	public void recycle() {
		   System.out.println("recycle with care");
	   }
	    public void claimMoney(int price) {
	    	price=price-price/90*100;
	    	System.out.println(price);
	    }
    public void operationalNeeds() {
        System.out.println("needs power and frequency");
    }
    //unique method
    public void fm() {
        System.out.println("frequency control");
    }
}
public class ElectronicsDynamic {
	public static void main(String[] args) {
	Electronics electronic=new Tv();
    electronic.claimMoney(1000);
    electronic.recycle();
    electronic.operationalNeeds();
    Electronics electronic2=new DvdPlayer();
    electronic2.claimMoney(1900);
    electronic2.recycle();
    electronic2.operationalNeeds();
    Electronics electronic3=new Radio();
    electronic.claimMoney(5000);
    electronic.recycle();
    electronic.operationalNeeds();
	}
}
