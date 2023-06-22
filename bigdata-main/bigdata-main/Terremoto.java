/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

public class Terremoto {
    
    private String id;
    private String state;
    private String utc_time;
    private String local_time;
    private String reference;
    private String magnitude;
    private String scale;
    private String latitude;
    private String longitude;
    private String depth;
    private String source;

    
    //metadata
    private String submitted;
    private String database;
    
    //seleccion
    private String select;


    public Terremoto() {
    }
    
    public String setState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUtcTime() {
        return utc_time;
    }

    public void setUtcTime(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getLocalTime() {
        return local_time;
    }

    public void setLocalTime(String local_time) {
        this.local_time = local_time;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }



    @Override
    public String toString() {
        return "Terremoto{" + "id=" + id + ", utc_time=" + utc_time + ", local_time=" + local_time + ", reference=" + reference + ", magnitude=" + magnitude + ", scale=" + scale + ", latitude=" + latitude + ", longitude=" + longitude + ", depth=" + depth + ", source=" + source +'}';
    }
    
    public String toCSV()
    {
        return "" + id + "," + utc_time + "," + local_time + "," + reference + "," + magnitude + "," + scale + "," + latitude + "," + longitude + "," +
        depth + "," + source +  "";
    }

}
