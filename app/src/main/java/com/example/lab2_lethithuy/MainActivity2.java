package com.example.lab2_lethithuy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   TextView tv_result=findViewById(R.id.tv_result);
    EditText edt_hoten = findViewById(R.id.edt_hoten);
    EditText edt_msv = findViewById(R.id.edt_msv);
    EditText edt_tuoi = findViewById(R.id.edt_tuoi);
    RadioButton rdo_Nam = findViewById(R.id.rdo_Nam);
    RadioButton rdo_Nu = findViewById(R.id.rdo_Nu);
    CheckBox chk_Football = findViewById(R.id.chk_Football);
    CheckBox chk_Game = findViewById(R.id.chk_Game);
    Button btn_luu = findViewById(R.id.btn_luu);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt_hoten.getText().toString();
        edt_msv.getText().toString();
        edt_tuoi.getText().toString();
        rdo_Nam.isChecked();
        rdo_Nu.isChecked();
        chk_Football.isChecked();
        chk_Game.isChecked();
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoten = edt_hoten.getText().toString();
                String msv = edt_msv.getText().toString();
                String tuoi = edt_tuoi.getText().toString();
                String gioitinh = rdo_Nam.isChecked()
                        ? rdo_Nam.getText().toString()
                        : rdo_Nu.isChecked()
                        ? rdo_Nu.getText().toString()
                        : "Chua chon gioi tinh";
                String sothich = chk_Football.isChecked() && chk_Game.isChecked()
                        ? "Da bong va choi game"
                        : chk_Football.isChecked()
                        ? chk_Football.getText().toString()
                        : chk_Game.isChecked()
                        ? chk_Game.getText().toString()
                        : "Không thích gì cả";
tv_result.setText("Tôi tên :"+hoten+"\n"
                    +"MSSV :"+msv+"\n"
                    +"Tuổi : "+tuoi+"\n"
                    +"Giới tính"+gioitinh+"\n"
                    +"Sở thích"+sothich);
            }
        });
    }
}