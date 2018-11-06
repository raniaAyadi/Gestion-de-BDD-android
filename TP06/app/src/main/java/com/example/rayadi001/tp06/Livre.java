package com.example.rayadi001.tp06;

/**
 * Created by rayadi001 on 06/11/18.
 */

public class Livre {
    private int id;
    private String isbn;
    private String titre;

    public Livre(int id, String isbn, String titre) {
        this.id = id;
        this.isbn = isbn;
        this.titre = titre;
    }

    public Livre() {
    }

    public Livre(String isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}

