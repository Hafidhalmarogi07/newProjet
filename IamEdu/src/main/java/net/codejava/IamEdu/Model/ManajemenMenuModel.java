package net.codejava.IamEdu.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "manajemen_menu_tbl")
public class ManajemenMenuModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nama_aplikasi", length = 30)
    private String nama_aplikasi;

    @Column(name = "path_folder", length = 100)
    private String path_folder;

    @Column(name = "nama_menu_us", length = 50, nullable = false)
    private String nama_menu_us;

    @Column(name = "nama_menu_kr", length = 50, nullable = false)
    private String nama_menu_kr;

    @Column(name = "nama_menu_jp", length = 50, nullable = false)
    private String nama_menu_jp;

    @Column(name = "nama_menu_cn", length = 50, nullable = false)
    private String nama_menu_cn;

    @Column(name = "kategori_menu", length = 10, nullable = false)
    private String kategori_menu;

    @Column(name = "url_menu")
    private String url_menu;

    @Column(name = "aktif", length = 10)
    private String aktif;

    @Column(name = "keterangan", length = 200)
    private String keterangan;

    @Column(name = "status", nullable = false)
    private int status;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "create_at")
    private LocalDateTime create_at ;

    @UpdateTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "modified_at")
    private LocalDateTime modified_at ;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "modified_by")
    private String modified_by;

    @Column(name = "create_ip")
    private  String create_ip;

    @Column(name = "modified_ip")
    private  String modified_ip;
    
    

	public ManajemenMenuModel() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama_aplikasi() {
		return nama_aplikasi;
	}

	public void setNama_aplikasi(String nama_aplikasi) {
		this.nama_aplikasi = nama_aplikasi;
	}

	public String getPath_folder() {
		return path_folder;
	}

	public void setPath_folder(String path_folder) {
		this.path_folder = path_folder;
	}

	public String getNama_menu_us() {
		return nama_menu_us;
	}

	public void setNama_menu_us(String nama_menu_us) {
		this.nama_menu_us = nama_menu_us;
	}

	public String getNama_menu_kr() {
		return nama_menu_kr;
	}

	public void setNama_menu_kr(String nama_menu_kr) {
		this.nama_menu_kr = nama_menu_kr;
	}

	public String getNama_menu_jp() {
		return nama_menu_jp;
	}

	public void setNama_menu_jp(String nama_menu_jp) {
		this.nama_menu_jp = nama_menu_jp;
	}

	public String getNama_menu_cn() {
		return nama_menu_cn;
	}

	public void setNama_menu_cn(String nama_menu_cn) {
		this.nama_menu_cn = nama_menu_cn;
	}

	public String getKategori_menu() {
		return kategori_menu;
	}

	public void setKategori_menu(String kategori_menu) {
		this.kategori_menu = kategori_menu;
	}

	public String getUrl_menu() {
		return url_menu;
	}

	public void setUrl_menu(String url_menu) {
		this.url_menu = url_menu;
	}

	public String getAktif() {
		return aktif;
	}

	public void setAktif(String aktif) {
		this.aktif = aktif;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDateTime create_at) {
		this.create_at = create_at;
	}

	public LocalDateTime getModified_at() {
		return modified_at;
	}

	public void setModified_at(LocalDateTime modified_at) {
		this.modified_at = modified_at;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getCreate_ip() {
		return create_ip;
	}

	public void setCreate_ip(String create_ip) {
		this.create_ip = create_ip;
	}

	public String getModified_ip() {
		return modified_ip;
	}

	public void setModified_ip(String modified_ip) {
		this.modified_ip = modified_ip;
	}

	
    
    
}
