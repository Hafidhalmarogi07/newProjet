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
	    private String nama_otoritas;

	    @Column(name = "pemutaran_vidio", length = 50)
	    private String pemutaran_vidio;

	    @Column(name = "menu_awal", length = 50)
	    private String menu_awal;

	    @Column(name = "deskripsi")
	    private String deskripsi;

	    @Column(name = "jumlah_pengguna", length = 50)
	    private int jumlah_pengguna;

	    @Column(name = "privilage", length = 15)
	    private String privilage;
	    

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
	    
	    

		public ManajemenOtoritasModel() {
			super();
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNama_otoritas() {
			return nama_otoritas;
		}

		public void setNama_otoritas(String nama_otoritas) {
			this.nama_otoritas = nama_otoritas;
		}

		public String getPemutaran_vidio() {
			return pemutaran_vidio;
		}

		public void setPemutaran_vidio(String pemutaran_vidio) {
			this.pemutaran_vidio = pemutaran_vidio;
		}

		public String getMenu_awal() {
			return menu_awal;
		}

		public void setMenu_awal(String menu_awal) {
			this.menu_awal = menu_awal;
		}

		public String getDeskripsi() {
			return deskripsi;
		}

		public void setDeskripsi(String deskripsi) {
			this.deskripsi = deskripsi;
		}

		public int getJumlah_pengguna() {
			return jumlah_pengguna;
		}

		public void setJumlah_pengguna(int jumlah_pengguna) {
			this.jumlah_pengguna = jumlah_pengguna;
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
