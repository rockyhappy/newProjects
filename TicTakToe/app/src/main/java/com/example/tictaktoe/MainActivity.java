package com.example.tictaktoe;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tictaktoe.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    init();


    }
    public void init()
    {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);

    }
    public void check (View v)
    {

        Button btnCurrent =(Button) v;
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });
        if(btnCurrent.getText().toString().equals("")){
        if(flag%2==0) btnCurrent.setText("X");
        else          btnCurrent.setText("O");
        if(flag>=4)
        {
            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();
            if (isCheck(b1, b2, b3) )
            {
                newGame();
            }

            else if(isCheck(b4, b5, b6))
            {newGame();
            }
            else if(isCheck(b7, b8, b9))
            {newGame();
            }
            else if( isCheck(b1,b4,b7))
            {newGame();
            }
            else if(isCheck(b2,b5,b8) )
            {
                newGame();
            }
            else if(isCheck(b3,b6,b9))
            {
                newGame();
            }
            else if(isCheck(b7,b5,b3))
            {newGame();
            }
            else if(isCheck(b1,b5,b9))
            {
                newGame();
            }
            else if(flag==8)
            {
                Toast.makeText(this, "This is a tie " , Toast.LENGTH_SHORT).show();
                newGame();
            }



        }
        flag++;
        }
    }
    public boolean isCheck(String s1,String s2,String s3)
    {
        if(s1.equals(s2)&&s2.equals(s3)&&!s1.equals("")) {
            Toast.makeText(this, "WINNER IS " + s1, Toast.LENGTH_SHORT).show();
            return true;
        }
        else return false;
    }
    public void newGame()
    {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;

    }
}