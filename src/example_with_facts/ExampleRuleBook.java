package example_with_facts;

import com.deliveredtechnologies.rulebook.RuleBook;
import com.deliveredtechnologies.rulebook.StandardRule;

import static com.deliveredtechnologies.rulebook.RuleState.BREAK;
import static com.deliveredtechnologies.rulebook.RuleState.NEXT;

/**
 * Created by gnavin on 2/28/17.
 */
public class ExampleRuleBook extends RuleBook<String> {
    @Override
    public void defineRules() {
        //first rule prints "Hello" value from helloFact
        addRule(StandardRule.create(String.class).when(f -> f.containsKey("hello")).then(f -> {
            System.out.print(f.getValue("hello"));
            return NEXT; //continue to the next Rule
        }));

        //second rule prints "World" value from worldFact
        addRule(StandardRule.create(String.class).when(f -> f.containsKey("world")).then(f -> {
            System.out.println(f.getValue("world"));
            return BREAK; //it doesn't matter if NEXT or BREAK is returned here since it's the last Rule
        }));
    }
}
