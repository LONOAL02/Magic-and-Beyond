package com.proyecto.features;

import com.proyecto.inventario.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    public  List<Item> listaItems;

    public Inventario() {
        listaItems = new ArrayList<>();
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void agregarItem(Item item) {
        if (listaItems.contains(item)) {
            Item itemExistente = listaItems.get(listaItems.indexOf(item));
            itemExistente.setCantidad(itemExistente.getCantidad() + item.getCantidad());
        } else {
            listaItems.add(item);
        }
    }

    public void eliminarItem(Item item) {
        listaItems.remove(item);
    }

    public void vaciarInventario(){
        listaItems.clear();
    }

    public void actualizarCantidad(Item item, int cantidad) {
        item.setCantidad(cantidad);
    }

    public void guardarInventario() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventario.txt"))) {
            for (Item item : listaItems) {
                writer.write(item.getNombre() + ";" + item.getDescripcion().replace("\n", "\\n") + ";" + item.getCantidad()+";"+item.getUso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    public void cargarInventario() {
        listaItems.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("inventario.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campos = line.split(";");
                String nombre = campos[0];
                String descripcion = campos[1].replaceAll("\\\\n", "\n");
                int cantidad = Integer.parseInt(campos[2]);
                int uso = Integer.parseInt(campos[3]);
                Item item = new Item(nombre, descripcion, cantidad,uso);
                listaItems.add(item);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el inventario: " + e.getMessage());
        }
    }

    public String[] obtenerNombresComoArray() {
        String[] nombres = new String[listaItems.size()];
        for (int i = 0; i < listaItems.size(); i++) {
            nombres[i] = listaItems.get(i).getNombre();
        }
        return nombres;
    }

    public String mostrarValores(String nombreBuscado) {
        for (Item item : listaItems) {
            if (item.getNombre().equals(nombreBuscado)) {
                return "\nNombre: "+item.getNombre()+"\nDescripción: \n"+item.getDescripcion()+"\nCantidad: "+item.getCantidad();
            }
        }
        return "item no encontrado";
    }

    public int getUso(String nombreBuscado) {
        for (Item item : listaItems) {
            if (item.getNombre().equals(nombreBuscado)) {
                return item.getUso();
            }
        }
        return 0;
    }

    public ArrayList<Item> getListaPorUso(int uso){
        ArrayList<Item> listaPorUso = new ArrayList<>();
        for (Item item : listaItems){
            if (item.getUso()==uso){
                listaPorUso.add(item);
            }
        }
        return listaPorUso;
    }

    public int getCantidad(String nombreBuscado) {
        for (Item item : listaItems) {
            if (item.getNombre().equals(nombreBuscado)) {
                return item.getCantidad();
            }
        }
        return 0;
    }
    public void limpiarInventario() {
        for (Item item : listaItems) {
            if (item.getCantidad() == 0) {
                eliminarItem(item);
            }
        }
    }
}