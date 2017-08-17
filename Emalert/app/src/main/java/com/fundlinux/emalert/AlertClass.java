package com.fundlinux.emalert;

import java.text.DateFormat;
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
    public static List<AlertClass> lista = new ArrayList<>();

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }



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

    public AlertClass(TipoAlerta tipoAlerta, Date fechaAlerta, String mensaje, String sugerencias) {
        this.id = LastIndex();
        this.tipoAlerta = tipoAlerta;
        this.fechaAlerta = fechaAlerta;
        this.mensaje = mensaje;
        this.sugerencia = sugerencias;
    }

    private int LastIndex(){
        return lista.size() +1;
    }

    public static List<AlertClass> Lista(){
        if (lista.isEmpty()){
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            try {
                lista.add(new AlertClass(TipoAlerta.EMERGENCIA,sdf.parse("2017/08/08"),"nuevo terremoto de 5.6","Buscar un punto de ayuda cercano"));
                lista.add(new AlertClass(TipoAlerta.ALERTA,sdf.parse("2017/08/08"),"nuevo terremoto de 5.6","Buscar un punto de ayuda cercano"));
                lista.add(new AlertClass(TipoAlerta.INFORMACION,sdf.parse("2017/08/08"),"nuevo terremoto de 5.6","Buscar un punto de ayuda cercano"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return lista;
        }
        return lista;
    }

    public static List<AlertClass> UpdateList(AlertClass _item){
        lista.add(_item );
        return lista;
    }

    public static List<AlertClass> FilteresList (TipoAlerta _tipo){
        List<AlertClass> filter = new ArrayList<>();
        for (int i= 0; i < lista.size(); i++){
            if (lista.get(i).getTipoAlerta() == _tipo){
                filter.add(lista.get(i));
            }
        }

        return filter;
    }
}