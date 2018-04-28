package sid.angel.careerguide.main;


import android.view.View;

/**
 *
 * displays the contract between the view (@link MainActivity ) and the presenter (@link MainActivityPresenter)

 **/
public interface MainActivityContract  {


    public interface MvpView{

        void showSignUpActivity();

    }

    public interface Presenter{

        void handleSignUpClick(View view);

    }

}
