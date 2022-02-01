package uia.com.apimvcrest;

import uia.com.apimvcrest.modelo.CotizacionModelo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uia.com.apimvcrest.modelo.PeticionOCModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;
import uia.com.apimvcrest.servicio.PeticionOCServicio;

import java.io.IOException;

@SpringBootApplication
public class ApiMvcRestApplication {

    public static void main(String[] args) throws IOException {
        CotizacionModelo newCotizacion = new CotizacionModelo(1, "prueba", "1", 1, 1, 0.0,  1);
        newCotizacion.print();

        PeticionOCModelo newPeticionOCModelo = new PeticionOCModelo("1","mucho taco",-2);
        newPeticionOCModelo.print();

        CotizacionServicio newCotizacionServicio = new CotizacionServicio();
        newCotizacionServicio.getCotizaciones();
        newCotizacionServicio.print();

        PeticionOCServicio newPeticionOCServicio = new  PeticionOCServicio();
        newPeticionOCServicio.getCotizaciones();
        newPeticionOCServicio.print();

        SpringApplication.run(ApiMvcRestApplication.class, args);
    }

}
