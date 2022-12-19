package com.dw.DW.json_models.trip;

public class ServiceDays {
    public String planningPeriodBegin = "";
    public String planningPeriodEnd = "";
    public String sDaysR = "";
    public String sDaysI = "";
    public String sDaysB = "";

    public ServiceDays() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceDays{");
        sb.append("planningPeriodBegin='").append(planningPeriodBegin).append('\'');
        sb.append(", planningPeriodEnd='").append(planningPeriodEnd).append('\'');
        sb.append(", sDaysR='").append(sDaysR).append('\'');
        sb.append(", sDaysI='").append(sDaysI).append('\'');
        sb.append(", sDaysB='").append(sDaysB).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
