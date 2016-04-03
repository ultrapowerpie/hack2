package com.example.jackey.hack2;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by Jackey on 4/2/16.
 */
public class ClusterMarkerLocation implements ClusterItem {

    private LatLng position;

    public ClusterMarkerLocation( LatLng latLng ) {
        position = latLng;
    }

    @Override
    public LatLng getPosition() {
        return position;
    }

    public void setPosition( LatLng position ) {
        this.position = position;
    }
}