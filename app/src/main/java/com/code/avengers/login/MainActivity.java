package com.code.avengers.login;

/*
* Imports are defined here. But you don't have to worry about imports.
* */

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

/*
 * AppCompat means Application Compatibility.
 * Your App should look same on every Android Device irrespective of it's Android Version
 * */
public class MainActivity extends AppCompatActivity
{
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "qwerty";

    /*
    * Global Objects of XML Widgets
    * */
    private LinearLayout linearLayout;
    private EditText etxUsername, etxPassword;
    private Button btnLogin;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        /*
         * It will call the constructor of
         * */
        super.onCreate(savedInstanceState);

        /*
         * Connect XML to Java
         * */
        setContentView(R.layout.activity_main);

        /*
        * After setContentView(...) Initialize your UI Components
        * */
        linearLayout = findViewById(R.id.linear_layout_activity_main);
        etxUsername = findViewById(R.id.etx_username_activity_main);
        etxPassword = findViewById(R.id.etx_password_activity_main);
        btnLogin = findViewById(R.id.btn_login_activity_main);

        /*
        * Next: How to add Click Listener to a Button?
        * */
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            /*
            * onClick(...) will be called when User clicks on btnLogin
            * */
            @Override
            public void onClick(View view)
            {
                /*
                * Get the Username from EditText etxUsername
                * */
                String username = etxUsername.getText().toString();
                String password = etxPassword.getText().toString();

                if (username.equals(USERNAME) && password.equals(PASSWORD))
                {
                    System.out.println("Login Successful");
                }
                else
                {
                    System.out.println("Login Failed. Invalid Credentials.");
                }
            }
        });
    }
}


/*
 * In C main method is:
 * void main() { ... }
 * */

/*
 * In Java main method is:
 * public static void main(String[] args) {...}
 * */

/*
 * Anything that starts with (in Java) @ is calledAnnotation
 * For time being you can ignore it.
 * */

/*
* Primitive Data-types (Def Value = 0) (==)
* int, float, char, short, long, double, byte, boolean
* */

/*
* Non-Primitive Data-types (Def Value = null) (equals(...))
* Integer, Float, CharSequence, Short, Long, Double, Byte, Boolean
* */