package es.ulpgc.eite.cleancode.basiccalculator.test;

import android.app.Activity;
import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.ulpgc.eite.cleancode.basiccalculator.R;
import es.ulpgc.eite.cleancode.basiccalculator.calculator.CalculatorActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@SuppressWarnings("ALL")
public class BasicCalculatorSteps {

  @Rule
  public ActivityTestRule<CalculatorActivity> testRule =
      new ActivityTestRule(CalculatorActivity.class, true, false);

  private Activity activity;

//  private void userRotatesTheScreen() {
//
//    Context context = ApplicationProvider.getApplicationContext();
//    int orientation= context.getResources().getConfiguration().orientation;
//    Activity activity = questionTestRule.getActivity();
//
//    if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
//      activity.setRequestedOrientation(
//          ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
//      );
//
//    } else {
//      activity.setRequestedOrientation(
//          ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//      );
//    }
//  }

  @Before("@calculator-feature")
  public void setUp() {
    testRule.launchActivity(new Intent());
    activity = testRule.getActivity();
  }

  @After("@calculator-feature")
  public void tearDown() {
    testRule.finishActivity();
  }

  @Given("^Calculator shows in first operand the value \"([^\"]*)\"$")
  public void calculatorShowsInFirstOperandTheValue(String op1) {
    onView(withId(R.id.op1Input)).check(matches(withText(op1)));
  }

  @And("^Calculator shows in second operand the value \"([^\"]*)\"$")
  public void calculatorShowsInSecondOperandTheValue(String op2) {
    onView(withId(R.id.op2Input)).check(matches(withText(op2)));
  }

  @When("^User enters in first operand the value \"([^\"]*)\"$")
  public void userEntersInFirstOperandTheValue(String op1) {
    onView(withId(R.id.op1Input))
        .perform(clearText(), closeSoftKeyboard());
    onView(withId(R.id.op1Input))
        .perform(typeText(op1), closeSoftKeyboard());
  }

  @And("^User enters in second operand the value \"([^\"]*)\"$")
  public void userEntersInSecondOperandTheValue(String op2) {
    onView(withId(R.id.op2Input))
        .perform(clearText(), closeSoftKeyboard());
    onView(withId(R.id.op2Input))
        .perform(typeText(op2), closeSoftKeyboard());
  }

  @And("^User clicks on the operation \"([^\"]*)\"$")
  public void userClicksOnTheOperation(String op) {
    if(op.equals("+")) {
      onView(withId(R.id.addButton)).perform(click());
    } else if(op.equals("-")) {
      onView(withId(R.id.subButton)).perform(click());
    } else if(op.equals("x")) {
      onView(withId(R.id.mulButton)).perform(click());
    } else if(op.equals("/")) {
      onView(withId(R.id.divButton)).perform(click());
    } else {
      onView(withId(R.id.calButton)).perform(click());
    }
  }

  @Then("^Calculator shows in result the value \"([^\"]*)\"$")
  public void calculatorShowsInResultTheValue(String res) {
    onView(withId(R.id.resText)).check(matches(withText(res)));
  }

}
