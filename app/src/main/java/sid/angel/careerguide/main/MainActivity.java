package sid.angel.careerguide.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sid.angel.careerguide.R;
import sid.angel.careerguide.databinding.ActivityMainBinding;
import sid.angel.careerguide.signup.SignUpActivity;


/**
 *
 * displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainActivityContract.MvpView {

    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setPresenter(presenter);

    }

    @Override
    public void showSignUpActivity() {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}
