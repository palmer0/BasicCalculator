package es.ulpgc.eite.cleancode.basiccalculator.calculator;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.basiccalculator.app.AppMediator;

public class CalculatorScreen {

  public static void configure(CalculatorContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);


    //AppMediator mediator = (AppMediator) context.get().getApplication();
    AppMediator mediator = AppMediator.getInstance();
    CalculatorState state = mediator.getCalculatorState();

    CalculatorContract.Router router = new CalculatorRouter(mediator);
    CalculatorContract.Presenter presenter = new CalculatorPresenter(state);
    CalculatorContract.Model model = new CalculatorModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
