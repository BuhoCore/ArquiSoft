package uia.com.apimvcrest.modelo;

import java.util.ArrayList;

public class PeticionOCModelo {

    private String codigo = "";
    private String unidad = "";
    private int cantidad = -2;
    private ArrayList<ItemCotizacionModelo> items = new ArrayList<ItemCotizacionModelo>();

    public PeticionOCModelo(String codigo, String unidad, int cantidad) {
        this.codigo = codigo;
        this.unidad = unidad;
        this.cantidad = cantidad;
    }

    public ArrayList<ItemCotizacionModelo> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCotizacionModelo> items) {
        this.items = items;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void print() {
        System.out.println(
                " \n\tcodigo:\t" + this.codigo
                        + " \n\tunidad:\t" + this.unidad
                        + " \n\tcantidad:\t" + this.cantidad
        );
        if (this.getItems() != null) {
            for (int i = 0; i < this.getItems().size(); i++)
                this.getItems().get(i).print();
        }
    }
}