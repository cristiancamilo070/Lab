package co.edu.unipiloto.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        getSupportActionBar().setTitle("Mensaje");

        String mensajeXD = "";
        Intent intent = getIntent(); //si
        Bundle bundle = intent.getExtras();
        if(bundle  != null)
        {
            mensajeXD = bundle.getString("keyName");
        }
        TextView messageView = (TextView) findViewById(R.id.message);

        messageView.setText(mensajeXD);
    }
}
