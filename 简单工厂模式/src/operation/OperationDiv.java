package operation;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws Exception {
		double result = 0d;
		if(numberB == 0){
			throw new Exception("除数不能为0");
		}
		result = numberA / numberB;
		return result;
	}

}
