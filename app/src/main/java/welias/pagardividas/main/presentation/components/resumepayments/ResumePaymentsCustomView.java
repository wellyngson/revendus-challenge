package welias.pagardividas.main.presentation.components.resumepayments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import welias.pagardividas.R;
import welias.pagardividas.databinding.CustomViewResumeInstallmentBinding;
import welias.pagardividas.main.data.model.Values;

public class ResumePaymentsCustomView extends ConstraintLayout {

    private CustomViewResumeInstallmentBinding binding;
    private ResumePaymentAdapter resumePaymentAdapter;

    public ResumePaymentsCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ResumePaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ResumePaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ResumePaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewResumeInstallmentBinding.inflate(LayoutInflater.from(context), this, true);
        resumePaymentAdapter = new ResumePaymentAdapter();
        binding.resumePayments.setAdapter(resumePaymentAdapter);
    }

    public void submitList(List<Values> values) {
        resumePaymentAdapter.submitList(values);
    }

    public void setupNumberInstallment(String numberInstallment) {
        binding.installment.setText(String.format("%s: %s %s", getResources().getText(R.string.resume_payment_installment), numberInstallment, getResources().getText(R.string.resume_payment_installment)));
    }

    public void setupDate(String date) {
        binding.date.setText(String.format("%s: %s", getResources().getText(R.string.resume_payment_date_payment), date));
    }
}
