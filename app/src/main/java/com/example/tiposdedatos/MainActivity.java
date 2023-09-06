package com.example.tiposdedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String textoBtnValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvValue= findViewById(R.id.textViewValue);
        TextView tvResult= findViewById(R.id.textViewResult);

        Button btnSuma= findViewById(R.id.buttonSuma);
        Button btnResta= findViewById(R.id.buttonResta);
        Button btnMulti= findViewById(R.id.buttonMulti);
        Button btnDiv= findViewById(R.id.buttonDivi);
        Button btnClear= findViewById(R.id.buttonClear);
        Button btnZero= findViewById(R.id.buttonCero);
        Button btnOne= findViewById(R.id.buttonOne);
        Button btnTwo= findViewById(R.id.buttonTwo);
        Button btnThree= findViewById(R.id.buttonThree);
        Button btnFour= findViewById(R.id.buttonFour);
        Button btnFive= findViewById(R.id.buttonFive);
        Button btnSix= findViewById(R.id.buttonSix);
        Button btnSeven= findViewById(R.id.buttonSeven);
        Button btnEight= findViewById(R.id.buttonEight);
        Button btnNine= findViewById(R.id.buttonNine);
        Button btnStart= findViewById(R.id.buttonStart);

        EditText valueOne= findViewById(R.id.etValueOne);
        EditText valueTwo= findViewById(R.id.etValueTwo);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvValue.getText().toString().equals("+")){
                    //Casteo --> cambiar de un tipo de dato a otro
                    int numero1= Integer.parseInt(valueOne.getText().toString());
                    int numero2= Integer.parseInt(valueTwo.getText().toString());
                    tvResult.setText(suma(numero1,numero2)+""); ;
                }else if (tvValue.getText().toString().equals("-")){

                } else if (tvValue.getText().toString().equals("*")) {

                } else if (tvValue.getText().toString().equals("/")) {

                }else {
                    Toast.makeText(getApplicationContext(),"Ingrese una operación matemática",Toast.LENGTH_LONG).show();
                }
            }
        });


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();

                // la suma de textos es concatenar y se realiza con el simbolo +
                tvValue.setText(textoBtnValue+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"3");
            }
        });
// sumen Hola + Mundo = Hola Mundo "1" + "5" = "15"  --> "15" + "+"= "15+"
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"9");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"+");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"-");
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"*");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toString convierte cualquier valor en String
                textoBtnValue= tvValue.getText().toString();
                tvValue.setText(textoBtnValue+"/");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvValue.setText("");
                tvResult.setText("");
            }
        });



    }

    // (Parametros)
    public int suma(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }





}