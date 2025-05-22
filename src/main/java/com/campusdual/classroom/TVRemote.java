package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    //Constructores
    public TVRemote(String color) {
        this.color = color;
        this.volume = 20;
        this.channel = 0;
    }

    //Metodos

    public boolean turnOn(){
        this.on = true;
        return this.on;
    }

    public boolean turnOff(){
        this.on = false;
        return this.on;
    }

    public void channelUp(){
        this.channel ++;
    }

    public void channelDown(){
        if (this.checkMinValue(this.channel)){
            this.channel --;
        }
    }

    public void volumeUp(){
        this.volume ++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)){
            this.volume --;
        }
    }

    public String getColor(){
        return this.color;
    }

    private boolean checkMinValue(int value){
        if (value == 0){
            return false;
        } else {
            return true;
        }
    }



}
