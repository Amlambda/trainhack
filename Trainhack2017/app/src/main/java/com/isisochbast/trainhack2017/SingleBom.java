package com.isisochbast.trainhack2017;

import java.net.HttpURLConnection;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by amandanorberg on 2017-09-08.
 */


public class SingleBom {
    private String id;
    private String name;

    public SingleBom(String id){
        this.id = id;
        this.name = "En bom";
    }


    public String getName(){
        //Hämta detta någonstans??
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public Calendar getTimeGoingDown(){
        Calendar timeDown = Calendar.getInstance();
        //hämta info från API med id?
        return timeDown;
    }

    public Calendar getTimeGoingUp(){
        Calendar timeUp = Calendar.getInstance();
        //hämta info från API med id?
        return timeUp;
    }

    public int totTimeDown(){
        int goingDown = this.getTimeGoingDown().MINUTE;
        int goingUp = this.getTimeGoingUp().MINUTE;
        int timeDown;
        if(goingUp > goingDown){
            timeDown = goingUp - goingDown;
        }else{
            timeDown = goingDown - goingUp;
        }
        //return timeDown;
        return 4;
    }

}
