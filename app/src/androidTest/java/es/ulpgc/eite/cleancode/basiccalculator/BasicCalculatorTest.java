package es.ulpgc.eite.cleancode.basiccalculator;


import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import es.ulpgc.eite.cleancode.basiccalculator.calculator.CalculatorActivity;

@SuppressWarnings("ALL")
@LargeTest
@RunWith(AndroidJUnit4.class)
public class BasicCalculatorTest {


    @Rule
    public ActivityTestRule<CalculatorActivity> rule =
        new ActivityTestRule<>(CalculatorActivity.class);

    public BasicCalculatorRobot robot = new BasicCalculatorRobot();


    private void userRotatesTheScreen() {

        Context context = ApplicationProvider.getApplicationContext();
        int orientation= context.getResources().getConfiguration().orientation;
        Activity activity = rule.getActivity();

        if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            );

        } else {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            );
        }
    }

    @Test
    public void testAdditionOfTwoPositiveNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "1"
        robot.userEntersInFirstOperandTheValue("1");
        // And User enters in second operand the value "2"
        robot.userEntersInSecondOperandTheValue("2");
        // And User clicks on the operation "+"
        robot.userClicksOnTheOperation("+");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "3"
        robot.calculatorShowsInResultTheValue("3");
    }

    @Test
    public void testAdditionOfTwoNegativeNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "-1"
        robot.userEntersInFirstOperandTheValue("-1");
        // And User enters in second operand the value "-3"
        robot.userEntersInSecondOperandTheValue("-3");
        // And User clicks on the operation "+"
        robot.userClicksOnTheOperation("+");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-4"
        robot.calculatorShowsInResultTheValue("-4");
    }

    @Test
    public void testAdditionOfOnePositiveAndOneNegativeNumber() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "1"
        robot.userEntersInFirstOperandTheValue("1");
        // And User enters in second operand the value "-3"
        robot.userEntersInSecondOperandTheValue("-3");
        // And User clicks on the operation "+"
        robot.userClicksOnTheOperation("+");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-2"
        robot.calculatorShowsInResultTheValue("-2");
    }

    @Test
    public void testSubtractionOfTwoPositiveNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "3"
        robot.userEntersInFirstOperandTheValue("3");
        // And User enters in second operand the value "5"
        robot.userEntersInSecondOperandTheValue("5");
        // And User clicks on the operation "-"
        robot.userClicksOnTheOperation("-");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-2"
        robot.calculatorShowsInResultTheValue("-2");
    }

    @Test
    public void testSubtractionOfTwoNegativeNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "-3"
        robot.userEntersInFirstOperandTheValue("-3");
        // And User enters in second operand the value "-5"
        robot.userEntersInSecondOperandTheValue("-5");
        // And User clicks on the operation "-"
        robot.userClicksOnTheOperation("-");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "2"
        robot.calculatorShowsInResultTheValue("2");
    }

    @Test
    public void testSubtractionOfOneNegativeAndOnePositiveNumber() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "3"
        robot.userEntersInFirstOperandTheValue("3");
        // And User enters in second operand the value "-5"
        robot.userEntersInSecondOperandTheValue("-5");
        // And User clicks on the operation "-"
        robot.userClicksOnTheOperation("-");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "8"
        robot.calculatorShowsInResultTheValue("8");
    }

    @Test
    public void testMultiplicationOfTwoPositiveNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "3"
        robot.userEntersInFirstOperandTheValue("3");
        // And User enters in second operand the value "2"
        robot.userEntersInSecondOperandTheValue("2");
        // And User clicks on the operation "x"
        robot.userClicksOnTheOperation("x");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "6"
        robot.calculatorShowsInResultTheValue("6");
    }

    @Test
    public void testMultiplicationOfTwoNegativeNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "-2"
        robot.userEntersInFirstOperandTheValue("-2");
        // And User enters in second operand the value "-4"
        robot.userEntersInSecondOperandTheValue("-4");
        // And User clicks on the operation "x"
        robot.userClicksOnTheOperation("x");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "8"
        robot.calculatorShowsInResultTheValue("8");
    }

    @Test
    public void testMultiplicationOfOneNegativeAndOnePositiveNumber() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "3"
        robot.userEntersInFirstOperandTheValue("3");
        // And User enters in second operand the value "-2"
        robot.userEntersInSecondOperandTheValue("-2");
        // And User clicks on the operation "x"
        robot.userClicksOnTheOperation("x");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-6"
        robot.calculatorShowsInResultTheValue("-6");
    }

    @Test
    public void testDivisionOfTwoPositiveNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "4"
        robot.userEntersInFirstOperandTheValue("4");
        // And User enters in second operand the value "2"
        robot.userEntersInSecondOperandTheValue("2");
        // And User clicks on the operation "/"
        robot.userClicksOnTheOperation("/");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "2"
        robot.calculatorShowsInResultTheValue("2");
    }

    @Test
    public void testDivisionOfTwoNegativeNumbers() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "-6"
        robot.userEntersInFirstOperandTheValue("-6");
        // And User enters in second operand the value "-2"
        robot.userEntersInSecondOperandTheValue("-2");
        // And User clicks on the operation "/"
        robot.userClicksOnTheOperation("/");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "3"
        robot.calculatorShowsInResultTheValue("3");
    }

    @Test
    public void testDivisionOfAPositiveNumberByNegativeNumber() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "9"
        robot.userEntersInFirstOperandTheValue("9");
        // And User enters in second operand the value "-3"
        robot.userEntersInSecondOperandTheValue("-3");
        // And User clicks on the operation "/"
        robot.userClicksOnTheOperation("/");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-3"
        robot.calculatorShowsInResultTheValue("-3");
    }

    @Test
    public void testDivisionOfANumberByZero() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "6"
        robot.userEntersInFirstOperandTheValue("6");
        // And User enters in second operand the value "0"
        robot.userEntersInSecondOperandTheValue("0");
        // And User clicks on the operation "/"
        robot.userClicksOnTheOperation("/");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "-1"
        robot.calculatorShowsInResultTheValue("-1");
    }

    @Test
    public void testDivisionOfZeroByAnyNumber() {
        // Given Calculator shows in first operand the value "0"
        robot.calculatorShowsInFirstOperandTheValue("0");
        // And Calculator shows in second operand the value "0"
        robot.calculatorShowsInSecondOperandTheValue("0");
        // When User enters in first operand the value "0"
        robot.userEntersInFirstOperandTheValue("0");
        // And User enters in second operand the value "6"
        robot.userEntersInSecondOperandTheValue("6");
        // And User clicks on the operation "/"
        robot.userClicksOnTheOperation("/");
        // And User clicks on the operation "="
        robot.userClicksOnTheOperation("=");
        // Then Calculator shows in result the value "0"
        robot.calculatorShowsInResultTheValue("0");
    }
}