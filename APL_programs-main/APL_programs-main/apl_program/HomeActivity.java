package com.example.apl_program;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        for (int i = 1; i <= 27; i++) {
            int id = getResources().getIdentifier("btn" + i, "id", getPackageName());
            Button button = findViewById(id);
            int finalI = i;

            button.setOnClickListener(v -> {
                if (finalI == 1) {
                    // For Button 1, launch Program 1 activity
                    Intent intent = new Intent(HomeActivity.this, Program1MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 2) {
                    Intent intent = new Intent(HomeActivity.this, Program2MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 3) {
                    Intent intent = new Intent(HomeActivity.this, Program3MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 4) {
                    Intent intent = new Intent(HomeActivity.this, Program4MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 5) {
                    Intent intent = new Intent(HomeActivity.this, Program5MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 6) {
                    Intent intent = new Intent(HomeActivity.this, Program6MainActivity.class);
                    startActivity(intent);
                }else if (finalI == 7) {
                    Intent intent = new Intent(HomeActivity.this, Program7MainActivity.class);
                    startActivity(intent);
                }else if (finalI == 8) {
                    Intent intent = new Intent(HomeActivity.this, Program8MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 9) {
                    Intent intent = new Intent(HomeActivity.this, Program9MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 10) {
                    Intent intent = new Intent(HomeActivity.this, Program10MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 11) {
                    Intent intent = new Intent(HomeActivity.this, Program11MainActivity.class);
                    startActivity(intent);
                }else if (finalI == 12) {
                    Intent intent = new Intent(HomeActivity.this, Program12MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 13) {
                    Intent intent = new Intent(HomeActivity.this, Program13MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 14) {
                    Intent intent = new Intent(HomeActivity.this, Program14MainActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 15) {
                    startActivity(new Intent(HomeActivity.this, Program15MainActivity.class));
                } else if (finalI == 16) {
                    startActivity(new Intent(HomeActivity.this, Program16MainActivity.class));
                }
                else if (finalI == 17) {
                    startActivity(new Intent(HomeActivity.this, Program17MainActivity.class));
                }
                else if (finalI == 18) {
                    startActivity(new Intent(HomeActivity.this, Program18MainActivity.class));
                }
               else if(finalI == 19) {
                    startActivity(new Intent(HomeActivity.this, Program19MainActivity.class));
                } else if(finalI == 20) {
                    startActivity(new Intent(HomeActivity.this, Program20MainActivity.class));
                } else if(finalI == 21) {
                    startActivity(new Intent(HomeActivity.this, Program21MainActivity.class));
                }
                else if (finalI == 22) {
                    startActivity(new Intent(HomeActivity.this, Program22MainActivity.class));
                } else if (finalI == 23) {
                    startActivity(new Intent(HomeActivity.this, Program23MainActivity.class));
                }
                else if (finalI == 24) {
                    startActivity(new Intent(HomeActivity.this, Program24MainActivity.class));
                } else if (finalI == 25) {
                    startActivity(new Intent(HomeActivity.this, Program25MainActivity.class));
                }
                else if (finalI == 26) {
                    startActivity(new Intent(HomeActivity.this, Program26MainActivity.class));
                } else if (finalI == 27) {
                    startActivity(new Intent(HomeActivity.this, Program27MainActivity.class));
                }


                else {
                    // Default behavior for other buttons
                    Intent intent = new Intent(HomeActivity.this, ProgramActivity.class);
                    intent.putExtra("program_number", finalI);
                    startActivity(intent);
                }
            });
        }
    }
}
