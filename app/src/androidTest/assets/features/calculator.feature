Feature: Basic Calculator

  @calculator-feature
  Scenario: Addition of two positive numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "1"
    And User enters in second operand the value "2"
    And User clicks on the operation "+"
    And User clicks on the operation "="
    Then Calculator shows in result the value "3"

  @calculator-feature
  Scenario: Addition of two negative numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "-1"
    And User enters in second operand the value "-3"
    And User clicks on the operation "+"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-4"

  @calculator-feature
  Scenario: Addition of one positive and one negative number

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "1"
    And User enters in second operand the value "-3"
    And User clicks on the operation "+"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-2"

  @calculator-feature
  Scenario: Subtraction of two positive numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "3"
    And User enters in second operand the value "5"
    And User clicks on the operation "-"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-2"

  @calculator-feature
  Scenario: Subtraction of two negative numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "-3"
    And User enters in second operand the value "-5"
    And User clicks on the operation "-"
    And User clicks on the operation "="
    Then Calculator shows in result the value "2"

  @calculator-feature
  Scenario: Subtraction of one negative and one positive number

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "3"
    And User enters in second operand the value "-5"
    And User clicks on the operation "-"
    And User clicks on the operation "="
    Then Calculator shows in result the value "8"

  @calculator-feature
  Scenario: Multiplication of two positive numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "3"
    And User enters in second operand the value "2"
    And User clicks on the operation "x"
    And User clicks on the operation "="
    Then Calculator shows in result the value "6"

  @calculator-feature
  Scenario: Multiplication of two negative numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "-2"
    And User enters in second operand the value "-4"
    And User clicks on the operation "x"
    And User clicks on the operation "="
    Then Calculator shows in result the value "8"

  @calculator-feature
  Scenario: Multiplication of one negative and one positive number

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "3"
    And User enters in second operand the value "-2"
    And User clicks on the operation "x"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-6"

  @calculator-feature
  Scenario: Division of two positive numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "4"
    And User enters in second operand the value "2"
    And User clicks on the operation "/"
    And User clicks on the operation "="
    Then Calculator shows in result the value "2"

  @calculator-feature
  Scenario: Division of two negative numbers

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "-6"
    And User enters in second operand the value "-2"
    And User clicks on the operation "/"
    And User clicks on the operation "="
    Then Calculator shows in result the value "3"

  @calculator-feature
  Scenario: Division of a positive number by negative number

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "9"
    And User enters in second operand the value "-3"
    And User clicks on the operation "/"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-3"

  @calculator-feature
  Scenario: Division of a number by zero

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "6"
    And User enters in second operand the value "0"
    And User clicks on the operation "/"
    And User clicks on the operation "="
    Then Calculator shows in result the value "-1"

  @calculator-feature
  Scenario: Division of zero by any number

    Given Calculator shows in first operand the value "0"
    And Calculator shows in second operand the value "0"
    When User enters in first operand the value "0"
    And User enters in second operand the value "6"
    And User clicks on the operation "/"
    And User clicks on the operation "="
    Then Calculator shows in result the value "0"