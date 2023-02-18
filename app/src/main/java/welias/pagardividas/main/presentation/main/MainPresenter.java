package welias.pagardividas.main.presentation.main;

import welias.pagardividas.main.data.model.Installment;
import welias.pagardividas.main.data.model.Payment;
import welias.pagardividas.main.data.model.ResumeResumePayments;

public class MainPresenter implements MainContract.MainPresenter {

    private final MainContract.MainView view;
    private final MainContract.MainModel.ResumePaymentsModel resumePaymentsModel = new ResumeResumePayments();
    private final MainContract.MainModel.InstallmentModel installmentModel = new Installment();
    private final MainContract.MainModel.PaymentsModel paymentsModel = new Payment();

    public MainPresenter(MainContract.MainView view) {
        this.view = view;
    }

    @Override
    public void getResumePayments() {
        view.showResumePayments(resumePaymentsModel.getResumePayments());
    }

    @Override
    public void getInstallments() {
        view.showGetInstallments(installmentModel.getInstallments());
    }

    @Override
    public void getPayments() {
        view.showPayments(paymentsModel.getPayments());
    }
}
