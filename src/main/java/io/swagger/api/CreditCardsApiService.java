package io.swagger.api;

import io.swagger.api.creditcard.db.CreditCardDetailsSchema;
import io.swagger.api.creditcard.db.MockCreditCardDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardsApiService {

    @Autowired
    private MockCreditCardDB mockCreditCardDB;

    public List<CreditCardDetailsSchema> findAllCreditCards() {


        List<CreditCardDetailsSchema> records = mockCreditCardDB.getCreditCardDetails();

        return records;
    }
}
