package pojo_example_1;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

/**
 * Created by gnavin on 2/28/17.
 */
@Rule
public class HelloWorld {

    @Given("hello")
    private String hello;

    @Given("world")
    private String world;

    @Result
    private String helloworld;

    @When
    public boolean when() {
        return true;
    }

    @Then
    public RuleState then() {
        helloworld = hello + " " + world;
        return RuleState.BREAK;
    }
}
