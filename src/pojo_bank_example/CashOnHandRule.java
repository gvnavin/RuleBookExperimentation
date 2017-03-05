package pojo_bank_example;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import example_using_decision_book.ApplicantBean;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gnavin on 2/28/17.
 */
@Rule(order = 3)
public class CashOnHandRule {

    //@Given("applicants")
    //List<ApplicantBean> applicants;

    @Given("applicants")
    private ApplicantBean applicant;

    @Result
    private boolean approved;

    @When
    public boolean when() {
        //return applicants.stream()
        //        .allMatch(applicant -> applicant.getCashOnHand().compareTo(BigDecimal.valueOf(50000)) >= 0);

        return applicant.getCashOnHand().compareTo(BigDecimal.valueOf(50000)) >= 0;
    }

    @Then
    public RuleState then() {
        approved = true;
        return RuleState.BREAK;
    }
}
