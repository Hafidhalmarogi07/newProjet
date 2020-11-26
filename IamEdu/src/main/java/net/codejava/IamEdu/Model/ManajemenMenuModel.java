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
    private String namaAplikasi;

    @Column(name = "path_folder", length = 100)
    private String pathFolder;

    @Column(name = "nama_menu_us", length = 50, nullable = false)
    private String namaMenuUs;

    @Column(name = "nama_menu_kr", length = 50, nullable = false)
    private String namaMenuKr;

    @Column(name = "nama_menu_jp", length = 50, nullable = false)
    private String namaMenuJp;

    @Column(name = "nama_menu_cn", length = 50, nullable = false)
    private String namaMenuCn;

    @Column(name = "kategori_menu", length = 10, nullable = false)
    private String kategoriMenu;

    @Column(name = "url_menu")
    private String urlMenu;

    @Column(name = "aktif")
    private int aktif;

    @Column(name = "keterangan", length = 200)
    private String keterangan;

    @Column(name = "status", nullable = false)
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
    
    

	public ManajemenMenuModel() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamaAplikasi() {
		return namaAplikasi;
	}

	public void setNamaAplikasi(String namaAplikasi) {
		this.namaAplikasi = namaAplikasi;
	}

	public String getPathFolder() {
		return pathFolder;
	}

	public void setPathFolder(String pathFolder) {
		this.pathFolder = pathFolder;
	}

	public String getNamaMenuUs() {
		return namaMenuUs;
	}

	public void setNamaMenuUs(String namaMenuUs) {
		this.namaMenuUs = namaMenuUs;
	}

	public String getNamaMenuKr() {
		return namaMenuKr;
	}

	public void setNamaMenuKr(String namaMenuKr) {
		this.namaMenuKr = namaMenuKr;
	}

	public String getNamaMenuJp() {
		return namaMenuJp;
	}

	public void setNamaMenuJp(String namaMenuJp) {
		this.namaMenuJp = namaMenuJp;
	}

	public String getNamaMenuCn() {
		return namaMenuCn;
	}

	public void setNamaMenuCn(String namaMenuCn) {
		this.namaMenuCn = namaMenuCn;
	}

	public String getKategoriMenu() {
		return kategoriMenu;
	}

	public void setKategoriMenu(String kategoriMenu) {
		this.kategoriMenu = kategoriMenu;
	}

	public String getUrlMenu() {
		return urlMenu;
	}

	public void setUrlMenu(String urlMenu) {
		this.urlMenu = urlMenu;
	}

	public int getAktif() {
		return aktif;
	}

	public void setAktif(int aktif) {
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
