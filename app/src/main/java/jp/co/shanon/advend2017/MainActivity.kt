package jp.co.shanon.advend2017

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}




//
//public class TestMainActivity extends AppCompatActivity implements SampleFragment.OnFragmentInteractionListener {
//
//    // something
//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
//
//}
class TestMainActivity : AppCompatActivity() {

    // something
    fun onFragmentInteraction(uri: Uri) {

    }

}