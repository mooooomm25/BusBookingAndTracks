package com.computer.busbookingandtracks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentOrDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_or_driver);

        Button student=findViewById(R.id.buttonStudent);
        Button driver=findViewById(R.id.buttonDriver);

        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(StudentOrDriver.this,SingOrLogDriver.class );
                startActivity(intent1);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(StudentOrDriver.this,SingOrLogStudent.class );
                startActivity(intent2);
            }
        });

    }
}
