package pojo_bank_example;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.runner.RuleBookRunner;
import example_using_decision_book.ApplicantBean;

import java.math.BigDecimal;

/**
 * Created by gnavin on 2/28/17.
 */
public class Main {

    public static void main(String[] args) {
        RuleBookRunner ruleBook = new RuleBookRunner("pojo_bank_example");

        System.out.println("Main.main");

        ruleBook.withDeafultResult(false)
                .given(
                        new Fact("applicants", new ApplicantBean(699, BigDecimal.valueOf(199)))
                )
                .run();
        boolean approval = (boolean) ruleBook.getResult();
        System.out.println("Application is " + (approval ? "approved!" : "not approved!"));

        ruleBook.withDeafultResult(false)
                .given(
                        new Fact("applicants", new ApplicantBean(701, BigDecimal.valueOf(51000)))
                )
                .run();
        boolean approval2 = (boolean) ruleBook.getResult();
        System.out.println("Application is " + (approval2 ? "approved!" : "not approved!"));
    }
}
