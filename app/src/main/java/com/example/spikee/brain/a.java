package com.example.spikee.brain;

/**
 * Created by Spikee on 28-10-2017.
 */
import java.util.Random;
class a
{
    public int ran()
    {
        Random rn = new Random();
        int answer = rn.nextInt(16) + 1;
        return (answer);
    }
    public String Quotes()
    {
        int n=ran();
        String quotes[] =new String[20];
        quotes[0]="Either you run the day or the day runs you.";
        quotes[1]="I was motivated to be different in part because I was different.";
        quotes[2]="Problems are not stop signs, they are guidelines.";
        quotes[3]="Problems are not stop signs, they are guidelines.";
        quotes[4]="Whatever happens right now, it has to happen." ;
        quotes[5]="The secret to success is constancy to purpose";
        quotes[6]="Success is going from failure to failure without losing your enthusiasm.";
        quotes[7]="Victory belongs to the most persevering";
        quotes[8]="The successful man will profit from his mistakes and try again in a different way";
        quotes[9]="Be willing to walk alone.Many who started with you won't finish with you.";
        quotes[10]="What consumes your mind,Controls your Life";
        quotes[11]="Kindness is a language the blind can see and the deaf can hear";
        quotes[12]="I don't know where I'm going but I'm on my way";
        quotes[13]="We mature with the damage,not with the years";
        quotes[14]="I am not what you think I am.You are what you think I am";
        quotes[15]="The less you respond to negative people,the more peaceful your life will become";
        quotes[16]="Don't call it a dream,call it a Plan";

        return quotes[n];
    }
}