package model;

import java.util.UUID;

public class Producto {
    private UUID id;
    private String referencia;
    private byte numeroUnidades;
    private String creadoEl;
    private String modificadoEl;

    public Producto(String referencia, byte numeroUnidades, String creadoEl) {
        this.id = UUID.randomUUID();
        this.referencia = referencia;
        this.numeroUnidades = numeroUnidades;
        this.creadoEl = creadoEl;
        this.modificadoEl = null;
    }

    public UUID getId() {
        return id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public byte getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(byte numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    public String getCreadoEl() {
        return creadoEl;
    }

    public String getModificadoEl() {
        return modificadoEl;
    }

    public void setModificadoEl(String modificadoEl) {
        this.modificadoEl = modificadoEl;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getReferencia() + "\t" + getNumeroUnidades() + "\t" + getCreadoEl() + "\t" + (getModificadoEl() != null ? getModificadoEl() : "<Sin información>");
    }
}