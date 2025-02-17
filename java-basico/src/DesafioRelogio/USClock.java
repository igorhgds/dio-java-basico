package DesafioRelogio;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay(){
        this.periodIndicator = "PM";
    }

    public void setBeforerMidDay(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
            setBeforerMidDay();
        if ((hour > 12) && (hour <=23)){
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        return null;
    }
}
