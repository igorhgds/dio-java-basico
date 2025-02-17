package DesafioRelogio;

public non-sealed class BRLClock extends Clock {
    @Override
    public Clock convert(final Clock clock) {
        super.convert(clock);
        if (clock instanceof USClock usClock) {
            this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                    usClock.getHour() + 12 :
                    usClock.getHour();
        }
        return this;
    }
}
