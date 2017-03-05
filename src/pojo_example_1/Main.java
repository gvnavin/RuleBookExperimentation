package pojo_example_1;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.runner.RuleBookRunner;

/**
 * Created by gnavin on 2/28/17.
 */
public class Main {

    public static void main(String args[]) {
        RuleBookRunner ruleBook = new RuleBookRunner("pojo_example_1");
        ruleBook.given(new Fact("hello", "Hello"), new Fact("world", "World")).run();
        System.out.println(ruleBook.getResult()); //prints "Hello World"
    }

}
