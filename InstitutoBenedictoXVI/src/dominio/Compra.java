

package dominio;

import java.sql.Date;


public class Compra {
public enum Estado {NUEVO, ANULADA, CANCELADA}	
	
	private String concepto;	
	private int numero;
	private Date fechaEmision;
	private String empresa;
	private double subtotal;
	private double igv;
	private double total;
	private String moneda;
	private Date fechaVencimiento;
	private Date fechaPago;
	private Estado estado;
	private String observaciones;	   

	
    public Compra(String pconcepto,int pnumero,Date pfechaEmision,String pempresa,double psubtotal,double pigv,double ptotal,String pmoneda,Date pfechaVencimiento,Date pfechaPago,Estado pestado,String pobservaciones) {

        this.concepto = pconcepto;	       
        this.numero = pnumero;          
        this.fechaEmision = pfechaEmision;    
        this.empresa = pempresa;           
        this.subtotal = psubtotal;        
        this.igv = pigv;             
        this.total = ptotal;  
        this.moneda = pmoneda;          
        this.fechaVencimiento = pfechaVencimiento;
        this.fechaPago = pfechaPago;
        this.estado = pestado;
        this.observaciones = pobservaciones;
    }

	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}








    