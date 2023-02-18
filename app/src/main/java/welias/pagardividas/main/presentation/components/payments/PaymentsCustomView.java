package welias.pagardividas.main.presentation.components.payments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

import welias.pagardividas.databinding.CustomViewPaymentsBinding;
import welias.pagardividas.main.data.model.Payment;

public class PaymentsCustomView extends ConstraintLayout {

    private CustomViewPaymentsBinding binding;
    private PaymentsAdapter adapter;

    public PaymentsCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public PaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public PaymentsCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewPaymentsBinding.inflate(LayoutInflater.from(context), this, true);
        adapter = new PaymentsAdapter();
        binding.payments.setAdapter(adapter);
    }

    public void submitList(List<Payment> payments) {
        adapter.submitList(payments);
    }
}
