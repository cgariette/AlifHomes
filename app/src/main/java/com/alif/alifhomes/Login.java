package com.alif.alifhomes;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Login extends Fragment {


    EditText ed1,ed2;
    Button b1;


    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.login, null);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ed1 = view.findViewById(R.id.username);
        ed2 = view.findViewById(R.id.password);
        b1 = view.findViewById(R.id.login);

        b1.setOnClickListener(v -> {

        });
    }
        public Login()
        {
           String username= ed1.getText().toString();
            String password= ed2.getText().toString();

            if(username.equals("") || password.equals(""))
            {
                Toast.makeText(getActivity(), "Username or Password Blank", Toast.LENGTH_LONG).show();
            }
            else if(username.equals("admin") && password.equals("1234"))
            {
                Toast.makeText(getActivity(), "Success", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getActivity(), "Username or Password error!", Toast.LENGTH_LONG).show();
            }


        }

}
