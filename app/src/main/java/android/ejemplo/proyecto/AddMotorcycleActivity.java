package android.ejemplo.proyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddMotorcycleActivity extends AppCompatActivity {

    EditText brand, model, plate, km;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_motorcycle);

        brand = findViewById(R.id.brand);
        model = findViewById(R.id.model);
        plate = findViewById(R.id.plate);
        km = findViewById(R.id.km);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // vuelve atrás
            }
        });
    }
}