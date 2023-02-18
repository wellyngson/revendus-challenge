package welias.pagardividas.main.presentation.components.installments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

import welias.pagardividas.databinding.CustomViewChosenInstallmentBinding;
import welias.pagardividas.main.data.model.Installment;

public class InstallmentCustomView extends ConstraintLayout {

    private CustomViewChosenInstallmentBinding binding;
    private InstallmentsAdapter adapter;

    public InstallmentCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public InstallmentCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public InstallmentCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public InstallmentCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewChosenInstallmentBinding.inflate(LayoutInflater.from(context), this, true);
        adapter = new InstallmentsAdapter();
        binding.installments.setAdapter(adapter);
    }

    public void submitList(List<Installment> installments) {
        adapter.submitList(installments);
    }
}
