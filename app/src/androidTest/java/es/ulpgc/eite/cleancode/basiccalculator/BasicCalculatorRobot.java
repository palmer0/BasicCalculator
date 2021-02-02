package es.ulpgc.eite.cleancode.basiccalculator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class BasicCalculatorRobot {

    public void calculatorShowsInFirstOperandTheValue(String op1) {
        onView(withId(R.id.op1Input)).check(matches(withText(op1)));
    }

    public void calculatorShowsInSecondOperandTheValue(String op2) {
        onView(withId(R.id.op2Input)).check(matches(withText(op2)));
    }

    public void userEntersInFirstOperandTheValue(String op1) {
        onView(withId(R.id.op1Input))
            .perform(clearText(), closeSoftKeyboard());
        onView(withId(R.id.op1Input))
            .perform(typeText(op1), closeSoftKeyboard());
    }

    public void userEntersInSecondOperandTheValue(String op2) {
        onView(withId(R.id.op2Input))
            .perform(clearText(), closeSoftKeyboard());
        onView(withId(R.id.op2Input))
            .perform(typeText(op2), closeSoftKeyboard());
    }

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

    public void calculatorShowsInResultTheValue(String res) {
        onView(withId(R.id.resText)).check(matches(withText(res)));
    }
}