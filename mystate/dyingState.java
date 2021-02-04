package partten.mystate;

public class dyingState implements State{
    public dyingState(player man) {
        this.man = man;
    }
     public dyingState(){

    }
    public void output(){
        System.out.println("duing state!");
    }
    player man;
    @Override
    public void attack() {
        System.out.println("挂机重连");
        output();
        man.setState(man.getStaticState());
    }

    @Override
    public void quick() {
        System.out.println("推出游戏");
        output();
    }

    @Override
    public void beAttacked() {
        System.out.println("没用的，他挂机在");
        output();
//        man.setState(man.getStaticState());
    }

    @Override
    public void stop() {
        System.out.println("挂机重连");
        output();
        man.setState(man.getStaticState());
    }

    @Override
    public void run() {
        System.out.println("挂机重连");
        output();
        man.setState(man.getStaticState());
    }
}
