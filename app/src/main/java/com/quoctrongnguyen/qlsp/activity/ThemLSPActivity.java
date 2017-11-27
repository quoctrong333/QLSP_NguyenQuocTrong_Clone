package com.quoctrongnguyen.qlsp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.quoctrongnguyen.qlsp.R;
import com.quoctrongnguyen.qlsp.model.LoaiSP;

public class ThemLSPActivity extends AppCompatActivity
{
        EditText edtMaLoai , edtTenLoai;
        Button btThem;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_them_loaisp);
                addEvents();
                addControls();
        }

        private void addControls() {
                edtMaLoai = findViewById(R.id.txtMaLoai);
                edtTenLoai = findViewById(R.id.txtTenLoai);
                btThem = findViewById(R.id.btnThemLoaiSP);
        }

        private void addEvents() {
                //them
                btThem.setOnClickListener(new View.OnClickListener()
                {
                        @Override
                        public void onClick(View view)
                        {
                                LoaiSP a= new LoaiSP();
                                a.setMaLoai(edtMaLoai.getText().toString());
                                a.setTenLoai(edtTenLoai.getText().toString());
                                a.setSanPhamArrayList(null);
                                Intent intent = new Intent();
                                intent.putExtra("lsp",a);//seriz
                                setResult(123,intent);
                                finish();
                        }
                });
        }


}
