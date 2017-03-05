package pojo_bank_example2;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import example_using_decision_book.ApplicantBean;

/**
 * Created by gnavin on 2/28/17.
 */
@Rule(order = 1) //order specifies the order the rule should execute in; if not specified, any order may be used
public class ApplicantNumberRule {

    //@Given("applicants")
    //private List<ApplicantBean> applicants; //Annotated Lists get injected with all Facts of the declared generic type

    @Given("applicants")
    private ApplicantBean applicant;

    @Result
    private boolean approved;

    @When
    public boolean when() {
        System.out.println("ApplicantNumberRule.when");
        System.out.println("applicants = " + applicant);
        System.out.println("applicants.size() = " + applicant);
        //return applicants.size() > 3;
        return false;
    }

    @Then
    public RuleState then() {
        System.out.println("ApplicantNumberRule.then");
        approved = false;
        return RuleState.BREAK;
    }
}
