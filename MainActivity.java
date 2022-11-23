package my.app.caller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity  {

    ToggleButton onoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onoff=findViewById(R.id.toggle_Btn);

        onoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked=((ToggleButton)view).isChecked();
                if(checked){
                    Intent intent=new Intent(getApplicationContext(),RecordingService.class);
                    startService(intent);
                    Toast.makeText(getApplicationContext(),"Call recording Started",Toast.LENGTH_SHORT).show();


                }else{
                    Intent intent=new Intent(getApplicationContext(),RecordingService.class);
                    stopService(intent);
                    Toast.makeText(getApplicationContext(),"Call recording Stopted",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }




}