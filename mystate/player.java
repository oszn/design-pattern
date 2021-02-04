package partten.mystate;

public class player {
    State dieState;
    State dyingSate;
    State staticState;

    public State getDieState() {
        return dieState;
    }

    public void setDieState(State dieState) {
        this.dieState = dieState;
    }

    public State getDyingSate() {
        return dyingSate;
    }

    public void setDyingSate(State dyingSate) {
        this.dyingSate = dyingSate;
    }

    public State getStaticState() {
        return staticState;
    }

    public void setStaticState(State staticState) {
        this.staticState = staticState;
    }

    public State getRunningState() {
        return runningState;
    }

    public void setRunningState(State runningState) {
        this.runningState = runningState;
    }

    public State getState() {
        return state;
    }

    State runningState;

    State state;
    public player(){
        dieState=new dieState(this);
        dyingSate=new dyingState(this);
        staticState=new staticState(this);
        runningState=new runningState(this);
        state=staticState;
    }
    public void attack(){
        state.attack();
    }
    public void stop(){
        state.stop();
    }
    public void quit() {
        state.quick();
    }
    public void run() {
        state.run();
    }
    public void beAttacked() {
        state.beAttacked();
    }
    void setState(State state){
        this.state=state;
    }


}
