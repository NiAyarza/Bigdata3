/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


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
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terremoto terremoto = (Terremoto) o;
        return Objects.equals(id, terremoto.id) && Objects.equals(nombre, terremoto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
    
    //metadata
    private String submitted;
    private String database;
    
    //seleccion
    private String select;


    public Terremoto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUtc_time() {
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getLocal_time() {
        return local_time;
    }

    public void setLocal_time(String local_time) {
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

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }
    
    public String getDataBase() {
        return database;
    }

    public void setDataBase(String database) {
        this.database = database;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
    


    @Override
    public String toString() {
        return "Terremoto{" + "id=" + id + ", utc_time=" + utc_time + ", local_time=" + local_time + ", reference=" + reference + ", magnitude=" + magnitude + ", scale=" + scale + ", latitude=" + latitude + ", longitude=" + longitude + ", depth=" + depth + ", source=" + source + ", submitted= " + submitted + ", database= " + database + ", select= " + select +'}';
    }

}
