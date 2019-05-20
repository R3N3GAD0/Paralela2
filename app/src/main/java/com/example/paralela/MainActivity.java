package com.example.paralela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


}
    public void feliz(View view){
        Toast toast = Toast.makeText(this,"Feliz Aniversário e Muitos Anos de Vida!",Toast.LENGTH_SHORT);
        toast.show();
    }
}