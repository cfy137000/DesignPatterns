package com.lanou.chenfy;

public class CashRebate extends CashSuper {
	private float rebate;
	public CashRebate(float rebate) {
		this.rebate = rebate;
	}
	
	@Override
	public double acceptCash(double money) {
		//打折收费
		return rebate * money;
	}

}
