package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import java.lang.ref.WeakReference;

public interface CalculatorContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(CalculatorViewModel viewModel);

    Integer getOperand1();
    Integer getOperand2();
    void setResult(Integer result);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);
    //void injectRouter(Router router);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onCalButtonClicked();
    void onMulButtonClicked();
    void onAddButtonClicked();
    void onSubButtonClicked();
    void onDivButtonClicked();
  }

  interface Model {

    void onRestartScreen(CalculatorState data);
    void setOperand1(Integer operand);
    void setOperand2(Integer operand);
    Integer getResult();
    void setOperation(String operation);
    Integer getOperand1();
    Integer getOperand2();
    String getOperation();
  }

  /*
  interface Router {

  }
  */
}
