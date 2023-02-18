package welias.pagardividas.main.data.model;

import androidx.annotation.StringRes;

import java.util.ArrayList;
import java.util.List;

import welias.pagardividas.R;
import welias.pagardividas.main.presentation.main.MainContract;

public class Installment implements MainContract.MainModel.InstallmentModel {

    @StringRes
    private int value;
    @StringRes
    private int date;
    @StringRes
    private int description;

    public Installment() {
    }

    public Installment(int value, int date, int description) {
        this.value = value;
        this.date = date;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    @Override
    public List<Installment> getInstallments() {
        List<Installment> installments = new ArrayList<>();
        installments.add(new Installment(R.string.chosen_installments_item_one_value, R.string.chosen_installments_item_one_date, R.string.chosen_installments_item_one_description));
        installments.add(new Installment(R.string.chosen_installments_item_two_value, R.string.chosen_installments_item_two_date, R.string.chosen_installments_item_two_description));

        return installments;
    }
}
