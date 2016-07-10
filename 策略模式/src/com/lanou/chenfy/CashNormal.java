package com.lanou.chenfy;

public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		//正常收费
		return money;
	}

}
