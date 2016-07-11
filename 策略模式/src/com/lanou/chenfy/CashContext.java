package com.lanou.chenfy;

public class CashContext {
	private CashSuper cs;
	
	//通过构造方法传入具体的收费策略
	public CashContext(String type){
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;

		case "打折收费":
			cs = new CashRebate(0.8f);
			break;
		}
	}
	
	public double getResult(double money) {
		//根据收费策略的不同，获得计算结果
		return cs.acceptCash(money);
	}
}
