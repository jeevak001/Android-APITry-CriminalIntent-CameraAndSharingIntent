package com.jeevscode.jeeva.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by jeeva on 21/09/17.
 */

public class Crime {


    private UUID id;
    private String title;
    private Date date;
    private boolean isSolved;
    private String suspect;

    public Crime(){

        this(UUID.randomUUID());
    }

    public Crime(UUID id) {

        this.id = id;
        date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }


    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        suspect = suspect;
    }

    public String getPhotoFilename() {

        return "IMG_" + getId().toString() + ".jpg";
    }
}
