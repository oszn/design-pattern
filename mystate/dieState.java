package partten.mystate;

public class dieState implements State {
    public dieState(player man) {
        this.man = man;
    }
    public dieState(){

    }
    public void output(){
        System.out.println("dieState\n");
    }
    player man;
    @Override
    public void attack() {

        System.out.println("人都没了，没必要攻击");
        output();
    }

    @Override
    public void quick() {
        System.out.println("结束游戏");
        output();
    }

    @Override
    public void beAttacked() {
        System.out.println("人都没了，没必要攻击");
        output();
    }

    @Override
    public void stop() {
        System.out.println("");
        output();
    }

    @Override
    public void run() {
        output();
    }
}
