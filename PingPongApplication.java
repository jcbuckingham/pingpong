package janel.pingpong;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class PingPongApplication extends Application{

        @Override
        public void onCreate() {

            super.onCreate();

            Parse.enableLocalDatastore(this);
            Parse.initialize(this, "LOLJvZxB101G1nqX91DU6KVbngBUFsngcimgNsrk", "RFEDW5yped2c1zaT288JJBLbSUzmOCbe6KccdU0B");

        }
}
