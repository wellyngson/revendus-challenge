package welias.pagardividas.main.data.model;

import java.util.List;

import welias.pagardividas.main.presentation.main.MainContract;

public class ResumePayments implements MainContract.MainModel.ResumePaymentsModel {
    private Integer numberInstallments;
    private String datePayment;
    private List<Values> values;

    public ResumePayments() {
    }

    public ResumePayments(Integer numberInstallments, String datePayment, List<Values> values) {
        this.numberInstallments = numberInstallments;
        this.datePayment = datePayment;
        this.values = values;
    }

    public Integer getNumberInstallments() {
        return numberInstallments;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public List<Values> getValues() {
        return values;
    }

    @Override
    public ResumePayments getResumePayments() {
        return new ResumePayments(2, "10/18/2018", new Values().getListValuesPayment());
    }
}
