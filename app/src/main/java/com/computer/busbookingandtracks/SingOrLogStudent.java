package com.computer.busbookingandtracks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingOrLogStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_or_log_student);

        Button sings=findViewById(R.id.buttonSignStudentOne);
        Button logs=findViewById(R.id.buttonLogStudentOne);

        sings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(SingOrLogStudent.this,SingStudent.class );
                startActivity(intent3);
            }
        });

        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(SingOrLogStudent.this,LogStudent.class );
                startActivity(intent4);
            }
        });

    }
}
