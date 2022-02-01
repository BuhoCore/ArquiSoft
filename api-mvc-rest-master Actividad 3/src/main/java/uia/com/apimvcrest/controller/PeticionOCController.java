package uia.com.apimvcrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.PeticionOCServicio;


import java.io.IOException;
import java.util.ArrayList;
@RestController
public class PeticionOCController {


        private PeticionOCServicio servicioPeticionOC = new PeticionOCServicio();

        public PeticionOCController() throws IOException {
        }

        @GetMapping("/POC")
        public ArrayList<CotizacionModelo> cotizaciones()
        {
            return servicioPeticionOC.getCotizaciones();
        }

        @GetMapping("/POC/{id}")
        public ResponseEntity<CotizacionModelo> cotizacionById(@PathVariable int id)
        {
            return (ResponseEntity<CotizacionModelo>) servicioPeticionOC.getCotizacion(id);
        }


}
