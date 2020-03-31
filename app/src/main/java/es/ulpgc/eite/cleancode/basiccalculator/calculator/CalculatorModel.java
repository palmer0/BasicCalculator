package es.ulpgc.eite.cleancode.basiccalculator.calculator;

public class CalculatorModel implements CalculatorContract.Model {

  public static String TAG = CalculatorModel.class.getSimpleName();

  private Integer operand1, operand2, result;
  private String operation;

  public CalculatorModel() {

    operand1=0;
    operand2=0;
    result=0;
    operation="+";
  }


  @Override
  public void onRestartScreen(CalculatorState data) {
    // Log.e(TAG, "onRestartScreen()");

    operation=data.operation;
    operand2=data.operand2;
    operand1=data.operand1;
    result=data.result;
  }

  @Override
  public void setOperand1(Integer operand) {
    operand1=operand;
  }

  @Override
  public void setOperand2(Integer operand) {
    operand2=operand;
  }

  @Override
  public Integer getResult() {
    result = 0;

    if(operation.equals("+")){
      result = operand1 + operand2;

    } else if(operation.equals("-")){
      result = operand1 - operand2;

    } else if(operation.equals("x")){
      result = operand1 * operand2;

    } else if(operation.equals("/")){

      if(operand2 == 0){
        result = -1;

      } else {
        result = operand1 / operand2;
      }
    }

    return result;
  }

  @Override
  public void setOperation(String operation) {
    this.operation=operation;
  }

  @Override
  public Integer getOperand1() {
    return operand1;
  }

  @Override
  public Integer getOperand2() {
    return operand2;
  }

  @Override
  public String getOperation() {
    return operation;
  }
}
