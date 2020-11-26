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
    private String userId;

    @Column(name = "nama_pengguna", length = 50)
    private String namaPengguna;

    @Column(name = "otoritas", length = 15)
    private String otoritas;

    @Column(name = "kata_sandi", length = 255)
    private String kataSandi;

    @Column(name = "email", length = 100)
    private int email;

    @Column(name = "kontak", length = 15)
    private String kontak;

    @Column(name = "aktif")
    private int aktif;

    @Column(name = "status", length = 50)
    private int status;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "create_at")
    private LocalDateTime createAt ;

    @UpdateTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "modified_at")
    private LocalDateTime modifiedAt ;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "create_ip")
    private  String createIp;

    @Column(name = "modified_ip")
    private  String modifiedIp;

	public ManajemenPenggunaModel() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNamaPengguna() {
		return namaPengguna;
	}

	public void setNamaPengguna(String namaPengguna) {
		this.namaPengguna = namaPengguna;
	}

	public String getOtoritas() {
		return otoritas;
	}

	public void setOtoritas(String otoritas) {
		this.otoritas = otoritas;
	}

	public String getKataSandi() {
		return kataSandi;
	}

	public void setKataSandi(String kataSandi) {
		this.kataSandi = kataSandi;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public String getKontak() {
		return kontak;
	}

	public void setKontak(String kontak) {
		this.kontak = kontak;
	}

	public int getAktif() {
		return aktif;
	}

	public void setAktif(int aktif) {
		this.aktif = aktif;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreateIp() {
		return createIp;
	}

	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}

	public String getModifiedIp() {
		return modifiedIp;
	}

	public void setModifiedIp(String modifiedIp) {
		this.modifiedIp = modifiedIp;
	}
    
	
    
}
