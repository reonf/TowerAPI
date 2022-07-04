package io.swagger.api.creditcard.db;

import java.util.List;

//Mock DB schema with two tables:
//table 1) credit card numbers for validation
//table 2) credit card details for insert operation

public class MockCreditCardDB {

    private List<String> creditCardNumber;

    private List<CreditCardDetailsSchema> creditCardDetails;

    public List<String> getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(List<String> creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public List<CreditCardDetailsSchema> getCreditCardDetails() {
        return creditCardDetails;
    }

    public void setCreditCardDetails(List<CreditCardDetailsSchema> creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }
}
