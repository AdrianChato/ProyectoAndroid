package android.ejemplo.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MotorcycleDetailActivity extends AppCompatActivity {

    TextView txtTitle;
    Button btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorcycle_detail);

        txtTitle = findViewById(R.id.txtTitle);
        btnHistory = findViewById(R.id.btnHistory);

        String name = getIntent().getStringExtra("name");
        txtTitle.setText(name);

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MotorcycleDetailActivity.this, MotorcycleHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}