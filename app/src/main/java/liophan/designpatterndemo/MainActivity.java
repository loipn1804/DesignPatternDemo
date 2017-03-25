package liophan.designpatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.behavioral.strategy.StrategyActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnStrategy)
    Button btnStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnStrategy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStrategy:
                startActivity(StrategyActivity.class);
                break;
        }
    }

    private void startActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
