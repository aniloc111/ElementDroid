package com.example.android_project;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.RadioGroup;

public class AudioSetting extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_audio_setting);
		
		addListenerOnButton();
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.audio_setting, menu);
		return true;
	}
	
	public void audioOff(){
		AudioManager audioControl = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		audioControl.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);
	}
	
	public void audioOn(){
		AudioManager audioControl = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		audioControl.setStreamMute(AudioManager.STREAM_MUSIC, true);
	}
	
	
	private void addListenerOnButton() {
		RadioGroup audioRadio = (RadioGroup)findViewById(R.id.audioRadio);
		
		
	}

}
