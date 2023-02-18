package welias.pagardividas.main.core.enums;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import welias.pagardividas.R;

public enum PaymentType {
    MONEY(R.string.payment_money, R.drawable.ic_money),
    CHECK(R.string.payment_check, R.drawable.ic_check);

    @StringRes
    private final int value;

    @DrawableRes
    private final int icon;

    PaymentType(@StringRes int value, @DrawableRes int icon) {
        this.value = value;
        this.icon = icon;
    }

    public int getValue() {
        return value;
    }

    public int getIcon() { return icon; }
}
