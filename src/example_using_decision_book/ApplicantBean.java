package example_using_decision_book;

import java.math.BigDecimal;

/**
 * Created by gnavin on 2/28/17.
 */
public class ApplicantBean {
    private int creditScore;
    private BigDecimal cashOnHand;

    public ApplicantBean(int creditScore, BigDecimal cashOnHand) {
        this.creditScore = creditScore;
        this.cashOnHand = cashOnHand;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public BigDecimal getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(BigDecimal cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
}
