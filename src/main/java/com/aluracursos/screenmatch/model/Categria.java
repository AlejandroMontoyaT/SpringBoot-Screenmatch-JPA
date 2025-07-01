package com.aluracursos.screenmatch.model;

public enum Categria {

    ACCION("Action"),

    ROMANCE("Romance"),

    COMEDIA("Comedy"),

    DRAMA("Drama"),

    CRIMEN("Crime");

    private String categoriaOmdb;

    Categria (String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categria fromString(String text) {
        for (Categria categoria : Categria.values()) {
            if (categoria.categoriaOmdb.equals(text)) {
                return  categoria;
            }
        }
        throw new IllegalArgumentException("No se encontró la categoría: " + text);
    }
    }

