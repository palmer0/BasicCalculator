package es.ulpgc.eite.cleancode.basiccalculator.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.basiccalculator.calculator.CalculatorState;

public class AppMediator extends Application {

  private CalculatorState state;

  @Override
  public void onCreate() {
    super.onCreate();

    state = new CalculatorState();
  }

  public CalculatorState getCalculatorState() {
    return state;
  }
}
