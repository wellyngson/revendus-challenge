package welias.pagardividas.main.presentation.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import welias.pagardividas.databinding.ActivityMainBinding;
import welias.pagardividas.main.data.model.Installment;
import welias.pagardividas.main.data.model.Payment;
import welias.pagardividas.main.data.model.ResumeResumePayments;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private ActivityMainBinding binding;
    private MainContract.MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupPresenter();
        getResumePayment();
        getInstallments();
        getPayments();
    }

    private void setupPresenter() {
         presenter = new MainPresenter(this);
    }

    private void getResumePayment() {
        presenter.getResumePayments();
    }

    private void getInstallments() { presenter.getInstallments(); }

    private void getPayments() { presenter.getPayments(); }

    @Override
    public void showResumePayments(ResumeResumePayments resumePayments) {
        binding.resumePayments.setupNumberInstallment(resumePayments.getNumberInstallments().toString());
        binding.resumePayments.setupDate(resumePayments.getDatePayment());
        binding.resumePayments.submitList(resumePayments.getValues());
    }

    @Override
    public void showGetInstallments(List<Installment> installments) {
        binding.installments.submitList(installments);
    }

    @Override
    public void showPayments(List<Payment> payments) {
        binding.payments.submitList(payments);
    }
}