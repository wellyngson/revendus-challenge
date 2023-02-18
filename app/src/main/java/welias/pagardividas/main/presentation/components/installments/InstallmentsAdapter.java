package welias.pagardividas.main.presentation.components.installments;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import welias.pagardividas.databinding.ItemChosenInstallmentBinding;
import welias.pagardividas.main.data.model.Installment;

public class InstallmentsAdapter extends ListAdapter<Installment, InstallmentsAdapter.InstallmentViewHolder> {
    public InstallmentsAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Installment> DIFF_CALLBACK = new DiffUtil.ItemCallback<Installment>() {
        @Override
        public boolean areItemsTheSame(@NonNull Installment oldItem, @NonNull Installment newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Installment oldItem, @NonNull Installment newItem) {
            return oldItem == newItem;
        }
    };

    @NonNull
    @Override
    public InstallmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstallmentViewHolder(ItemChosenInstallmentBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull InstallmentViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class InstallmentViewHolder extends RecyclerView.ViewHolder {

        private final ItemChosenInstallmentBinding binding;

        public InstallmentViewHolder(ItemChosenInstallmentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Installment installment) {
            binding.value.setText(installment.getValue());
            binding.date.setText(installment.getDate());
            binding.description.setText(installment.getDescription());
        }
    }
}
