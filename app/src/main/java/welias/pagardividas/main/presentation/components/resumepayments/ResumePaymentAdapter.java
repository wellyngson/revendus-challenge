package welias.pagardividas.main.presentation.components.resumepayments;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import welias.pagardividas.R;
import welias.pagardividas.databinding.ItemPaymentValuesBinding;
import welias.pagardividas.main.core.constants.Constants;
import welias.pagardividas.main.data.model.Values;

public class ResumePaymentAdapter extends ListAdapter<Values, ResumePaymentAdapter.ResumePaymentViewHolder> {
    private int size;

    public ResumePaymentAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Values> DIFF_CALLBACK = new DiffUtil.ItemCallback<Values>() {
        @Override
        public boolean areItemsTheSame(@NonNull Values oldItem, @NonNull Values newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Values oldItem, @NonNull Values newItem) {
            return oldItem == newItem;
        }
    };

    @NonNull
    @Override
    public ResumePaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ResumePaymentViewHolder(ItemPaymentValuesBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull ResumePaymentViewHolder holder, int position) {
        holder.bind(getItem(position), size);
    }

    @Override
    public void submitList(@Nullable List<Values> list) {
        super.submitList(list);
        if (list != null && !list.isEmpty()) {
            size = list.size();
        }
    }

    public static class ResumePaymentViewHolder extends RecyclerView.ViewHolder {
        private final ItemPaymentValuesBinding binding;

        public ResumePaymentViewHolder(ItemPaymentValuesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Values values, int size) {
            binding.leftValue.setText(values.getLeftValue());
            binding.rightValue.setText(values.getRightValue());

            if (size == (getAdapterPosition() + Constants.ONE)) {
                binding.endDivider.setVisibility(View.VISIBLE);
                binding.rightValue.setTextColor(binding.getRoot().getResources().getColor(R.color.red_primary));
            }
        }
    }
}
