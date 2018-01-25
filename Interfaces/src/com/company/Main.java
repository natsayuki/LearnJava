package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone TimsPhone;
	    TimsPhone = new DeskPhone(123456);
	    TimsPhone.powerOn();
	    TimsPhone.callPhone(123456);
	    TimsPhone.answer();

	    TimsPhone = new MobilePhone(24565);
	    TimsPhone.powerOn();
	    TimsPhone.callPhone(24565);
	    TimsPhone.answer();
    }
}
