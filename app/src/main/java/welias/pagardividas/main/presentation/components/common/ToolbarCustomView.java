package welias.pagardividas.main.presentation.components.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import welias.pagardividas.databinding.CustomViewToolbarBinding;

public class ToolbarCustomView extends ConstraintLayout {

    private CustomViewToolbarBinding binding;

    public ToolbarCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewToolbarBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public void setupBack(Runnable callback) {
        binding.back.setOnClickListener(view -> callback.run());
    }

    public void setupMore(Runnable callback) {
        binding.more.setOnClickListener(view -> callback.run());
    }
}
