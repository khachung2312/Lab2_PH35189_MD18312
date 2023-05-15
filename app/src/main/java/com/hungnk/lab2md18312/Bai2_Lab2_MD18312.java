package com.hungnk.lab2md18312;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai2_Lab2_MD18312 extends AppCompatActivity {

    Button btnLuu;
    EditText edtTen;
    EditText edtMssv;
    EditText edtTuoi;
    RadioButton edoNam;
    RadioButton edoNu;
    CheckBox chkDaBong;
    CheckBox chkChoiGame;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_lab2_md18312);
        edtTen = findViewById(R.id.edtTen);
        edtMssv = findViewById(R.id.edtMssv);
        edtTuoi = findViewById(R.id.edtTuoi);
        edoNam = findViewById(R.id.rdoNam);
        edoNu = findViewById(R.id.rdoNu);
        chkDaBong = findViewById(R.id.chxDaBong);
        chkChoiGame = findViewById(R.id.chkChoiGame);
        btnLuu = findViewById(R.id.btnLuu);
        txtResult = findViewById(R.id.txtResult);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String tuoi = edtTuoi.getText().toString();
                String mssv = edtMssv.getText().toString();

                txtResult.setText("Tôi tên: " + ten + "\n"
                        + "Tuổi: " + tuoi + "\n"
                        + "MSSV: " + mssv + "\n");
            }
        });
    }


}
