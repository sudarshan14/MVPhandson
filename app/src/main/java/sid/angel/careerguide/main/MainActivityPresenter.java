package sid.angel.careerguide.main;


/**
 * responsible for handling for the action from the view and updating the ui as required
 */
public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.MvpView view;

    public MainActivityPresenter(MainActivityContract.MvpView view) {

        this.view = view;
    }

    @Override
    public void handleSignUpClick() {
        view.showSignUpActivity();
    }
}
