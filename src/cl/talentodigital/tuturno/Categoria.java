package cl.talentodigital.tuturno;

import java.util.List;

public class Categoria {
    private int id;
    private List<String> listadoDeServicios;
    private String nombre;

    public Categoria(){

    }

    public Categoria(int id) {
        this.id = id;
    }

    public Categoria(int id, List<String> listadoDeServicios) {
        this.id = id;
        this.listadoDeServicios = listadoDeServicios;
    }

    public Categoria(int id, List<String> listadoDeServicios, String nombre) {
        this.id = id;
        this.listadoDeServicios = listadoDeServicios;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getListadoDeServicios() {
        return listadoDeServicios;
    }

    public void setListadoDeServicios(List<String> listadoDeServicios) {
        this.listadoDeServicios = listadoDeServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
