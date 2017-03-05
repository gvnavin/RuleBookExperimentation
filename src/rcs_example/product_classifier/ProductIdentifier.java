package rcs_example.product_classifier;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.runner.RuleBookRunner;
import rcs_example.dp.DPView;
import rcs_example.Type;

/**
 * Created by gnavin on 3/5/17.
 */
public class ProductIdentifier {

    public Type identifyProduct(final DPView drinks) {
        //cannot use multiple packages
        //it cannot scan folders recursively
        RuleBookRunner ruleBook = new RuleBookRunner("rcs_example.drinks_rules");

        System.out.println("ProductIdentifier.identifyProduct");

        ruleBook.withDeafultResult(false)
                .given(
                        //new Fact("applicants", new ApplicantBean(699, BigDecimal.valueOf(199))),
                        new Fact("dpView", drinks))
                .run();
        Type type = (Type)ruleBook.getResult();
        System.out.println("type = " + type);
        return type;
    }
}
