package welias.pagardividas.main.data.model;

import androidx.annotation.StringRes;

import java.util.ArrayList;
import java.util.List;

import welias.pagardividas.R;
import welias.pagardividas.main.core.enums.PaymentType;
import welias.pagardividas.main.presentation.main.MainContract;

public class Payment implements MainContract.MainModel.PaymentsModel {
    private PaymentType paymentType;
    @StringRes
    private int value;
    @StringRes
    private int date;

    public Payment() {
    }

    public Payment(PaymentType paymentType, int value, int date) {
        this.paymentType = paymentType;
        this.value = value;
        this.date = date;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public int getValue() {
        return value;
    }

    public int getDate() {
        return date;
    }


    @Override
    public List<Payment> getPayments() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(PaymentType.MONEY, R.string.payment_value_item_one_value, R.string.payment_value_item_one_date));
        payments.add(new Payment(PaymentType.MONEY, R.string.payment_value_item_two_and_three_value, R.string.payment_value_item_two_and_three_date));
        payments.add(new Payment(PaymentType.CHECK, R.string.payment_value_item_two_and_three_value, R.string.payment_value_item_two_and_three_date));

        return payments;
    }
}
