package rcs_example.drinks_rules;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import rcs_example.Type;
import rcs_example.dp.DPView;

/**
 * Created by gnavin on 3/5/17.
 */
@Rule(order = 2) //order specifies the order the rule should execute in; if not specified, any order may be used
public class DrinkRuleCSRestrictionType {

    @Given("dpView")
    private DPView dpView;

    @Result
    private Type type;

    @When
    public boolean when() {
        if ("us18".equals(dpView.getCsRestrictionType())) {
            return true;
        }
        return false;
    }

    @Then
    public RuleState then() {
        System.out.println("DrinkRuleCSRestrictionType.then");
        type = Type.DRINK;
        return RuleState.NEXT;
    }
}
