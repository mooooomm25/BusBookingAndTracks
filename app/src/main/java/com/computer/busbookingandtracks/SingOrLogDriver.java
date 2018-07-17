package com.computer.busbookingandtracks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingOrLogDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_or_log_driver);

        Button sing=findViewById(R.id.buttonSignDriverOne);
        Button log=findViewById(R.id.buttonLogDriverOne);

        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(SingOrLogDriver.this,SingDriver.class );
                startActivity(intent5);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(SingOrLogDriver.this,LogStudent.class );
                startActivity(intent6);
            }
        });

    }
}
