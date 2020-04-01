package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.cleancode.basiccalculator.R;

public class CalculatorActivity
    extends AppCompatActivity implements CalculatorContract.View {

  public static String TAG = CalculatorActivity.class.getSimpleName();

  private CalculatorContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_calculator);
    getSupportActionBar().setTitle(R.string.app_name);
    getSupportActionBar().hide();

    // do the setup
    CalculatorScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }

  public void onCalButtonClicked(View view) {
    presenter.onCalButtonClicked();
  }

  public void onMulButtonClicked(View view) {
    presenter.onMulButtonClicked();
  }

  public void onAddButtonClicked(View view) {
    presenter.onAddButtonClicked();
  }

  public void onSubButtonClicked(View view) {
    presenter.onSubButtonClicked();
  }



  public void onDivButtonClicked(View view) {
    presenter.onDivButtonClicked();
  }

  @Override
  public void onDataUpdated(CalculatorViewModel viewModel) {
    //Log.e(TAG, "onDataUpdated()");

    // deal with the data
    ((TextView) findViewById(R.id.resText))
        .setText(viewModel.result.toString());
    ((EditText) findViewById(R.id.op1Input))
        .setText(viewModel.operand1.toString());
    ((EditText) findViewById(R.id.op2Input))
        .setText(viewModel.operand2.toString());
  }

  @Override
  public Integer getOperand1() {
    String op1= ((EditText) findViewById(R.id.op1Input)).getText().toString();
    return Integer.valueOf(op1);
  }

  @Override
  public Integer getOperand2() {
    String op2= ((EditText) findViewById(R.id.op2Input)).getText().toString();
    return Integer.valueOf(op2);
  }

  @Override
  public void setResult(Integer result) {
    ((TextView) findViewById(R.id.resText)).setText(String.valueOf(result));
  }

  @Override
  public void injectPresenter(CalculatorContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
