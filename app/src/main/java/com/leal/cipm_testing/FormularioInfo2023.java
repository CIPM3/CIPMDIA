package com.leal.cipm_testing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class FormularioInfo2023 extends AppCompatActivity {

    EditText input_apellido,input_nombre,input_telefono;
    Spinner spin,spin2,spin3;

    ImageView user_photo;

    String selection,selection2,selection3,urlImage;

    Estudiante estudiante;

    TextView txt1,txt2,txt3;

    //DB FUNC
    String userid;
    Task<Void> docref;

    private static final int RC_SELECT_IMAGE = 123;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    FirebaseAuth mAuth;
    FirebaseStorage storage;
    StorageReference storageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_info2023);

        input_nombre = findViewById(R.id.input_nombre);
        input_apellido = findViewById(R.id.input_apellido);
        input_telefono = findViewById(R.id.input_telefono);
        user_photo = findViewById(R.id.user_photo);

        //Spinner Pais
        spin = (Spinner) findViewById(R.id.spinuno);
        txt1 = (TextView) findViewById(R.id.textspin1);
        //Spinner Tomado Clases
        spin2 = (Spinner) findViewById(R.id.spindos);
        txt2 = (TextView) findViewById(R.id.textspin2);
        //Spinner Tiempo tomando clases
        spin3 = (Spinner) findViewById(R.id.spintres);
        txt3 = (TextView) findViewById(R.id.textspin3);

        mAuth= FirebaseAuth.getInstance();
        userid = mAuth.getCurrentUser().getUid();
        storage = FirebaseStorage.getInstance();
        storageRef = storage.getReference();

        user_photo.setOnClickListener(view -> {
            openImagePicker();
        });

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
        Toast.makeText(this, ""+urlImage, Toast.LENGTH_SHORT).show();
        if(!nombre.isEmpty() && !apellido.isEmpty() && !telefono.isEmpty()){
            estudiante = new Estudiante(nombre,apellido,telefono,selection,selection2,selection3,urlImage);
            paso = true;
        }else{
            Toast.makeText(this, "Porfavor, Rellena todos los campos", Toast.LENGTH_SHORT).show();
        }

        return paso;
    }

    public class Estudiante {
        private String nombre,apellido,urlImage;
        private String telefono;
        private String deDondeEres,hazTomadoClases,cuantoTiempoLlevas;

        // Constructor
        public Estudiante(String nombre,String apellido,String telefono,String deDondeEres,String hazTomadoClases,String cuantoTiempoLlevas,String urlImage) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.deDondeEres = deDondeEres;
            this.hazTomadoClases = hazTomadoClases;
            this.cuantoTiempoLlevas = cuantoTiempoLlevas;
            this.urlImage = urlImage;
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

        public String getUrlImage(){return urlImage;}

        public void setUrlImage(String urlImage){
            this.urlImage = urlImage;
        }

    }

    public void limpiarFormulario (){
        input_nombre.setText("");
        input_apellido.setText("");
        input_telefono.setText("");
        spin.setSelection(0);
        spin2.setSelection(0);
        spin3.setSelection(0);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        docref = db.collection(userid).document("EstudentsInfo").set(estudiante);
    }

    void openImagePicker() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, RC_SELECT_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SELECT_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            // Obtén el URI de la imagen
            Uri imagenUri = data.getData();
            Uri image = Uri.parse(String.valueOf(imagenUri));

            //coloca la imagen en el xml
            Glide.with(this)
                    .load(image)
                    .into(new CustomTarget<Drawable>() {
                        @Override
                        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                            // Establece el Drawable como fondo de la vista
                            user_photo.setBackground(resource);
                        }

                        @Override
                        public void onLoadCleared(@Nullable Drawable placeholder) {
                            // Método vacío necesario para la implementación de CustomTarget
                        }
                    });


            uploadImage(imagenUri);

            //Toast.makeText(this, "imagenpath: "+imageUri, Toast.LENGTH_SHORT).show();
        }
    }

    private void uploadImage(Uri imageUri) {

        // Crear una referencia al archivo en Firebase Storage
        StorageReference storageRef = storage.getReference().child("images/" + userid);

        // Subir el archivo a Firebase Storage
        UploadTask uploadTask = storageRef.putFile(imageUri);

        uploadTask.addOnSuccessListener(taskSnapshot -> {
            // La imagen se subió exitosamente
            Toast.makeText(FormularioInfo2023.this, "Imagen subida correctamente", Toast.LENGTH_SHORT).show();
            obtenerImage();
        }).addOnFailureListener(e -> {
            // Ocurrió un error al subir la imagen
            Toast.makeText(FormularioInfo2023.this, "Error al subir la imagen: " + e.getMessage(), Toast.LENGTH_SHORT).show();

        });
    }

    private void obtenerImage(){
        StorageReference storageRef = storage.getReference().child("images/"+userid);
        storageRef.getDownloadUrl().addOnSuccessListener(uri -> {
            urlImage = uri.toString();
        }).addOnFailureListener(exception -> {
            // Ocurrió un error al obtener la URL de la imagen
        });
    }

    public void EnviarForm(View v){

        Boolean isValidated = validacion(input_nombre.getText().toString(), input_apellido.getText().toString(),input_telefono.getText().toString());

        if(isValidated){
            agregarEstudiante(estudiante);
            limpiarFormulario();
            Toast.makeText(this, "Informacion Enviada", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Ocurrio un Error al enviar la informacion.", Toast.LENGTH_SHORT).show();
        }
    }


    //VOLVER A MAIN
    public void main(View vista) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }
}