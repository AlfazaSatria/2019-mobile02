package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleActivity extends AppCompatActivity {

    // Mendeklarasikan atribut dengan nama nameInput dengan tipe EditText
    private EditText nameInput;
    // Mendeklarasikan atribut dengan nama outputText dengan tipe TextView
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        String name = nameInput.getText().toString();
        outputText.setText("Hello " + name);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop () {
        super.onStop();
        Toast.makeText(this, "App On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Toast.makeText(this, "App On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App On Destroy", Toast.LENGTH_SHORT).show();
    }

}
