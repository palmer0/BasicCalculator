package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import es.ulpgc.eite.cleancode.basiccalculator.app.AppMediator;

public class CalculatorRouter implements CalculatorContract.Router {

  public static String TAG = CalculatorRouter.class.getSimpleName();

  private AppMediator mediator;

  public CalculatorRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

}
