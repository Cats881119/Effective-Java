package com.paypal.training;

import java.util.Date;

public class Payment {
	
	
	private	final	float	amount;
	private	final	Date	paymentDate;
	
	
    public Payment(float amt,Date payDate){
	this.amount=amt;
	this.paymentDate=payDate;
    }

    public float getAmount() {
		return amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}
	
   public Payment adjustPaymentAmount(float amt){
	   return new Payment(this.amount+amt,this.paymentDate);
   }
}
