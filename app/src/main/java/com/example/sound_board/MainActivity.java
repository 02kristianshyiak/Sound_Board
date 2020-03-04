package com.example.sound_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button dub;
    private Button extre;
    private Button high;
    private Button end;
    private  Button rock;
    private Button moose;
    private Button evo;
    private Button hou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dub = (Button) findViewById(R.id.dub);
        dub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();
            }
        });

        extre = (Button) findViewById(R.id.extre);
        extre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();
            }
        });

        high = (Button) findViewById(R.id.high);
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();
            }
        });

        end = (Button) findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain5Activity();
            }
        });

        rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain6Activity();
            }
        });

        moose = (Button) findViewById(R.id.moose);
        moose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain7Activity();
            }
        });

        evo = (Button) findViewById(R.id.evo);
        evo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain8Activity();
            }
        });

        hou = (Button) findViewById(R.id.hou);
        hou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain9Activity();
            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void openMain3Activity() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void openMain4Activity() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void openMain5Activity() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void openMain6Activity() {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }

    public void openMain7Activity() {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    public void openMain8Activity() {
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }

    public void openMain9Activity() {
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }
}
