package partten.mystate;

public class staticState implements State{

    player man;

    public staticState(player man) {
        this.man = man;
    }
    public staticState(){};

    @Override
    public void attack() {
        System.out.println("attack");
//        man.setState(man.getDieState());
    }

    @Override
    public void quick() {
        System.out.println("进入dying状态");
        man.setState(man.getDyingSate());
    }

    @Override
    public void beAttacked() {
        System.out.println("进入dying状态");
        man.setState(man.getDieState());
    }

    @Override
    public void stop() {
        System.out.println("已经停了");
    }

    @Override
    public void run() {
        System.out.println("跑起来了");
        man.setState(man.getRunningState());
    }
}
