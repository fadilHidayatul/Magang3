package com.example.calculatorwithcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2, num3;
    Button btnTambah, btnKurang, btnKali, btnBagi, btnClear;
    CheckBox chk1,chk2,chk3;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnClear = findViewById(R.id.btnClear);
        hasil = findViewById(R.id.hasil);
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(MainActivity.this,"Tidak Boleh 1 Ceklis",Toast.LENGTH_LONG).show();
                    hasil.setText("0");
                } else if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()) {
                    tambah();
                } else {
                    Toast.makeText(MainActivity.this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(MainActivity.this,"Tidak Boleh 1 Ceklis",Toast.LENGTH_LONG).show();
                    hasil.setText("0");
                }else if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()) {
                    kurang();
                } else {
                    Toast.makeText(MainActivity.this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(MainActivity.this,"Tidak Boleh 1 Ceklis",Toast.LENGTH_LONG).show();
                    hasil.setText("0");
                }else if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()) {
                    kali();
                } else {
                    Toast.makeText(MainActivity.this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked()
                        || !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(MainActivity.this,"Tidak Boleh 1 Ceklis",Toast.LENGTH_LONG).show();
                    hasil.setText("0");
                }
                if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()) {
                    bagi();
                }else {
                    Toast.makeText(MainActivity.this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("0");
            }
        });
    }

    private void bagi() {
        double a1,a2,a3,res;
        if(chk1.isChecked()){
            a1 = Double.parseDouble(num1.getText().toString());
        }else{
            a1 = 1;
        }

        if(chk2.isChecked()){
            a2 = Double.parseDouble(num2.getText().toString());
        }else{
            a2 = 1;
        }

        if(chk3.isChecked()){
            a3 = Double.parseDouble(num3.getText().toString());
        }else{
            a3 = 1;
        }
        res = a1 / a2 / a3;
        hasil.setText(res + " ");
    }

    private void kali() {
        int a1,a2,a3,res;
        if(chk1.isChecked()){
            a1 = Integer.parseInt(num1.getText().toString());
        }else{
            a1 = 1;
        }

        if(chk2.isChecked()){
            a2 = Integer.parseInt(num2.getText().toString());
        }else{
            a2 = 1;
        }

        if(chk3.isChecked()){
            a3 = Integer.parseInt(num3.getText().toString());
        }else{
            a3 = 1;
        }
        res = a1 * a2 * a3;
        hasil.setText(res + " ");
    }

    private void kurang() {
        int a1,a2,a3,res;
        if (chk1.isChecked()){
            a1 = Integer.parseInt(num1.getText().toString());
        }else{
            a1 = 0;
        }

        if (chk2.isChecked()){
            a2 = Integer.parseInt(num2.getText().toString());
        }else{
            a2 = 0;
        }

        if (chk3.isChecked()){
            a3 = Integer.parseInt(num3.getText().toString());
        }else{
            a3 = 0;
        }
        res = a1 - a2 - a3;
        hasil.setText(res + " ");
    }

    private void tambah() {
        int a1,a2,a3,res;
        if (chk1.isChecked()){
            a1 = Integer.parseInt(num1.getText().toString());
        }else {
            a1 = 0;
        }

        if (chk2.isChecked()){
            a2 = Integer.parseInt(num2.getText().toString());
        }else {
            a2 = 0;
        }

        if (chk3.isChecked()){
            a3 = Integer.parseInt(num3.getText().toString());
        }else {
            a3 = 0;
        }
        res = a1 + a2 + a3;
        hasil.setText(res + " ");
    }
}
