package es.ulpgc.eite.cleancode.basiccalculator.app;

import es.ulpgc.eite.cleancode.basiccalculator.calculator.CalculatorState;

public class AppMediator {

  private CalculatorState state;


  private static AppMediator INSTANCE;

  private AppMediator() {
    state = new CalculatorState();
  }

  public static void resetInstance() {
    INSTANCE = null;
  }


  public static AppMediator getInstance() {
    if(INSTANCE ==null){
      INSTANCE = new AppMediator();
    }

    return INSTANCE;
  }

  public CalculatorState getCalculatorState() {
    return state;
  }
}
