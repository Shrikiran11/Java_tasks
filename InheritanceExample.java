class Electronics {
    Electronics() {

    }

    boolean recyclable = true;
    float exportTax = 12.3f;
    String alert = "dispose with care";
    int minAge = 3;

    public void operationalNeeds() {
        System.out.println("needs power");
    }
}

class Tv extends Electronics {
    Tv() {

    }

    int warranty = 3;
    float importTax = 3.2f;
    int volts = 46;

    public void operationalNeeds() {
        System.out.println("needs power and Cable Tv/Dish connection");
    }

    public void display() {
        System.out.println("displaying");
    }

    public void switchChannels() {
        System.out.println("channels changed");
    }
}

class Dvdplayer extends Electronics {
    Dvdplayer() {

    }

    int warranty = 6;
    int volts = 34;

    public void read() {
        System.out.println("reading");
    }

    public void write() {
        System.out.println("writing");
    }

    public void operationalNeeds() {
        System.out.println("needs power and host device");
    }
}

class Radio extends Electronics {
    int warranty = 2;
    int minAge = 2;

    public void charging() {
        System.out.println("battery Power healthy");
    }

    public void fm() {
        System.out.println("voice over");
    }

    public void operationalNeeds() {
        System.out.println("needs power and frequency");
    }

}

class InheritanceExample {
    public static void main(String[] args) {
        Electronics electronic = new Electronics();
        Tv tv = new Tv();
        Dvdplayer dvdplayer = new Dvdplayer();
        Radio radio = new Radio();
        System.out.println(electronic.minAge);
        System.out.println(electronic.recyclable);
        System.out.println(electronic.exportTax);
        System.out.println(tv.alert);
        System.out.println(tv.minAge);
        System.out.println(tv.recyclable);
        System.out.println(radio.alert);
        System.out.println(radio.minAge);
        System.out.println(radio.recyclable);
        System.out.println(dvdplayer.volts);
        System.out.println(dvdplayer.warranty);
        electronic.operationalNeeds();
        tv.operationalNeeds();
        tv.display();
        tv.switchChannels();
        radio.charging();
        radio.fm();
        radio.operationalNeeds();
    }
}