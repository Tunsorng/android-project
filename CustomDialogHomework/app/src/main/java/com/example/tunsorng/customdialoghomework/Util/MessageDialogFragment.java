package com.example.tunsorng.customdialoghomework.Util;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.example.tunsorng.customdialoghomework.R;

public class MessageDialogFragment extends DialogFragment {

    private  String message;

    private OnSendDataListener listener;


    public void setOnSendDataListener(OnSendDataListener listener){
        this.listener = listener;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());
        builder.setTitle("Input your product");

        View view =LayoutInflater.from(getActivity()).
                inflate(R.layout.product_dialog,null);
        builder.setView(view);

        EditText ProID=view.findViewById(R.id.txtProID);
        EditText ProName=view.findViewById(R.id.txtProName);
        EditText ProPrice=view.findViewById(R.id.txtProPrice);
        EditText ProDateImport=view.findViewById(R.id.txtProDateImport);

        builder.setPositiveButton("OK",(dialog,id)->{
            String ID = ProID.getText().toString();
            String name = ProName.getText().toString();
            String price = ProPrice.getText().toString();
            String date = ProDateImport.getText().toString();
            if(listener!=null)
                listener.onGetData(ID,name,price,date);
        });

        return builder.create();

    }

    public interface OnSendDataListener{
        void onGetData(String ID,String Name,String Price,String Date);
    }
}
