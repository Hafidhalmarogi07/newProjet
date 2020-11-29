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
@Table(name = "manajemen_pengguna_tbl")

public class ManajemenPenggunaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "user_id", length = 20)
    private String user_id;

    @Column(name = "nama_pengguna", length = 50)
    private String nama_pengguna;

    @Column(name = "otoritas", length = 15)
    private String otoritas;

    @Column(name = "kata_sandi", length = 255)
    private String kata_sandi;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "kontak", length = 15)
    private String kontak;

    @Column(name = "aktif")
    private String aktif;

    @Column(name = "status", length = 50)
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

	public ManajemenPenggunaModel() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNama_pengguna() {
		return nama_pengguna;
	}

	public void setNama_pengguna(String nama_pengguna) {
		this.nama_pengguna = nama_pengguna;
	}

	public String getOtoritas() {
		return otoritas;
	}

	public void setOtoritas(String otoritas) {
		this.otoritas = otoritas;
	}

	public String getKata_sandi() {
		return kata_sandi;
	}

	public void setKata_sandi(String kata_sandi) {
		this.kata_sandi = kata_sandi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKontak() {
		return kontak;
	}

	public void setKontak(String kontak) {
		this.kontak = kontak;
	}

	public String getAktif() {
		return aktif;
	}

	public void setAktif(String aktif) {
		this.aktif = aktif;
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
