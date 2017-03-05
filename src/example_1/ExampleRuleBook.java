package example_1;

import com.deliveredtechnologies.rulebook.RuleBook;
import com.deliveredtechnologies.rulebook.StandardRule;

import static com.deliveredtechnologies.rulebook.RuleState.BREAK;
import static com.deliveredtechnologies.rulebook.RuleState.NEXT;

/**
 * Created by gnavin on 2/28/17.
 */
public class ExampleRuleBook extends RuleBook {
    @Override
    public void defineRules() {
        //first rule prints "Hello"
        addRule(StandardRule.create().when(f -> true).then(f -> {
            System.out.print("Hello");
            return NEXT; //continue to the next Rule
        }));

        //second rule prints "World"
        addRule(StandardRule.create().when(f -> true).then(f -> {
            System.out.println("World");
            return BREAK; //it doesn't matter if NEXT or BREAK is returned here since it's the last Rule
        }));
    }
}
