package com.Blue.Map;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

public class GPSListner implements LocationListener{

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		if(location !=null){
			Log.d("GPSListener", location.toString());
		}else{
			Log.d("GPSListener", "No location");
		}
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		Log.d("GPSListener onProviderDisabled", provider);
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		Log.d("GPSListener onProviderEnabled", provider);
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		Log.d("GPSListener onStatusChanged", provider);
	}

}
