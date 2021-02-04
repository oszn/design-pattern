package partten.mystate;

public class runningState implements State{
    player man;

    public runningState(player man) {
        this.man = man;
    }
    public runningState(){};
    public void output(){
        System.out.println("running state");
    }
    @Override
    public void attack() {
        System.out.println("attack");
        output();
    }

    @Override
    public void quick() {
        System.out.println("进入dying状态");
        output();
        man.setState(man.getDyingSate());
    }

    @Override
    public void beAttacked() {
        System.out.println("闪避");
        output();
    }

    @Override
    public void stop() {
        System.out.println("停止奔跑进入static");
        output();
        man.setState(man.getStaticState());
    }

    @Override
    public void run() {
        System.out.println("已经在奔跑了");
        output();
    }
}
