package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.PeticionOCModelo;

import java.util.ArrayList;

public interface IPeticionOCServicio {
        ArrayList<CotizacionModelo> getCotizaciones();
        Object getCotizacion(int id);
        void print();

}
