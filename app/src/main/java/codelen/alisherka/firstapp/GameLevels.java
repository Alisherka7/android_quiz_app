package codelen.alisherka.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button btnBack = (Button) findViewById(R.id.button_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent); finish();
                } catch (Exception e){
                    System.out.println("error");
                }
            }
        });

        //Button next 1st level

        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent); finish();

                }catch (Exception e){
                    System.out.println("Error");
                }
            }
        });

        //Button next 2nd level

        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent); finish();

                }catch (Exception e){
                    System.out.println("Error");
                }
            }
        });

        
        //Button next 3rd level
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent); finish();

                }catch (Exception e){
                    System.out.println("Error");
                }
            }
        });

        //Button next 4 level
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level4.class);
                    startActivity(intent); finish();

                }catch (Exception e){
                    System.out.println("Error");
                }
            }
        });

    }
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent); finish();
        } catch (Exception e){
            System.out.println("error");
        }
    }

}