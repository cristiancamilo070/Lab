package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import android.os.Bundle;

public class CreateMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        getSupportActionBar().setTitle("Enviar mensaje");

    }


    public void boton(View view) {
        EditText mensaje = (EditText) findViewById(R.id.message);
        //textos
        String mensajeEnvio = mensaje.getText().toString();
        //Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
        //intent.putExtra("keyName", mensajeEnvio);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,mensajeEnvio);

        String chooserTitle="send via: ";
        Intent chosenIntent= Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);
    }

}