package com.example.atividade5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // extrair os itens definidos no XML
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // método chamado ao clicar no action button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.act_adicionar){
            Toast.makeText(this, getString(R.string.add_contato), Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_editar){
            Toast.makeText(this, getString(R.string.edit_contact), Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_remover){
            Toast.makeText(this, getString(R.string.delete_contact), Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.act_help){
            Toast.makeText(this, getString(R.string.help_contact), Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
} // fim class MainActivity