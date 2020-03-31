package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import android.util.Log;

import java.lang.ref.WeakReference;

public class CalculatorPresenter implements CalculatorContract.Presenter {

  public static String TAG = CalculatorPresenter.class.getSimpleName();

  private WeakReference<CalculatorContract.View> view;
  private CalculatorState state;
  private CalculatorContract.Model model;
  private CalculatorContract.Router router;

  public CalculatorPresenter(CalculatorState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new CalculatorState();
    }

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.onRestartScreen(state);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // call the model and update the state
    state.result = model.getResult();
    state.operand1=model.getOperand1();
    state.operand2=model.getOperand2();
    state.operation=model.getOperation();

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    state.result = model.getResult();
    state.operand1=model.getOperand1();
    state.operand2=model.getOperand2();
    state.operation=model.getOperation();
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onCalButtonClicked() {
    Log.e(TAG, "onCalButtonClicked()");

    Integer result = model.getResult();
    view.get().setResult(result);
  }

  @Override
  public void onMulButtonClicked() {
    Log.e(TAG, "onMulButtonClicked()");

    updateOperands();
    model.setOperation("x");
  }

  @Override
  public void onAddButtonClicked() {
    Log.e(TAG, "onAddButtonClicked()");


    updateOperands();
    model.setOperation("+");


  }

  private void updateOperands() {

    Integer operand1=view.get().getOperand1();
    Integer operand2=view.get().getOperand2();

    model.setOperand1(operand1);
    model.setOperand2(operand2);
  }

  @Override
  public void onSubButtonClicked() {
    Log.e(TAG, "onSubButtonClicked()");

    updateOperands();
    model.setOperation("-");

  }

  @Override
  public void onDivButtonClicked() {
    Log.e(TAG, "onDivButtonClicked()");

    updateOperands();
    model.setOperation("/");
  }

  @Override
  public void injectView(WeakReference<CalculatorContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CalculatorContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(CalculatorContract.Router router) {
    this.router = router;
  }
}
