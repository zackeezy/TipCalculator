package edu.harding.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.*;

public class MainActivity extends AppCompatActivity {
    private EditText billAmount;
    private EditText tipPercent;
    private TextView tipTotal;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        billAmount = (EditText) findViewById(R.id.billEditText);
        tipPercent = (EditText) findViewById(R.id.tipEditText);
        tipTotal = (TextView) findViewById(R.id.tipTextView);
        total = (TextView) findViewById(R.id.totalTextView);
    }

    public void calculateClick(View view) {
        if(billAmount.getText().toString().isEmpty() || tipPercent.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter numbers for bill and tip percent.", Toast.LENGTH_SHORT).show();
        }
        else{
            Float tipPercentFloat;
            tipPercentFloat = Float.parseFloat(tipPercent.getText().toString());
            Float billAmountfloat;
            billAmountfloat = Float.parseFloat(billAmount.getText().toString());
            Float tipTotalFloat;
            tipTotalFloat = billAmountfloat * tipPercentFloat / 100;
            NumberFormat moneyFormat;
            moneyFormat = NumberFormat.getCurrencyInstance();
            tipTotal.setText(moneyFormat.format(tipTotalFloat));
            Float totalFloat = billAmountfloat + tipTotalFloat;
            total.setText(moneyFormat.format(totalFloat));
        }
    }
}
