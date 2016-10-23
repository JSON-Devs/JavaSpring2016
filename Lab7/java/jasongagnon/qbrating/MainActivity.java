package jasongagnon.qbrating;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Attempts;
    private EditText Comp;
    private EditText Yards;
    private EditText Inter;
    private EditText Touch;
    private TextView qbRat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

        Attempts = (EditText)findViewById(R.id.tbAttempts);
        Comp = (EditText)findViewById(R.id.tbComp);
        Yards = (EditText)findViewById(R.id.tbYards);
        Inter = (EditText)findViewById(R.id.tbInt);
        Touch = (EditText)findViewById(R.id.tbTouch);
        qbRat = (TextView)findViewById(R.id.txtResult);
        Button getRating = (Button)findViewById(R.id.btnGetRating);
        getRating.setOnClickListener(ratingClickListener);

    }

    private View.OnClickListener ratingClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            String noAtt = Attempts.getText().toString();
            String noComp = Comp.getText().toString();
            String noYard = Yards.getText().toString();
            String noInt = Inter.getText().toString();
            String noTouch = Touch.getText().toString();

            float a, b, c, d, qbRating;

            a = ((((Float.valueOf(noComp).floatValue())/(Float.valueOf(noAtt).floatValue()))*100)-30)/20;
            b = (((Float.valueOf(noTouch).floatValue())/(Float.valueOf(noAtt).floatValue()))*100)/5;
            c = (9.5f -(((Float.valueOf(noInt).floatValue())/(Float.valueOf(noAtt).floatValue()))*100))/4;
            d = (((Float.valueOf(noYard).floatValue())/(Float.valueOf(noAtt).floatValue()))-3)/4;

            qbRating = (a+b+c+d)/.06f;
            qbRat.setText(Float.toString(qbRating));
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    //    int id = item.getItemId();

        //noinspection SimplifiableIfStatement
    //    if (id == R.id.action_settings) {
    //        return true;
    //   }

    //    return super.onOptionsItemSelected(item);
    //}
}
