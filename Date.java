public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day=day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        StringBuilder date=new StringBuilder();
        if(day>=10){
            date.append(day).append("/");
        }
        else{
            date.append("0").append(day).append("/");
        }
        if(month>=10){
            date.append(month).append("/");
        }
        else{
            date.append("0").append(month).append("/");
        }
        if(year>=1000){
            date.append(year);
        }
        else if(year>=100){
            date.append("0").append(year);
        }
        else if(year>=10){
            date.append("0").append("0").append(year);
        }
        else{
            date.append("0").append("0").append("0").append(year);
        }
        return date.toString();
    }
}
