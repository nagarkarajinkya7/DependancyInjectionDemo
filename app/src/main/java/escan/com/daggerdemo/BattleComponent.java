package escan.com.daggerdemo;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {

    War getWar();
   //Starks getStarks();
    //Boltons getBoltons();
    Cash getCash();
    Soldiers getSoldiers();
}
