/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 *
 * @author marki
 */
@Entity
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_barras;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    
    @OneToMany(mappedBy = "producto")
    private Set<PedidoProducto> pedidos;

    public Producto() {
    }

    public Producto(Long cod_barras, String descripcion, BigDecimal precio, Integer stock, Set<PedidoProducto> pedidos) {
        this.cod_barras = cod_barras;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.pedidos = pedidos;
    }

    public Set<PedidoProducto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<PedidoProducto> pedidos) {
        this.pedidos = pedidos;
    }


    public Long getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(Long cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_barras != null ? cod_barras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.cod_barras == null && other.cod_barras != null) || (this.cod_barras != null && !this.cod_barras.equals(other.cod_barras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Producto[ id=" + cod_barras + " ]";
    }
    
}
