package com.example.manuel.prototipo_personaemocion.Model.FactoriaEmociones;


import java.util.ArrayList;

/**
 * Created by Manuel on 29/11/2015.
 */
public class FactoriaVergüenza implements FactoriaEmocion  {
    protected String tipoCuestionario;
    protected int preguntaActual;

    public FactoriaVergüenza(String Cuestionario, int pregActual){
        tipoCuestionario = Cuestionario;
        preguntaActual = pregActual;
    }

    public Emocion creaObjeto(ArrayList<String> tiposYaIncluidos){
        return new Vergüenza(tipoCuestionario,preguntaActual,tiposYaIncluidos);
    }
}
