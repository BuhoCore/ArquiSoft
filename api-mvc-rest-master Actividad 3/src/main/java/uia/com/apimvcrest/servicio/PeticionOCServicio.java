package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.PeticionOCModelo;

import java.io.IOException;
import java.util.ArrayList;

public class PeticionOCServicio implements IPeticionOCServicio {

    private GestorCompras miGestorCompras = new GestorCompras();

    public PeticionOCServicio() throws IOException {
    }

    @Override
    public ArrayList<CotizacionModelo> getCotizaciones() {
        return miGestorCompras.getCotizaciones();
    }

    @Override
    public Object getCotizacion(int id)
    {
        return miGestorCompras.getCotizacion(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloCotizaciones();
    }

    }
