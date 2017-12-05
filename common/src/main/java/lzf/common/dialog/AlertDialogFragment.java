package lzf.common.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import lzf.common.R;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
public class AlertDialogFragment extends Fragment {
    private AlertDialog alertDialog;

    @Override
    public LayoutInflater getLayoutInflater(Bundle savedInstanceState) {
        alertDialog = new AlertDialog.Builder(getActivity())
                .setView(LayoutInflater.from(getContext()).inflate(R.layout.layout,null,false))
                .setPositiveButton("true", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "好吧", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("false", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                })
                .create();
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return (LayoutInflater) alertDialog.getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return LayoutInflater.from(getContext()).inflate(R.layout.layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        alertDialog.show();
        final WindowManager mWindowManager = (WindowManager) getActivity().getSystemService(Context.WINDOW_SERVICE);
        final View dialogView=LayoutInflater.from(getContext()).inflate(R.layout.dialog,null,false);
        TextView textView= (TextView) dialogView.findViewById(R.id.title);
        TextView close= (TextView) dialogView.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView.setVisibility(View.GONE);
                mWindowManager.removeView(dialogView);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"我是标题",Toast.LENGTH_SHORT).show();
            }
        });
        WindowManager.LayoutParams layoutParams=new WindowManager.LayoutParams();
        layoutParams.gravity= Gravity.NO_GRAVITY;
        layoutParams.width=300;
        layoutParams.height=200;
        layoutParams.x=-20;
        layoutParams.y=-30;
        mWindowManager.addView(dialogView,layoutParams);
    }

    private void dismiss() {
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
        FragmentTransaction mFragTransaction = getFragmentManager().beginTransaction();
        mFragTransaction.remove(this).commit();
    }
}
