package com.example.socce.mathcoparent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements LoaderCallbacks<Cursor>{



    private AutoCompleteTextView mEmailView;
        private EditText mPasswordView;
        private View mProgressView;
        private View mLoginFormView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        populateAutoComplete();
    /* Used to load the 'native-lib' library on application startup. */
    static {
        System.loadLibrary("native-lib");
    }
}
