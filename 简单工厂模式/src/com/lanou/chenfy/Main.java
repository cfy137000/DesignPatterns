package com.lanou.chenfy;

import java.io.Console;

import operation.Operation;
import operation.OperationFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		Operation operation;
		operation = OperationFactory.createOperate("+");
		operation.setNumberA(10);
		operation.setNumberB(67);
		double result = operation.getResult();
	}

}
