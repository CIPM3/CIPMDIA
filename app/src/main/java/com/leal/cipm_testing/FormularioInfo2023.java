package com.leal.cipm_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioInfo2023 extends AppCompatActivity {

    EditText input_apellido,input_nombre,input_telefono;
    Spinner spin,spin2,spin3;

    String selection,selection2,selection3;

    Estudiante estudiante;

    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_info2023);

        input_nombre = findViewById(R.id.input_nombre);
        input_apellido = findViewById(R.id.input_apellido);
        input_telefono = findViewById(R.id.input_telefono);

        //Spinner Pais
        spin = (Spinner) findViewById(R.id.spinuno);
        txt1 = (TextView) findViewById(R.id.textspin1);
        //Spinner Tomado Clases
        spin2 = (Spinner) findViewById(R.id.spindos);
        txt2 = (TextView) findViewById(R.id.textspin2);
        //Spinner Tiempo tomando clases
        spin3 = (Spinner) findViewById(R.id.spintres);
        txt3 = (TextView) findViewById(R.id.textspin3);

        ActivarSpinners();
    }

    public void ActivarSpinners(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.paises, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection = spin.getSelectedItem().toString();
                txt1.setText(selection);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.TomadoClases, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection2 = spin2.getSelectedItem().toString();
                txt2.setText(selection2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.tiempoClases, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter3);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selection3 = spin3.getSelectedItem().toString();
                txt3.setText(selection3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void activaSpinner1(View v){
        spin.performClick();
    }

    public void activaSpinner2(View v){
        spin2.performClick();
    }

    public void activaSpinner3(View v){
        spin3.performClick();
    }

    public boolean validacion(String nombre, String apellido, String telefono){
        boolean paso = false;

        if(!nombre.isEmpty() && !apellido.isEmpty() && !telefono.isEmpty()){
            estudiante = new Estudiante(nombre,apellido,telefono,selection,selection2,selection3);
            paso = true;
        }else{
            Toast.makeText(this, "Porfavor, Rellena todos los campos", Toast.LENGTH_SHORT).show();
        }

        return paso;
    }

    public class Estudiante {
        private String nombre,apellido;
        private String telefono;
        private String deDondeEres,hazTomadoClases,cuantoTiempoLlevas;

        // Constructor
        public Estudiante(String nombre,String apellido,String telefono,String deDondeEres,String hazTomadoClases,String cuantoTiempoLlevas) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.deDondeEres = deDondeEres;
            this.hazTomadoClases = hazTomadoClases;
            this.cuantoTiempoLlevas = cuantoTiempoLlevas;
        }

        // Métodos getter y setter para cada atributo

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getdeDondeEres() {
            return deDondeEres;
        }

        public void setdeDondeEres(String deDondeEres) {
            this.deDondeEres = deDondeEres;
        }

        public String gethazTomadoClases() {
            return hazTomadoClases;
        }

        public void sethazTomadoClases(String hazTomadoClases) {
            this.hazTomadoClases = hazTomadoClases;
        }

        public String getcuantoTiempoLlevas() {
            return cuantoTiempoLlevas;
        }

        public void setcuantoTiempoLlevas(String cuantoTiempoLlevas) {
            this.cuantoTiempoLlevas = cuantoTiempoLlevas;
        }


    }

    public void EnviarForm(View v){
        /*Toast.makeText(this, "Informacion Enviada", Toast.LENGTH_SHORT).show();*/
        Boolean isValidated = validacion(input_nombre.getText().toString(), input_apellido.getText().toString(),input_telefono.getText().toString());
        Toast.makeText(this, "Status: "+isValidated, Toast.LENGTH_SHORT).show();

        if(isValidated){
            System.out.println("Estudiante Nombre: " + estudiante.getNombre());
            System.out.println("Estudiante Apellido: " + estudiante.getApellido());
            System.out.println("Estudiante Telefono: " + estudiante.getTelefono());
            System.out.println("Estudiante Pais: " + estudiante.getdeDondeEres());
            System.out.println("Estudiante Info Experiencia: " + estudiante.gethazTomadoClases());
            System.out.println("Estudiante Tiempo Aprendiendo Ingles : " + estudiante.getcuantoTiempoLlevas());
        }




    }
}