package welias.pagardividas.main.presentation.main;

import java.util.List;

import welias.pagardividas.main.data.model.Installment;
import welias.pagardividas.main.data.model.Payment;
import welias.pagardividas.main.data.model.ResumePayments;

public interface MainContract {
    interface MainView {
        void showResumePayments(ResumePayments resumePayments);
        void showGetInstallments(List<Installment> installments);
        void showPayments(List<Payment> payments);
    }

    interface MainPresenter {
        void getResumePayments();
        void getInstallments();
        void getPayments();
    }

    interface MainModel {
        interface ResumePaymentsModel {
            ResumePayments getResumePayments();

        }

        interface InstallmentModel {
            List<Installment> getInstallments();
        }

        interface PaymentsModel {
            List<Payment> getPayments();
        }
    }
}
