package com.example.tarea1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class ActivityResultado extends AppCompatActivity {
    private TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        respuesta=(TextView) findViewById(R.id.resultado);
        respuesta.setText(getIntent().getStringExtra("respuesta"));
    }
}