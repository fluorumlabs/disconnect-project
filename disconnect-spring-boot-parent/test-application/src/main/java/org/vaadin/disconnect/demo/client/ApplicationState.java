package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.PersistToLocalStorage;
import org.vaadin.disconnect.vue.annotations.VuexState;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@VuexState
@PersistToLocalStorage
public class ApplicationState implements Serializable {
    private static final long serialVersionUID = 1;

    private TimerState state = TimerState.STOPPED;

    private Date dateStarted;
    private Date datePaused;

    private List<Interval> intervals = new ArrayList<>();

    @Mutation
    public void stop() {
        state = TimerState.STOPPED;
        dateStarted = null;
        datePaused = null;
    }

    @Mutation
    public void start() {
        state = TimerState.RUNNING;
        dateStarted = new Date();
        datePaused = null;
    }

    @Mutation
    public void resume() {
        state = TimerState.RUNNING;
        datePaused = null;
    }

    @Mutation
    public void pause() {
        state = TimerState.PAUSED;
        datePaused = new Date();
    }

    @Mutation
    public void addInterval(Interval interval) {
        List<Interval> newList = new ArrayList<>(intervals);
        newList.add(interval);
        intervals = newList;
    }

    @Mutation
    public void clearIntervals() {
        intervals = new ArrayList<>();
    }

    public TimerState getTimerState() {
        return state;
    }

    public TimerState getState() {
        return state;
    }

    public boolean isStopped() {
        return state == TimerState.STOPPED;
    }

    public boolean isRunning() {
        return state == TimerState.RUNNING;
    }

    public boolean isPaused() {
        return state == TimerState.PAUSED;
    }

    public long getTotalDuration() {
        long duration = 0;
        for (Interval interval : intervals) {
            duration += interval.end.getTime() - interval.begin.getTime();
        }

        if (state == TimerState.RUNNING) {
            duration += System.currentTimeMillis() - dateStarted.getTime();
        } else if (state == TimerState.PAUSED) {
            duration += datePaused.getTime() - dateStarted.getTime();
        }

        return duration;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public Date getDatePaused() {
        return datePaused;
    }

    public List<Interval> getIntervals() {
        return intervals;
    }

    public enum TimerState implements Serializable {STOPPED, RUNNING, PAUSED}

    public static class Interval implements Serializable {
        private Date begin;
        private Date end;

        public Interval() {
        }

        public Interval(Date begin, Date end) {
            this.begin = begin;
            this.end = end;
        }

        public Date getBegin() {
            return begin;
        }

        public void setBegin(Date begin) {
            this.begin = begin;
        }

        public Date getEnd() {
            return end;
        }

        public void setEnd(Date end) {
            this.end = end;
        }
    }
}
