package example_with_facts;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.RuleBook;

/**
 * Created by gnavin on 2/28/17.
 */
public class ExampleMainClass {
    public static void main(String[] args) {
        Fact<String> helloFact = new Fact<>("hello1", "Hello");
        Fact<String> worldFact = new Fact<>("world", "World");
        RuleBook exampleRuleBook = new ExampleRuleBook();
        exampleRuleBook.given(helloFact, worldFact).run();
    }
}
