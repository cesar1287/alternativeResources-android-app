package comcesar1287.github.www.alternativeresources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView periodDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        periodDay = (TextView) findViewById(R.id.tv1);

        setPeriodDay();
    }

    private void setPeriodDay() {

        Calendar rightNow = Calendar.getInstance();
        int currentHour = rightNow.get(Calendar.HOUR_OF_DAY);

        if(currentHour>=0 && currentHour<12){
            periodDay.setText(getResources().getString(R.string.morning));
        }else if(currentHour>=12 && currentHour<18){
            periodDay.setText(getResources().getString(R.string.afternoon));
        }else if(currentHour>=18){
            periodDay.setText(getResources().getString(R.string.night));
        }
    }
}
