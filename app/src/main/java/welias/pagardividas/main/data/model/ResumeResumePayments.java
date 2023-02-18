package welias.pagardividas.main.data.model;

import java.util.List;

import welias.pagardividas.main.presentation.main.MainContract;

public class ResumeResumePayments implements MainContract.MainModel.ResumePaymentsModel {
    private Integer numberInstallments;
    private String datePayment;
    private List<Values> values;

    public ResumeResumePayments() {}

    public ResumeResumePayments(Integer numberInstallments, String datePayment, List<Values> values) {
        this.numberInstallments = numberInstallments;
        this.datePayment = datePayment;
        this.values = values;
    }

    public Integer getNumberInstallments() {
        return numberInstallments;
    }

    public void setNumberInstallments(Integer numberInstallments) {
        this.numberInstallments = numberInstallments;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public List<Values> getValues() {
        return values;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }

    @Override
    public ResumeResumePayments getResumePayments() {
        ResumeResumePayments resumePayments = new ResumeResumePayments();
        resumePayments.setNumberInstallments(2);
        resumePayments.setDatePayment("10/18/2018");
        resumePayments.setValues(new Values().getListValuesPayment());

        return resumePayments;
    }
}
