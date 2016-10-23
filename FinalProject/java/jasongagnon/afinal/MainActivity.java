package jasongagnon.afinal;

import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.Touch;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText MPG;
    private EditText Miles;
    private EditText GasPrice;
    private EditText Days;
    private EditText HotelNight;
    private EditText Dest;
    private TextView totalGas;
    private TextView totalHotel;
    private TextView totalTrip;
    private TextView totalDay;
    private TextView allTrips;

    Trips trip = new Trips();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MPG = (EditText)findViewById(R.id.txtMPG);
        Miles = (EditText)findViewById(R.id.txtMiles);
        GasPrice = (EditText)findViewById(R.id.txtGasPrice);
        Days = (EditText)findViewById(R.id.txtDays);
        HotelNight = (EditText)findViewById(R.id.txtHotelNight);
        Dest = (EditText)findViewById(R.id.txtDest);
        totalGas = (TextView)findViewById(R.id.txtTotalGas);
        totalHotel = (TextView)findViewById(R.id.txtTotalHotel);
        totalTrip = (TextView)findViewById(R.id.txtTotalTrip);
        totalDay = (TextView)findViewById(R.id.txtTotalPerDay);
        allTrips = (TextView)findViewById(R.id.txtTrips);

        Button getRating = (Button)findViewById(R.id.btnCalc);
        getRating.setOnClickListener(calcClickListener);


    }

    private View.OnClickListener calcClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            String noDays = Days.getText().toString();
            String gasPrice = GasPrice.getText().toString();
            String hotelPrice = HotelNight.getText().toString();
            String mpg = MPG.getText().toString();
            String milesTotal = Miles.getText().toString();
            String destination = Dest.getText().toString();

            trip.setDaysInTrip(Integer.valueOf(noDays).intValue());
            trip.setGasPrice(Double.valueOf(gasPrice).doubleValue());
            trip.setHotelPricePerNight(Double.valueOf(hotelPrice).doubleValue());
            trip.setMPG(Integer.valueOf(mpg).intValue());
            trip.setTotalMiles(Double.valueOf(milesTotal).doubleValue());
            trip.setTripDestination(destination);
            trip.calcAll();
            trip.addTripToList();

            totalGas.setText(Double.valueOf(trip.getTotalCostOfGas()).toString());
            totalHotel.setText(Double.valueOf(trip.getTotalCostOfHotel()).toString());
            totalTrip.setText(Double.valueOf(trip.getTotalCostOfTrip()).toString());
            totalDay.setText(Double.valueOf(trip.getTotalCostPerDay()).toString());

            String myTrips = trip.generateTripList();
            System.out.println(myTrips);
            allTrips.setText(String.valueOf(myTrips));
        }
    };
}
