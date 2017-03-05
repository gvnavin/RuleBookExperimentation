package rcs_example;

import rcs_example.dp.DPView;
import rcs_example.product_classifier.ProductIdentifier;

/**
 * Created by gnavin on 2/28/17.
 */
public class Main {

    public static void main(String[] args) {
        final ProductIdentifier productIdentifier = new ProductIdentifier();
        final Type type1 = productIdentifier.identifyProduct(new DPView("drinks", ""));
        System.out.println("type1 = " + type1);
        final Type type2 = productIdentifier.identifyProduct(new DPView("", "us18"));
        System.out.println("type2 = " + type2);
        final Type type3 = productIdentifier.identifyProduct(new DPView("", ""));
        System.out.println("type3 = " + type3);
    }
}
