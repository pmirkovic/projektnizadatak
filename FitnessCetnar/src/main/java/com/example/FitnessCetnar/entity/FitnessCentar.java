package com.example.FitnessCetnar.entity;

import com.fasterxml.jackson.databind.ser.Serializers;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class FitnessCentar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private String adresa;

    @Column
    private Integer brTelefona;

    @Column
    private String email;


    @OneToMany(mappedBy="fitnessCentar",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Sala> sale = new ArrayList<>();

    @OneToMany(mappedBy="fitnessCentar",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Korisnik> korisnik = new ArrayList<>();

    @OneToMany(mappedBy="fitnessCentar",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<TerminskaLista> terminskaListaList = new ArrayList<>();

    @OneToMany(mappedBy="fitnessCentar",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Trener> treners = new ArrayList<>();

    public FitnessCentar() {
    }

    /*----------------------------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public Integer getBrTelefona() {
        return brTelefona;
    }

    public String getEmail() {
        return email;
    }

    public List<Sala> getSale() {
        return sale;
    }

    public List<Korisnik> getKorisnik() {
        return korisnik;
    }

    public List<TerminskaLista> getTerminskaListaList() {
        return terminskaListaList;
    }

    public List<Trener> getTreners() {
        return treners;
    }
    /*----------------------------------------------------------------------*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setBrTelefona(Integer brTelefona) {
        this.brTelefona = brTelefona;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSale(List<Sala> sale) {
        this.sale = sale;
    }

    public void setKorisnik(List<Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    public void setTerminskaListaList(List<TerminskaLista> terminskaListaList) {
        this.terminskaListaList = terminskaListaList;
    }

    public void setTreners(List<Trener> treners) {
        this.treners = treners;
    }
    /*----------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "FitnessCentar{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", adresa='" + adresa + '\'' +
                ", brTelefona=" + brTelefona +
                ", email='" + email + '\'' +
                ", sale=" + sale +
                ", korisnik=" + korisnik +
                ", terminskaListaList=" + terminskaListaList +
                ", treners=" + treners +
                '}';
    }
}
