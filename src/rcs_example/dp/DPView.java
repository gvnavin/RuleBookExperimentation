package rcs_example.dp;

/**
 * Created by gnavin on 2/28/17.
 */
public class DPView {

    public DPView(final String productType, final String csRestrictionType) {
        this.productType = productType;
        this.csRestrictionType = csRestrictionType;
    }

    public String getProductType() {
        return productType;
    }

    public String getCsRestrictionType() {
        return csRestrictionType;
    }

    private final String productType;
    private final String csRestrictionType;



}
