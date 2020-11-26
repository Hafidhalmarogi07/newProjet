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
@Table(name = "manajemen_otoritas_tbl")
public class ManajemenOtoritasModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

	    @Column(name = "nama_otoritas", length = 15)
	    private String namaOtoritas;

	    @Column(name = "pemutaran_vidio", length = 50)
	    private String pemutaranVidio;

	    @Column(name = "menu_awal", length = 50)
	    private String menuAwal;

	    @Column(name = "deskripsi")
	    private String deskripsi;

	    @Column(name = "jumlah_pengguna", length = 50)
	    private int jumlahPengguna;

	    @Column(name = "privilage", length = 15)
	    private String privilage;
	    

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
	    
	    

		public ManajemenOtoritasModel() {
			super();
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNamaOtoritas() {
			return namaOtoritas;
		}

		public void setNamaOtoritas(String namaOtoritas) {
			this.namaOtoritas = namaOtoritas;
		}

		public String getPemutaranVidio() {
			return pemutaranVidio;
		}

		public void setPemutaranVidio(String pemutaranVidio) {
			this.pemutaranVidio = pemutaranVidio;
		}

		public String getMenuAwal() {
			return menuAwal;
		}

		public void setMenuAwal(String menuAwal) {
			this.menuAwal = menuAwal;
		}

		public String getDeskripsi() {
			return deskripsi;
		}

		public void setDeskripsi(String deskripsi) {
			this.deskripsi = deskripsi;
		}

		public int getJumlahPengguna() {
			return jumlahPengguna;
		}

		public void setJumlahPengguna(int jumlahPengguna) {
			this.jumlahPengguna = jumlahPengguna;
		}

		public String getPrivilage() {
			return privilage;
		}

		public void setPrivilage(String privilage) {
			this.privilage = privilage;
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
