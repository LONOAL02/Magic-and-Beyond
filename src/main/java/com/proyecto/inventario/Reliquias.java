package com.proyecto.inventario;

public class Reliquias {
    public Item monedaAntigua = new Item("Moneda antigua.", "Ganas un +20% de oro extra cada vez que ganas oro.", 1, Item.RELIQUIA);
    public Item bendicionDeLaDiosa = new Item("Bendición De La Diosa.", "Reduce a la mitad el coste de mana de tus hechizos.", 1, Item.RELIQUIA);
    public Item aguaBendita = new Item("Agua Bendita.", "Te cura un 10% de vida por turno.", 1, Item.RELIQUIA);
    public Item abrigoDeSombras = new Item("Abrigo De Sombras.", " En cualquier combate puedes intentar huir con un 50% de probabilidades.", 1, Item.RELIQUIA);
    public Item dagaEnsangrentada = new Item("Daga Ensangrentada.", "Te aumenta un 15% tu probabilidad de golpe crítico.", 1, Item.RELIQUIA);
    public Item espírituIndomable = new Item("Espíritu Indomable.", "Te permite atacar dos veces en el mismo turno.", 1, Item.RELIQUIA);
    public Item brazaleteArcano = new Item("Brazalete Arcano.", "Aumenta tu maná máximo en 100 .", 1, Item.RELIQUIA);
    public Item tarjetaVip = new Item("Tarjeta Vip.", "Ganas un descuento del 20% en todas tus compras de la tienda.", 1, Item.RELIQUIA);
    public Item píldoraDeCrecimiento = new Item("Píldora de Crecimiento.", "Subes de nivel.", 1, Item.RELIQUIA);
    public Item cotaDeMalla = new Item("Cota De Malla .", "Recibes 30 menos de daño por ataque.", 1, Item.RELIQUIA);
    public Item mascaraDemoníaca = new Item("Máscara Demoníaca.", "Infliges 100 de daño a todos los enemigos al entrar en combate.", 1, Item.RELIQUIA);
    public Item corazónDorado = new Item("Corazón dorado.", "Obtienes 75 de vida máxima.", 1, Item.RELIQUIA);

public Item RelEspeciales(int Npc){
    Item tipo=null;
    switch (Npc) {
        case 1:
            tipo=aguaBendita;

            break;
        case 2:
            tipo=monedaAntigua;
           break;
        case 3:
            tipo=espírituIndomable;

            break;
        case 4:
            tipo=bendicionDeLaDiosa;

            break;
        case 5:
            tipo=abrigoDeSombras;

            break;
        case 6:
            tipo=dagaEnsangrentada;

            break;
    }
    return tipo;
}
    public Item RelNormales(int numReliquia){
    Item reliquia = null;
        switch (numReliquia) {
            case 1:
                reliquia=brazaleteArcano;

                break;
            case 2:
                reliquia=tarjetaVip;
                break;
            case 3:
                reliquia=píldoraDeCrecimiento;

                break;
            case 4:
                reliquia=cotaDeMalla;

                break;
            case 5:
                reliquia=mascaraDemoníaca;

                break;
            case 6:
                reliquia=corazónDorado;

                break;
        }
        return reliquia;
    }
}
