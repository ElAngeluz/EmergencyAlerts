package com.fundlinux.emalert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by parivera on 08/08/2017.
 */

public class AlertClass {
    private int id;
    private TipoAlerta tipoAlerta;
    private Date fechaAlerta;
    private String mensaje;
    private String sugerencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAlerta getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(TipoAlerta tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public Date getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(Date fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public AlertClass(int id, TipoAlerta tipoAlerta, Date fechaAlerta, String mensaje, String sugerencias) {
        this.id = id;
        this.tipoAlerta = tipoAlerta;
        this.fechaAlerta = fechaAlerta;
        this.mensaje = mensaje;
        this.sugerencia = sugerencias;
    }

    public List<AlertClass> CrearLista(){
        List<AlertClass> lista = new ArrayList<AlertClass>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            lista.add(new AlertClass(1,TipoAlerta.EMERGENCIA,sdf.parse("08/08/2017"),"nuevo terremoto de 5.6","Buscar un punto de ayuda cercano"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return lista;
    }
}