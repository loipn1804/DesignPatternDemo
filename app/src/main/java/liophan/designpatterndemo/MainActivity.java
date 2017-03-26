package liophan.designpatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.behavioral.observer.ObserverActivity;
import liophan.designpatterndemo.behavioral.strategy.StrategyActivity;
import liophan.designpatterndemo.creational.abstractfactory.AbstractFactoryActivity;
import liophan.designpatterndemo.creational.factory.FactoryActivity;
import liophan.designpatterndemo.creational.singleton.Singleton;
import liophan.designpatterndemo.creational.singleton.SingletonActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnStrategy)
    Button btnStrategy;
    @BindView(R.id.btnObserver)
    Button btnObserver;
    @BindView(R.id.btnFactory)
    Button btnFactory;
    @BindView(R.id.btnAbstractFactory)
    Button btnAbstractFactory;
    @BindView(R.id.btnSingleTon)
    Button btnSingleTon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnStrategy.setOnClickListener(this);
        btnObserver.setOnClickListener(this);
        btnFactory.setOnClickListener(this);
        btnAbstractFactory.setOnClickListener(this);
        btnSingleTon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStrategy:
                startActivity(StrategyActivity.class);
                break;
            case R.id.btnObserver:
                startActivity(ObserverActivity.class);
                break;
            case R.id.btnFactory:
                startActivity(FactoryActivity.class);
                break;
            case R.id.btnAbstractFactory:
                startActivity(AbstractFactoryActivity.class);
                break;
            case R.id.btnSingleTon:
                startActivity(SingletonActivity.class);
                break;
        }
    }

    private void startActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
