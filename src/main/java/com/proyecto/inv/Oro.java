package com.proyecto.inv;

import com.proyecto.core.FrameCombate;

public class Oro {

    public Item oro = new Item("Monedas de oro.","Monedas de oro antiguas muy preciadas por los comerciantes.",0,Item.ORO);


    public void ganarOro(int cantidad){
        if(FrameCombate.h.inventary.getCantidad("Moneda antigua")==1){
            FrameCombate.h.inventary.actualizarCantidad(oro,FrameCombate.h.inventary.getCantidad("Monedas de oro.")+(cantidad*12/10));
        }else {
            FrameCombate.h.inventary.actualizarCantidad(oro,FrameCombate.h.inventary.getCantidad("Monedas de oro.")+cantidad);
        }
    }
    public Item getOro() {
        return oro;
    }

    public void setOro(Item oro) {
        this.oro = oro;
    }
}
