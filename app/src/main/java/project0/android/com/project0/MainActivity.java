package project0.android.com.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


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

    public void navigateToPopularMovies(View view){
        Toast.makeText(this,"This button will launch my popular movie app.",Toast.LENGTH_LONG).show();
    }

    public void navigateToStockHawk(View view){
        Toast.makeText(this,"This button will launch my stock hawk app.",Toast.LENGTH_LONG).show();
    }

    public void navigateToBuildItBigger(View view){
        Toast.makeText(this,"This button will launch my build it bigger app.",Toast.LENGTH_LONG).show();
    }

    public void navigateToMakeYourAppMaterial(View view){
        Toast.makeText(this,"This button will launch my make your app material app.",Toast.LENGTH_LONG).show();
    }

    public void navigateToGoUbiquitous(View view){
        Toast.makeText(this,"This button will launch my go ubiquitous app.",Toast.LENGTH_LONG).show();
    }

    public void navigateToCapstone(View view){
        Toast.makeText(this,"This button will launch my capstone app.",Toast.LENGTH_LONG).show();
    }
}
