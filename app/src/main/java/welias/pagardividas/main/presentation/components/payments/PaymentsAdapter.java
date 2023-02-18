package welias.pagardividas.main.presentation.components.payments;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import welias.pagardividas.databinding.ItemPaymentBinding;
import welias.pagardividas.main.data.model.Payment;

public class PaymentsAdapter extends ListAdapter<Payment, PaymentsAdapter.PaymentViewHolder> {

    public PaymentsAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Payment> DIFF_CALLBACK = new DiffUtil.ItemCallback<Payment>() {
        @Override
        public boolean areItemsTheSame(@NonNull Payment oldItem, @NonNull Payment newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Payment oldItem, @NonNull Payment newItem) {
            return oldItem == newItem;
        }
    };

    @NonNull
    @Override
    public PaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PaymentViewHolder(
                ItemPaymentBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class PaymentViewHolder extends RecyclerView.ViewHolder {

        private final ItemPaymentBinding binding;

        public PaymentViewHolder(ItemPaymentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Payment payment) {
            binding.payment.setText(payment.getPaymentType().getValue());
            binding.value.setText(payment.getValue());
            binding.date.setText(payment.getDate());
            binding.icon.setImageDrawable(ResourcesCompat.getDrawable(binding.getRoot().getResources(), payment.getPaymentType().getIcon(), null));
        }
    }
}
