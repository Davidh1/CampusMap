package com.Blue.Map;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

public class GPS implements LocationListener {	
	

	TextView Lat, Lon;
    /** Called when the activity is first created. */
	
	
	
 //   @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//        
//   LocationListener locationListener = new LocationListener(){
//    //LocationManager locationManager = (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);       
//        	public void onLocationChanged(Location location){
//        		//displayGPS(location);
//        		if(location !=null){
//        			Log.d("GPSListener", location.toString());
//        		}else{
//        			Log.d("GPSListener", "No location");
//        		}
//        	}
//
//			@Override
//			public void onProviderDisabled(String provider) {Log.d("GPS onProviderDisabled", provider);}
//			
//			@Override
//			public void onProviderEnabled(String provider) {Log.d("GPS onProviderEnabled",provider);}
//
//			@Override
//			public void onStatusChanged(String provider, int status, Bundle extras) {Log.d("GPS onStatusChanged",provider);}
//    
//   };
	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}
	
	}
			
//	    	
        //{

        //locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
  //  }
    
//    public void displayGPS(Location location){
//    	Lat = (TextView)findViewById(R.id.imageView);
//    	Lon = (TextView)findViewById(R.id.imageView);
//    	
//    	float latValue = (float) location.getLatitude();
//    	float lonValue = (float) location.getLongitude();
//    	
//    	Lat.setText("LAT: " + Float.toString(latValue));
//    	Lon.setText("LON: " + Float.toString(lonValue));
//    	
//    }
    
