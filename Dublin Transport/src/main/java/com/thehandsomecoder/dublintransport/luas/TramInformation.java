package com.thehandsomecoder.dublintransport.luas;

/**
 * Created by Scott on 23/01/14.
 */
public class TramInformation
{
   private String direction;
   private String destination;
   private String dueTime;

    public TramInformation() {
    }

    public TramInformation(String direction, String destination, String dueTime) {
        this.direction = direction;
        this.destination = destination;
        this.dueTime = dueTime;
    }

    public String getDirection()
    {
        return direction;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getDueTime()
    {
        return dueTime;
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setDueTime(String dueTime)
    {
        this.dueTime = dueTime;
    }

    @Override
    public String toString()
    {
        String placeholder = "Direction: %s\tDestination: %s\tDueTime: %s";
        placeholder = String.format(placeholder, getDirection(), getDestination(), getDueTime());
        return placeholder;
    }
}
