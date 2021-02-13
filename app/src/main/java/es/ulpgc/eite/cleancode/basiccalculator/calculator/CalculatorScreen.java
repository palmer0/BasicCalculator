package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.basiccalculator.app.AppMediator;

public class CalculatorScreen {

  public static void configure(CalculatorContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);


    AppMediator mediator = AppMediator.getInstance();

    CalculatorContract.Presenter presenter = new CalculatorPresenter(mediator);
    CalculatorContract.Model model = new CalculatorModel();
    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
