package dominio;

import java.sql.Date;

import org.joda.time.LocalDate;

import dominio.Compra.Estado;

public class Venta {
public enum Estado {NUEVO, ANULADA, CANCELADA}	
	
	private String concepto;	
	private int numero;
	private LocalDate fechaEmision;
	private String empresa;
	private double subtotal;
	private double igv;
	private double total;
	private String moneda;
	private LocalDate fechaVencimiento;
	private LocalDate fechaPago;
	private dominio.Venta.Estado estado;
	private String observaciones;	   

	
    public Venta(String pconcepto,int pnumero,LocalDate fechaEmision2,String pempresa,double psubtotal,double pigv,double ptotal,String pmoneda,LocalDate fechaVencimiento2,LocalDate fechaPago2,dominio.Venta.Estado nuevo,String pobservaciones) {

        this.concepto = pconcepto;	       
        this.numero = pnumero;          
        this.fechaEmision = fechaEmision2;    
        this.empresa = pempresa;           
        this.subtotal = psubtotal;        
        this.igv = pigv;             
        this.total = ptotal;  
        this.moneda = pmoneda;          
        this.fechaVencimiento = fechaVencimiento2;
        this.fechaPago = fechaPago2;
        this.estado = nuevo;
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
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
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
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
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








    