package com.example.sksksk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
    private ZwierzetaDataBase zwierzetaDataBase;

    private EditText editTextGatunek, editTextWiek;
    private Spinner spinnerySrodowisko;
    private CheckBox checkBoxRoslina;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        zwierzetaDataBase = Room.databaseBuilder(
                        getApplicationContext(),
                        ZwierzetaDataBase.class,
                        "zwierzeta_db"
                )
                .allowMainThreadQueries()
                .build();
        zwierzetaDataBase.zwrocZwierzeDao().wstawDoBazy(
                new Zwierze("sarna europejska",
                        "lądowe",
                        14,
                        true)
        );

        button = findViewById(R.id.button);
        editTextGatunek = findViewById(R.id.editTextText);
        editTextWiek = findViewById(R.id.editTextNumber);
        spinnerySrodowisko = findViewById(R.id.spinner);
        checkBoxRoslina = findViewById(R.id.checkBox);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Zwierze zwierze = new Zwierze(
                                editTextGatunek.getText().toString(),
                                spinnerySrodowisko.getSelectedItem().toString(),
                                Integer.parseInt(editTextWiek.getText().toString()),
                                checkBoxRoslina.isChecked()
                        );
                    }
                }
        );


    }
}