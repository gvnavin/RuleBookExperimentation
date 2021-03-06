package pojo_bank_example;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import example_using_decision_book.ApplicantBean;

import java.util.List;

/**
 * Created by gnavin on 2/28/17.
 */
@Rule(order = 2)
public class CreditScoreRule {

    //@Given("applicants")
    //private List<ApplicantBean> applicants;

    @Given("applicants")
    private ApplicantBean applicant;

    @Result
    private boolean approved;

    @When
    public boolean when() {
        //return applicants.stream()
        //        .allMatch(applicant -> applicant.getCreditScore() >= 700);

        return applicant.getCreditScore() >= 700;
    }

    @Then
    public RuleState then() {
        approved = true;
        return RuleState.NEXT;
    }
}
