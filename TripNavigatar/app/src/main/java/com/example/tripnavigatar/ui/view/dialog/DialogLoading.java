package com.example.tripnavigatar.ui.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.tripnavigatar.R;

public class DialogLoading extends Dialog {
    TextView contentTv;
    public DialogLoading(Context context) {
        super(context, R.style.LoadingDialog);
        this.setCancelable(true);
        setCanceledOnTouchOutside(false);

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_loading, null);
        contentTv =  view.findViewById(R.id.text_view);
        setContentView(view);

    }

    public void setDialogLabel(String label) {
        contentTv.setText(label);
    }
}
