package welias.pagardividas.main.data.model;

import java.util.ArrayList;
import java.util.List;

public class Values {
    private String leftValue;
    private String rightValue;

    public Values() {
    }

    public Values(String leftValue, String rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public String getLeftValue() {
        return leftValue;
    }

    public String getRightValue() {
        return rightValue;
    }

    public List<Values> getListValuesPayment() {
        List<Values> values = new ArrayList<>();
        values.add(new Values("Total:", "R$ 1.501,26"));
        values.add(new Values("Crédito (R$)", "R$ 59.25"));
        values.add(new Values("Taxa (%)", "3.00"));
        values.add(new Values("Pago", "1.021,98"));
        values.add(new Values("Valor Restando", "R$ 479,28"));

        return values;
    }
}
