
package com.veloso.danilo.listacarros.pacote_carro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carro {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("url_info")
    @Expose
    private String urlInfo;
    @SerializedName("url_foto")
    @Expose
    private String urlFoto;
    @SerializedName("url_video")
    @Expose
    private String urlVideo;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
