package com.example.intentodeproyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recetario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetario);
    }
    //Gel antibacterial
    public void gela(View view)
    {
        Intent gel=new Intent(this, gel_anti.class);
        startActivity(gel);
    }

    //jabon glicerina
    public void jabglic(View view)
    {
        Intent glic=new Intent(this, jab_glic.class );
        startActivity(glic);
    }

    //jabon casero limon
    public void jab_cas_lim(View view)
    {
        Intent lim=new Intent(this, jab_lim.class);
        startActivity(lim);
    }

    //jabón de lavanda
    public void jablav(View view)
    {
        Intent lav=new Intent(this, jab_lav.class);
        startActivity(lav);
    }

    //jabon aloe vera
    public void aloe(View view)
    {
        Intent jaba=new Intent(this, jab_aloe.class);
        startActivity(jaba);
    }

    //jabón líquido (ropa)
    public void jab_rop(View view)
    {
        Intent rop=new Intent(this, jab_liq_rop.class);
        startActivity(rop);
    }

    //jabón líquido (manos)
    public void jab_man(View view)
    {
        Intent man=new Intent(this, jab_liq_man.class);
        startActivity(man);
    }
}