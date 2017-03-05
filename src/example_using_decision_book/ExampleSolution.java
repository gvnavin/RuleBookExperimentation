package example_using_decision_book;

import com.deliveredtechnologies.rulebook.Fact;

import java.math.BigDecimal;

/**
 * Created by gnavin on 2/28/17.
 */
public class ExampleSolution {
    public static void main(String[] args) {
        HomeLoanDecisionBook decisionBook = new HomeLoanDecisionBook();
        decisionBook.withDeafultResult(false)
                .given(
                        //new Fact("applicant1", new ApplicantBean(699, BigDecimal.valueOf(199))),
                        new Fact("applicant2", new ApplicantBean(701, BigDecimal.valueOf(51000))))
                .run();

        System.out.println(decisionBook.getResult() ? "Loan Approved!" : "Loan Denied!");
    }
}
