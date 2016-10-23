package jasongagnon.discount;

import android.os.Bundle;
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

    private EditText noToBuy;
    private EditText itemCost;
    private EditText mini;
    private EditText percent;
    private EditText noDisc;
    private TextView bulkSave;
    private TextView buyNSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        noToBuy = (EditText)findViewById(R.id.txtNoToBuy);
        itemCost = (EditText)findViewById(R.id.txtItemCost);
        mini = (EditText)findViewById(R.id.txtMin);
        percent = (EditText)findViewById(R.id.txtPer);
        noDisc = (EditText)findViewById(R.id.txtNoForDisc);

        bulkSave = (TextView)findViewById(R.id.tvBulk);
        buyNSave = (TextView)findViewById(R.id.tvBuyN);

        Button calcDisc = (Button)findViewById(R.id.btnCalc);
        calcDisc.setOnClickListener(calcClick);
    }

    private View.OnClickListener calcClick = new View.OnClickListener() {
        public void onClick(View v) {
            float bDis, bN;
            int min, count, noDi;
            float perc, cost;

            min = Float.valueOf(mini.getText().toString()).intValue();
            count = Float.valueOf(noToBuy.getText().toString()).intValue();
            noDi = Float.valueOf(noDisc.getText().toString()).intValue();
            perc = Float.valueOf(percent.getText().toString()).floatValue();
            cost = Float.valueOf(itemCost.getText().toString()).floatValue();

            BulkDiscount bulk = new BulkDiscount(min, perc);
            bDis = bulk.computeDiscount(count, cost);
            bulkSave.setText(Float.valueOf(bDis).toString());

            BuyNItemsGetOneFree buyN = new BuyNItemsGetOneFree(noDi);
            bN = buyN.computeDiscount(count, cost);
            buyNSave.setText(Float.valueOf(bN).toString());
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
