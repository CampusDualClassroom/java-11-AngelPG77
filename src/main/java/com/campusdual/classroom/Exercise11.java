package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        System.out.println("Esta la TV encendida: " + redRemote.turnOn());
        System.out.println("El canal actual es: " + redRemote.channel);
        redRemote.channelUp();
        System.out.println("Subimos un canal");
        System.out.println("El canal actual es: " + redRemote.channel);
        redRemote.channelDown();
        System.out.println("Bajamos un canal");
        System.out.println("El canal actual es: " + redRemote.channel);
        redRemote.channel = 0;
        System.out.println("Ponemo el canal a cero e intentamos bajar un canal");
        redRemote.channelDown();
        System.out.println("El canal actual es: " + redRemote.channel);
        redRemote.volumeUp();
        System.out.println("Subimos el volumen");
        System.out.println("El volumen es: " + redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Bajamos el volumen");
        System.out.println("El volumen es: " + redRemote.volume);
        System.out.println("Ponemo el volumen a cero e intentamos bajarlo");
        redRemote.volume = 0;
        System.out.println("El volumen es: " + redRemote.volume);
        redRemote.volumeDown();
        System.out.println("El volumen es: " + redRemote.volume);
        System.out.println("El color del control remoto es: " + redRemote.getColor());
        System.out.println("Esta la TV encendida: " + redRemote.turnOff());


    }

}