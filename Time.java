public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

   public void setHour(int hour){
        this.hour=hour;
    }

    public void setMinute(int minute){
        this.minute=minute;
    }

    public void setSecond(int second){
        this.second=second;
    }

    public void setTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toString(){
        StringBuilder time=new StringBuilder();
        if(hour>=10){
            time.append(hour).append(":");
        }
        else{
            time.append("0").append(hour).append(":");
        }
        if(minute>=10){
            time.append(minute).append(":");
        }
        else{
            time.append("0").append(minute).append(":");
        }
        if(second>=10){
            time.append(second);
        }
        else{
            time.append("0").append(second);
        }
        return time.toString();
    }

    public Time nextSecond(){
        if(second!=59){
            second+=1;
        }
        else{
            second=0;
            if(minute!=59){
              minute+=1;
            }
            else{
                minute=0;
                if(hour!=23){
                    hour+=1;
                }
                else{
                    hour=0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        if(second!=0){
            second-=1;
        }
        else{
            second=59;
            if(minute!=0){
                minute-=1;
            }
            else{
                minute=59;
                if(hour!=0){
                    hour-=1;
                }
                else{
                    hour=23;
                }
            }
        }
        return this;
    }
}
