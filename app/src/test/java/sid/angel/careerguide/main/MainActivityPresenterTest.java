package sid.angel.careerguide.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/*
local test for MainActivityPresenter
 */
public class MainActivityPresenterTest {

    @Mock
    private MainActivityContract.MvpView mView;
    private MainActivityPresenter mPresenter;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainActivityPresenter(mView);

    }

    @Test
    public void handleSignUpClick() {
        mPresenter.handleSignUpClick();
         verify(mView).showSignUpActivity();
    }
}