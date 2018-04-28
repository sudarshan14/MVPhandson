package sid.angel.careerguide.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sid.angel.careerguide.R;


/**
 *
 * displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainActivityContract.MvpView {

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);
    }
}
