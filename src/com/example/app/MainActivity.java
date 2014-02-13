package com.example.app;

import redis.clients.jedis.Jedis;

//import org.apache.commons.pool.impl.GenericObjectPool;
//import org.apache.commons.pool.impl.GenericObjectPool.Config;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Jedis jedis = new Jedis("localhost");
        //jedis.disconnect();
    }
    ////dasfdf
    //adfasdfasf

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
