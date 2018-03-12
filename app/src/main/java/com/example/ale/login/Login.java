package com.example.ale.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=  ((EditText)findViewById(R.id.usuariologin)).getText().toString();
                String password=  ((EditText)findViewById(R.id.passwordlogin)).getText().toString();
                if (usuario.equals("admin")&&password.equals("admin")){
                    Intent nuevoform= new Intent(Login.this,Login2.class);
                    startActivity(nuevoform);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Usuario o password incorrecto",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
