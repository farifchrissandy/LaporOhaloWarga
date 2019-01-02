package com.lapo.pengaduan.data;

/**
 * Created by Kuncoro on 26/03/2016.
 */
public class Data_sambat {
    private String id_sambat, isi_sambat, saran;

    public Data_sambat() {
    }

    public Data_sambat(String id_sambat, String isi_sambat, String saran) {
        this.id_sambat = id_sambat;
        this.isi_sambat = isi_sambat;
        this.saran = saran;
    }

    public String getId_sambat() {
        return id_sambat;
    }

    public void setId_sambat(String id_sambat) {
        this.id_sambat = id_sambat;
    }

    public String getIsi_sambat() {
        return isi_sambat;
    }

    public void setIsi_sambat(String isi_sambat) {
        this.isi_sambat = isi_sambat;
    }

    public String getSaran() {
        return saran;
    }

    public void setSaran(String saran) {
        this.saran = saran;
    }
}
