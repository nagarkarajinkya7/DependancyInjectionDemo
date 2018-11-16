package escan.com.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Starks starks;
    private Boltons boltons;
    private House house;
    private War war;
    BattleComponent battleComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*starks = new Starks(); //house = new Starks();
        boltons = new Boltons(); // house = new Boltons();
        war = new War(starks,boltons);

        war.prepare();
        war.report();*/

        //battleComponent = DaggerBattleComponent.create();

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        battleComponent = DaggerBattleComponent.builder().braavosModule(new BraavosModule(cash,soldiers)).build();
        war = battleComponent.getWar();

        war.prepare();
        war.report();

        battleComponent.getCash();
        battleComponent.getSoldiers();

    }
}
