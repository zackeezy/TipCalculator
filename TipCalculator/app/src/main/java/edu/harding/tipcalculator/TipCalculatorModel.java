package edu.harding.tipcalculator;

/**
 * Created by zmckee on 9/5/2017.
 */

public class TipCalculatorModel {
    public Float getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(Float tipPercent) {
        this.tipPercent = tipPercent;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    private Float tipPercent;
    private Float total;

    public Float getTipTotal(){
        Float ret;
        ret = total * tipPercent / 100;
        return ret;
    }

    public Float getBill(){
        Float ret;
        ret = total + getTipTotal();
        return ret;
    }
}
